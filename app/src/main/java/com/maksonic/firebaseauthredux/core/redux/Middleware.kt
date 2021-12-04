package com.maksonic.firebaseauthredux.core.redux

/**
 * @Author: maksonic on 04.12.2021
 */
interface Middleware<S : State, A : Action, E : Effect> {
    suspend fun process(action: A, currentState: S, store: Store<S, A, E>)
}
