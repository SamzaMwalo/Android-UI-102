package com.example.myapplication101.ui.pages.authentication.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieCompositionSpec.RawRes
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.myapplication101.R
import com.example.myapplication101.ui.components.LottieAnimationWidget
import com.example.myapplication101.ui.components.pagePadding
import com.example.myapplication101.ui.theme.primaryColor
import com.example.myapplication101.ui.theme.secondaryColor
import kotlin.math.round


@Composable
fun LoginScreen() {
    // text input
    var emailInput by remember{ mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue())}
    var isVisible by remember { mutableStateOf(false) }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(pagePadding).fillMaxSize()
    )
    {
// lottie animation
        LottieAnimationWidget(R.raw.auth_login,150.dp)
        Spacer(modifier= Modifier.height(40.dp))

// welcome message
        Text(
            text = "Welcome Back!",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = primaryColor
            )
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
        Spacer(modifier= Modifier.height(15.dp))

// password input
        OutlinedTextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            leadingIcon ={
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.passwordicon), //this is because i am using a resource that is local
                    contentDescription = "Password",
                    tint = primaryColor
                )
            },
            placeholder = {
                Text(text="********")
            },
            maxLines = 1,
            shape = RoundedCornerShape(20.dp),
            visualTransformation = if (isVisible) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },
            trailingIcon = {
                IconButton(
                    onClick = { isVisible = !isVisible }
                ) {
                    if (isVisible) {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.seepassword),
                            contentDescription = "Password"
                        )
                    } else {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.baseline_visibility_off_24),
                            contentDescription = "Password"
                        )
                    }
                }
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier= Modifier.height(30.dp))

// button
        OutlinedButton(
            onClick = {},
            border = ButtonDefaults.outlinedButtonBorder( enabled = false ),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = primaryColor,
                contentColor = Color(0xFFFFFFFF)
            )
        ) {
            Text(text = "Log in",
                 modifier = Modifier.padding(horizontal = 120.dp))
        }
        Spacer(modifier= Modifier.height(5.dp))

        // row
        TextButton(
        onClick = {}
        ) {
            Text(text="Forgot Password?",
                style = TextStyle(
                    fontSize = 11.sp,
                ))
        }
        Spacer(modifier= Modifier.height(25.dp))

        OutlinedButton(
            onClick = {}
        ) {
            Text(text = "Create new account",
                modifier = Modifier.padding(horizontal = 72.dp))
        }
    }
}


