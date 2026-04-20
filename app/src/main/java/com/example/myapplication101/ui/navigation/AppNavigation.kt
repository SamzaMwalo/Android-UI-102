package com.example.myapplication101.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost

@Composable
fun AppNavigation(navController: NavController, modifier: Modifier) {

    NavHost(
        navController = navController,
        startDestination = ROUTES.Onboarding
    )  {
        composable (ROUTES.Onboarding.name) { Onboarding }
    }
}