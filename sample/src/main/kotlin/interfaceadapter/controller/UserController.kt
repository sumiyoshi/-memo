package main.kotlin.interfaceadapter.controller

import main.kotlin.interfaceadapter.adapter.operator.user.SignInOperatorImpl
import main.kotlin.interfaceadapter.adapter.operator.user.SignUpOperatorImpl
import main.kotlin.interfaceadapter.adapter.receiver.UserReceiverImpl
import main.kotlin.interfaceadapter.adapter.sender.UserSenderImpl
import main.kotlin.domain.usecase.signin.UserCaseImpl as signInUserCaseImpl
import main.kotlin.domain.usecase.signup.UserCaseImpl as signUpUserCaseImpl

class UserController {

    private val userSender = UserSenderImpl()
    private val userReceiver = UserReceiverImpl()

    fun signInAction(): Any? {

        //todo トランザクションはコントローラで

        val interactor = SignInOperatorImpl(signInUserCaseImpl(), userReceiver)

        val (output, errors) = interactor.signIn()

        //todo 複雑なものはoutputをプレゼンターに渡す

        return output
    }

    fun signUpAction(): Any? {

        //todo トランザクションはコントローラで

        val interactor = SignUpOperatorImpl(signUpUserCaseImpl(), userReceiver, userSender)

        val (output, errors) = interactor.signUp()

        //todo 複雑なものはoutputをプレゼンターに渡す

        return output

    }

}