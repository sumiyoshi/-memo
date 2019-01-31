package main.kotlin.interfaceadapter.adapter.receiver

import main.kotlin.domain.entity.User
import main.kotlin.domain.gateway.receiver.UserReceiver

class UserReceiverImpl: UserReceiver {

    override fun findByIdAndPassword(loginId: String, password: String): User? {
        return User(null, loginId, password, "")
    }

    override fun find(id: Int): User? {
        return User(id, "", "", "")
    }

}