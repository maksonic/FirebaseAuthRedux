package com.maksonic.firebaseauthredux.presentation.screen.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.maksonic.firebaseauthredux.core.base.BaseFragment
import com.maksonic.firebaseauthredux.databinding.ScreenMainBinding

/**
 * @Author: maksonic on 03.12.2021
 */
class MainScreen : BaseFragment<ScreenMainBinding>() {

    override val bindLayout: (LayoutInflater, ViewGroup?, Boolean) -> ScreenMainBinding
        get() = ScreenMainBinding::inflate

    override fun prepareView(savedInstanceState: Bundle?) {

    }
}