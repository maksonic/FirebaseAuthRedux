package com.maksonic.firebaseauthredux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setNavigationWithVerifyUser()
    }

    private fun setNavigationWithVerifyUser() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.screenContainer) as NavHostFragment
        val navController = navHostFragment.navController
        val navGraph =
            navController.navInflater.inflate(R.navigation.graph)
        /* If user not authorized navigation graph set start onboarding screen
           else the user is taken to the home screen.*/
     //   navGraph.setStartDestination(viewModel.validateUser())
        navController.graph = navGraph
    }
}