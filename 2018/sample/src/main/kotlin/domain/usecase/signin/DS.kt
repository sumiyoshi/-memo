package main.kotlin.domain.usecase.signin

data class Input(
        val loginId: String,
        val password: String
)

data class Output(
        val name: String
)