package main.kotlin.domain.gateway.operator

import main.kotlin.domain.gateway.receiver.UserReceiver
import main.kotlin.domain.gateway.sender.UserSender
import main.kotlin.domain.usecase.Error
import main.kotlin.domain.usecase.signup.Output
import main.kotlin.domain.usecase.signup.UserCase

interface SignUpOperator {

    val userCase: UserCase

    val receiver: UserReceiver

    val sender: UserSender

    fun signUp(): Pair<Output?, Error?>
}