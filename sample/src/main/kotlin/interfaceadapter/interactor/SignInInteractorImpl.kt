package main.kotlin.interfaceadapter.interactor

import main.kotlin.domain.gateway.interactor.SignInInteractor
import main.kotlin.domain.gateway.repository.UserRepository
import main.kotlin.domain.usecase.Error
import main.kotlin.domain.usecase.signin.Input
import main.kotlin.domain.usecase.signin.Output
import main.kotlin.domain.usecase.signin.UserCaseImpl

class SignInInteractorImpl(
        override val userCase: UserCaseImpl,
        override val repository: UserRepository
) : SignInInteractor {

    override fun signIn(): Pair<Output?, Error?> {

        /* todo パラメータの検証 */
        val input = Input("id", "password")

        return Pair(userCase(repository, input), null)
    }

}