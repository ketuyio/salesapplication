package com.example.myscreens.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myscreens.R
import com.example.myscreens.data.AuthViewModel
import com.example.myscreens.navigation.SIGNUP1_URL
import com.example.myscreens.ui.theme.MyScreensTheme

@Composable
fun LoginScreen2(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.register),
                contentDescription = "register icon",
                modifier = Modifier
                    .size(200.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Log in to to your Account",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = email,
            onValueChange = {email=it} ,
            placeholder = { Text(text = "email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        Spacer(modifier = Modifier.height(10.dp))


        TextField(
            value = password,
            onValueChange = {password=it} ,
            placeholder = { Text(text = "password")},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "email") },
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

        )
        Spacer(modifier = Modifier.height(30.dp))
        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)


        Row {
            Button(onClick = {
                authViewModel.login(email, password)
            },
                modifier = Modifier.width(150.dp)) {
                Text(text = "Login")
            }
            Spacer(modifier = Modifier.width(20.dp))

            Button(onClick = {
                navController.navigate(SIGNUP1_URL)
            }) {
                Text(text = "Register instead")
            }
        }

    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreen2Preview(){
    MyScreensTheme {
        LoginScreen2(navController = rememberNavController())
    }
}