package main.kotlin.domain.gateway.repository

import main.kotlin.domain.entity.User

interface UserRepository {

    fun find(id: Int): User?

    fun findByIdAndPassword(loginId: String, password: String): User?

    fun save(user: User): Int

}