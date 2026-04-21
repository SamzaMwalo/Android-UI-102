package com.example.myapplication101.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication101.ui.pages.authentication.forgotpassword.ForgotPasswordScreen
import com.example.myapplication101.ui.pages.authentication.login.LoginScreen
import com.example.myapplication101.ui.pages.authentication.registration.SignUpScreen
import com.example.myapplication101.ui.pages.onboarding.OnboardingScreen

@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController = navController,
        startDestination = ROUTES.Onboarding.name
    ) {
        composable (ROUTES.Onboarding.name) { OnboardingScreen(navController) }
        composable (ROUTES.Login.name) { LoginScreen(navController, modifier) }
        composable (ROUTES.SignUp.name) { SignUpScreen(navController, modifier) }
        composable (ROUTES.ForgotPassword.name) { ForgotPasswordScreen(navController, modifier) }
    }
}
