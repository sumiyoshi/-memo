package main.kotlin.domain.gateway.receiver

import main.kotlin.domain.entity.User

interface UserReceiver {

    fun find(id: Int): User?

    fun findByIdAndPassword(loginId: String, password: String): User?

}