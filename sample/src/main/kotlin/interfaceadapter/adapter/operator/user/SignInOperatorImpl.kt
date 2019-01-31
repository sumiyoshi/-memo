package main.kotlin.interfaceadapter.adapter.operator.user

import main.kotlin.domain.gateway.operator.SignInOperator
import main.kotlin.domain.gateway.receiver.UserReceiver
import main.kotlin.domain.usecase.Error
import main.kotlin.domain.usecase.signin.Input
import main.kotlin.domain.usecase.signin.Output
import main.kotlin.domain.usecase.signin.UserCase

class SignInOperatorImpl(
        override val userCase: UserCase,
        override val receiver: UserReceiver
) : SignInOperator {

    override fun signIn(): Pair<Output?, Error?> {
        /* todo パラメータの検証 */
        val input = Input("id", "password")

        return Pair(userCase(receiver, input), null)
    }

}