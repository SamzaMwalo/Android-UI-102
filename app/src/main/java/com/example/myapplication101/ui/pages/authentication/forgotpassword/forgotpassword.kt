package com.example.myapplication101.ui.pages.authentication.forgotpassword

import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication101.R
import com.example.myapplication101.ui.components.LottieAnimationWidget
import com.example.myapplication101.ui.components.pagePadding
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
        modifier = Modifier.padding(pagePadding).fillMaxSize()
    ) {
        // lottie animation
        LottieAnimationWidget(R.raw.auth_forgotpassword,160.dp)
        Spacer(modifier= Modifier.height(20.dp))

        // Brief Message
        Text(
            text = "Forgot Password?",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier= Modifier.height(5.dp))
        Text(
            text = "Enter your email address and we'll send you instructions to reset your password."
        )
        Spacer(modifier= Modifier.height(15.dp))

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
                Text(text="name@example.com")
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
        Spacer(modifier= Modifier.height(25.dp))

        // get password button
        OutlinedButton(
            onClick = {},
            border = ButtonDefaults.outlinedButtonBorder(enabled = false),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = primaryColor,
                contentColor = Color(0xFFFFFFFF)
            )
        ) {
            Text(text = "Get Password",
                modifier = Modifier.padding(horizontal = 99.dp))
        }
        Spacer(modifier= Modifier.height(25.dp))

        // minor buttons
        TextButton(
                onClick = {}
            ) {
                Text(
                    text="Back to login",
                    style = TextStyle(
                        fontSize = 16.sp,
                    )
                )
            }
    }
}
