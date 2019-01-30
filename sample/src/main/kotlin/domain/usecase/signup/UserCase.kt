package main.kotlin.domain.usecase.signup

import main.kotlin.domain.gateway.repository.UserRepository

interface UserCase {

    operator fun invoke(
            repository: UserRepository,
            input: Input
    ): Output?
}