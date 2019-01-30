package main.kotlin.domain.usecase.signup

import main.kotlin.domain.entity.User
import main.kotlin.domain.gateway.repository.UserRepository

class UserCaseImpl: UserCase {

    override operator fun invoke(
            repository: UserRepository,
            input: Input
    ): Output? {

        val user = User(null, input.loginId, input.name, input.password)
        val id = repository.save(user)

        return repository.find(id)?.let {
            Output(it.name)
        }
    }
}