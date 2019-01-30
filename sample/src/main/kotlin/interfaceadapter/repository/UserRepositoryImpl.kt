package main.kotlin.interfaceadapter.repository

import main.kotlin.domain.entity.User
import main.kotlin.domain.gateway.repository.UserRepository

class UserRepositoryImpl: UserRepository {


    override fun save(user: User): Int {
        return 1
    }

    override fun findByIdAndPassword(loginId: String, password: String): User? {
        return User(null, loginId, password, "")
    }

    override fun find(id: Int): User? {
        return User(id, "", "", "")
    }
}