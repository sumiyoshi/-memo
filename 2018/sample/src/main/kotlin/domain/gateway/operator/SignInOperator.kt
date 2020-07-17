package main.kotlin.domain.gateway.operator

import main.kotlin.domain.gateway.receiver.UserReceiver
import main.kotlin.domain.usecase.Error
import main.kotlin.domain.usecase.signin.Output
import main.kotlin.domain.usecase.signin.UserCase

interface SignInOperator {

    val userCase: UserCase

    val receiver: UserReceiver

    fun signIn(): Pair<Output?, Error?>
}