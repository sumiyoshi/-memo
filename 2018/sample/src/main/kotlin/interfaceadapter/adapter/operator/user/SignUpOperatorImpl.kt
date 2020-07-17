package main.kotlin.interfaceadapter.adapter.operator.user

import main.kotlin.domain.gateway.operator.SignUpOperator
import main.kotlin.domain.gateway.receiver.UserReceiver
import main.kotlin.domain.gateway.sender.UserSender
import main.kotlin.domain.usecase.Error
import main.kotlin.domain.usecase.signup.Input
import main.kotlin.domain.usecase.signup.Output
import main.kotlin.domain.usecase.signup.UserCaseImpl

class SignUpOperatorImpl(
        override val userCase: UserCaseImpl,
        override val receiver: UserReceiver,
        override val sender: UserSender
        ) : SignUpOperator {

    override fun signUp(): Pair<Output?, Error?> {

        //todo パラメータの検証
        val input = Input("id", "password", "name")

        return Pair(userCase(receiver, sender, input), null)
    }

}