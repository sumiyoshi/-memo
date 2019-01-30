package main.kotlin.interfaceadapter.interactor

import main.kotlin.domain.gateway.interactor.SignInInteractor
import main.kotlin.domain.gateway.repository.UserRepository
import main.kotlin.domain.usecase.signin.Input
import main.kotlin.domain.usecase.signin.Output
import main.kotlin.domain.usecase.signin.UserCase

class SignInInteractorImpl(
        override val userCase: UserCase,
        override val repository: UserRepository
) : SignInInteractor {

    override fun signIn(): Output? {

        //todo パラメータの検証
        val input = Input("id", "password")

        return userCase(repository, input)
    }

}