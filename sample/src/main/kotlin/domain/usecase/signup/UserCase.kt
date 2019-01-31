package main.kotlin.domain.usecase.signup

import main.kotlin.domain.gateway.receiver.UserReceiver
import main.kotlin.domain.gateway.sender.UserSender

interface UserCase {

    operator fun invoke(
            receiver: UserReceiver,
            sender: UserSender,
            input: Input
    ): Output?
}