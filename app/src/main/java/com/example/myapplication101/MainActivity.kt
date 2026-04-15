package com.example.myapplication101

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication101.ui.pages.authentication.forgotpassword.ForgotPasswordScreen
import com.example.myapplication101.ui.pages.authentication.login.LoginScreen
import com.example.myapplication101.ui.pages.authentication.registration.SignUpScreen
import com.example.myapplication101.ui.theme.MyApplication101Theme

// Samza Mwalo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplication101Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    LoginScreen()
//                    ForgotPasswordScreen()
                    SignUpScreen()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplication101Theme {

    }
}