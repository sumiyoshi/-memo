package main.kotlin.domain.usecase.signin

import main.kotlin.domain.gateway.repository.UserRepository

interface UserCase {

    operator fun invoke(
            repository: UserRepository,
            input: Input
    ): Output?

}