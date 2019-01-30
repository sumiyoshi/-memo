package main.kotlin.domain.gateway.interactor

import main.kotlin.domain.gateway.repository.UserRepository
import main.kotlin.domain.usecase.signup.Output
import main.kotlin.domain.usecase.signup.UserCase

interface SignUpInteractor {

    val userCase: UserCase

    val repository: UserRepository

    fun signUp(): Output?
}