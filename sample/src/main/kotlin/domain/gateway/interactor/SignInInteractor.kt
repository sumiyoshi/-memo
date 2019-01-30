package main.kotlin.domain.gateway.interactor

import main.kotlin.domain.gateway.repository.UserRepository
import main.kotlin.domain.usecase.signin.Output
import main.kotlin.domain.usecase.signin.UserCase

interface SignInInteractor {

    val userCase: UserCase

    val repository: UserRepository

    fun signIn(): Output?
}