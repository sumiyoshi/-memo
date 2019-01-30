package main.kotlin.domain.usecase.signin

import main.kotlin.domain.gateway.repository.UserRepository

class UserCase {

    operator fun invoke(
            repository: UserRepository,
            input: Input
    ): Output? {

        return repository.findByIdAndPassword(
                input.loginId,
                input.password
        )?.let {
            Output(it.name)
        }

    }

}