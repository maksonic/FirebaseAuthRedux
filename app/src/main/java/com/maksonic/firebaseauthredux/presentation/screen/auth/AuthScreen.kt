package com.maksonic.firebaseauthredux.presentation.screen.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.maksonic.firebaseauthredux.core.base.BaseFragment
import com.maksonic.firebaseauthredux.databinding.ScreenAuthBinding

/**
 * @Author: maksonic on 03.12.2021
 */
class AuthScreen : BaseFragment<ScreenAuthBinding>() {
    override val bindLayout: (LayoutInflater, ViewGroup?, Boolean) -> ScreenAuthBinding
        get() = ScreenAuthBinding::inflate


    override fun prepareView(savedInstanceState: Bundle?) {
    }
}