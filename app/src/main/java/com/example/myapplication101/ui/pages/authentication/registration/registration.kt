package com.example.myapplication101.ui.pages.authentication.registration

import androidx.benchmark.traceprocessor.Row
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
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.navigation.NavHostController
import com.example.myapplication101.R
import com.example.myapplication101.ui.components.pagePadding
import com.example.myapplication101.ui.navigation.ROUTES
import com.example.myapplication101.ui.theme.primaryColor
import com.example.myapplication101.ui.theme.secondaryColor

@Composable
fun SignUpScreen(navController: NavHostController, modifier: Modifier) {
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue()) }
    var confirmPasswordInput by remember { mutableStateOf(TextFieldValue()) }
    var isVisible by remember { mutableStateOf(false) }
    var isChecked by remember { mutableStateOf(false) } // for the checkbox

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(pagePadding).fillMaxSize()
    ) {
        // Welcome message / page title
        Text(
            text = "Create an Account",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(13.dp))

        // Name input
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.AccountCircle, //this is because I am using android resourses
                    contentDescription = "name",
                    tint = primaryColor
                )
            },
            placeholder = {
                Text(
                    text = "Enter you full name"
                )
            },
            maxLines = 1,
            label = {
                Text(
                    text = "Your Name"
                )
            },
            shape = RoundedCornerShape(20.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = secondaryColor,
                unfocusedBorderColor = primaryColor
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(5.dp))

        // email input
        OutlinedTextField(
            value = emailInput,
            onValueChange = { emailInput = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Email, //this is because I am using android resourses
                    contentDescription = "Email",
                    tint = primaryColor
                )
            },
            placeholder = {
                Text(text = "name@example.com")
            },
            maxLines = 1,
            label = {
                Text(text = "Email Address")
            },
            shape = RoundedCornerShape(20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = secondaryColor,
                unfocusedBorderColor = primaryColor
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(5.dp))

        // create password
        OutlinedTextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.passwordicon), //this is because i am using a resource that is local
                    contentDescription = "password",
                    tint = primaryColor
                )
            },
            placeholder = {
                Text(text = "********")
            },
            maxLines = 1,
            shape = RoundedCornerShape(20.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = secondaryColor,
                unfocusedBorderColor = primaryColor
            ),
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
        Spacer(modifier = Modifier.height(5.dp))

        // confirm password
        OutlinedTextField(
            value = confirmPasswordInput,
            onValueChange = { confirmPasswordInput = it },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.passwordicon), //this is because i am using a resource that is local
                    contentDescription = "password",
                    tint = primaryColor
                )
            },
            placeholder = {
                Text(text = "********")
            },
            maxLines = 1,
            shape = RoundedCornerShape(20.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = secondaryColor,
                unfocusedBorderColor = primaryColor
            ),
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
        Spacer(modifier = Modifier.height(5.dp))

        // terms and condition check button
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = isChecked,
                onCheckedChange = { isChecked = it } // Update state on click
            )
            Text(
                text = "I agree to the terms and conditions"
            )
        }
        Spacer(modifier = Modifier.height(5.dp))

        // "register now" button
        OutlinedButton(
            onClick = {},
            enabled = isChecked,
            border = ButtonDefaults.outlinedButtonBorder(enabled = false),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = primaryColor,
                contentColor = Color(0xFFFFFFFF)
            )
        ) {
            Text(text = "Register",
                modifier = Modifier.padding(horizontal = 115.dp))
        }
        // minor button -> Already have an account? Login.
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Already have an account?"
            )

            TextButton(
                onClick = { navController.navigate(ROUTES.Login.name) }
            ) {
                Text(text="Log in.",
                    style = TextStyle(
                        fontSize = 16.sp,
                    ))
            }
        }

    }
}


