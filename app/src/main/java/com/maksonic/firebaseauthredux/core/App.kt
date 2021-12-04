package com.maksonic.firebaseauthredux.core

import android.app.Application
import org.koin.core.context.startKoin

/**
 * @Author: maksonic on 04.12.2021
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(coreModule)
        }
    }
}