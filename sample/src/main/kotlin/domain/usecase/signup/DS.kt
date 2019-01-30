package main.kotlin.domain.usecase.signup

data class Input(
        val loginId: String,
        val password: String,
        val name: String
)

data class Output(
        val name: String
)