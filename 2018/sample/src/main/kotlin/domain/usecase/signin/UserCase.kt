package main.kotlin.domain.usecase.signin

import main.kotlin.domain.gateway.receiver.UserReceiver

interface UserCase {

    operator fun invoke(
            receiver: UserReceiver,
            input: Input
    ): Output?

}