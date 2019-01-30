package main.kotlin.interfaceadapter.controller

import main.kotlin.domain.usecase.signin.UserCaseImpl as signInUserCaseImpl
import main.kotlin.domain.usecase.signup.UserCaseImpl as signUpUserCaseImpl
import main.kotlin.interfaceadapter.interactor.*
import main.kotlin.interfaceadapter.repository.UserRepositoryImpl

class UserController {

    private val userRepository = UserRepositoryImpl()

    fun signInAction(): Any? {

        //todo トランザクションはコントローラで

        val interactor = SignInInteractorImpl(signInUserCaseImpl(), userRepository)

        val (output, errors) = interactor.signIn()

        //todo 複雑なものはoutputをプレゼンターに渡す

        return output
    }

    fun signUpAction(): Any? {

        //todo トランザクションはコントローラで

        val interactor = SignUpInteractorImpl(signUpUserCaseImpl(), userRepository)

        val (output, errors) = interactor.signUp()

        //todo 複雑なものはoutputをプレゼンターに渡す

        return output

    }

}