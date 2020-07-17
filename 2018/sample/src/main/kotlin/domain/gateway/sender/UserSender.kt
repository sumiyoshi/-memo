package main.kotlin.domain.gateway.sender

import main.kotlin.domain.entity.User

interface UserSender {

    fun save(user: User): Int

}