package main.kotlin.interfaceadapter.controller

import main.kotlin.domain.usecase.signin.UserCase as signInUserCase
import main.kotlin.domain.usecase.signup.UserCase as signUpUserCase
import main.kotlin.interfaceadapter.interactor.*
import main.kotlin.interfaceadapter.repository.UserRepositoryImpl

class UserController {

    private val userRepository = UserRepositoryImpl()

    fun signInAction(): Any? {

        //todo トランザクションはコントローラで

        val interactor = SignInInteractorImpl(signInUserCase(), userRepository)

        val output = interactor.signIn()

        //todo 複雑なものはoutputをプレゼンターに渡す

        return output
    }

    fun signUpAction(): Any? {

        //todo トランザクションはコントローラで

        val interactor = SignUpInteractorImpl(signUpUserCase(), userRepository)

        val output = interactor.signUp()

        //todo 複雑なものはoutputをプレゼンターに渡す

        return output

    }

}