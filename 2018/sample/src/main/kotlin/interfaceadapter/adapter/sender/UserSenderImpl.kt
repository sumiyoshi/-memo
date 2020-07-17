package main.kotlin.interfaceadapter.adapter.sender

import main.kotlin.domain.entity.User
import main.kotlin.domain.gateway.sender.UserSender

class UserSenderImpl: UserSender {

    override fun save(user: User): Int {
        return 1
    }

}