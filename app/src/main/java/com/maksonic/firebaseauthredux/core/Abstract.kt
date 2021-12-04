package com.maksonic.firebaseauthredux.core

/**
 * @Author: maksonic on 04.12.2021
 */
abstract class Abstract {

    interface Object<T, M : Mapper> {

        fun map(mapper: M): T
    }

    interface UiObject {
        class EmptyObject : UiObject
    }

    interface Mapper {

        interface Data<in S, out R> : Mapper {
            fun map(data: S): R
        }

        interface DataToDomain<in S, out R : Data<S, R>> {
            fun map(e: Exception): R
        }

        interface DomainToUi<S, T> : Data<S, T> {
            fun map(error: String?): T
        }

        class Empty : Mapper
    }
}