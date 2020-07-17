package main.kotlin.domain.entity

data class User(
        val id: Int?,
        val loginId: String,
        val password: String,
        val name: String
)