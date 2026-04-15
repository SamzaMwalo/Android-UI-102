package com.example.myapplication101.ui.pages.authentication.forgotpassword

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.myapplication101.R
import com.example.myapplication101.ui.components.LottieAnimationWidget
import com.example.myapplication101.ui.theme.primaryColor
import com.example.myapplication101.ui.theme.secondaryColor

/*
* Structure : Column
* Features:
* */

@Composable
fun ForgotPasswordScreen(){
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        // lottie animation
        LottieAnimationWidget(R.raw.auth_forgotpassword,150.dp)

        // email input
        OutlinedTextField(
            value = emailInput,
            onValueChange = { emailInput = it },
            leadingIcon ={
                Icon(
                    imageVector = Icons.Outlined.Email, //this is because I am using android resourses
                    contentDescription = "Email",
                    tint = primaryColor
                )
            },
            placeholder = {
                Text(text="example@mail.com")
            },
            maxLines = 1,
            label = {
                Text(text = "Email Address")
            } ,
            shape = RoundedCornerShape(20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = secondaryColor,
                unfocusedBorderColor = primaryColor
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier= Modifier.height(15.dp))
        // get password button
        // minor buttons
        //
    }
}
