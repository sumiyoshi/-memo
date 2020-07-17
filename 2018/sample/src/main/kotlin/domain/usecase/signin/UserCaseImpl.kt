package main.kotlin.domain.usecase.signin

import main.kotlin.domain.gateway.receiver.UserReceiver

class UserCaseImpl: UserCase {

    override operator fun invoke(
            receiver: UserReceiver,
            input: Input
    ): Output? {

        return receiver.findByIdAndPassword(
                input.loginId,
                input.password
        )?.let {
            Output(it.name)
        }

    }

}