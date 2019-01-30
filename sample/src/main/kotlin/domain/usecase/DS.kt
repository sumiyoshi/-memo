package main.kotlin.domain.usecase

data class Errors(
        val errors: List<Error>
)

data class Error(
        val name: String
)