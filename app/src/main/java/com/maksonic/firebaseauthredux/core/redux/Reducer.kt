package com.maksonic.firebaseauthredux.core.redux

/**
 * @Author: maksonic on 04.12.2021
 */
interface Reducer<S : State, A : Action> {
    fun reduce(currentState: S, action: A): S
}