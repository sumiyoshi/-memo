package main.kotlin.domain.usecase.signup

import main.kotlin.domain.entity.User
import main.kotlin.domain.gateway.receiver.UserReceiver
import main.kotlin.domain.gateway.sender.UserSender

class UserCaseImpl : UserCase {

    override operator fun invoke(
            receiver: UserReceiver,
            sender: UserSender,
            input: Input
    ): Output? {

        val user = User(null, input.loginId, input.name, input.password)
        val id = sender.save(user)

        return receiver.find(id)?.let {
            Output(it.name)
        }
    }
}