package com.example.myscreens.ui.theme.screens.signup

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
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myscreens.R
import com.example.myscreens.data.AuthViewModel
import com.example.myscreens.navigation.LOGIN1_URL
import com.example.myscreens.ui.theme.MyScreensTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.register),
                contentDescription = "register icon",
                modifier = Modifier
                    .size(200.dp))
        }
        Text(
            text = "Signup Here",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(20.dp))

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value = name,
            onValueChange = {name = it},
            label = { Text(text = "Enter username")},
            leadingIcon = { Icon(imageVector = Icons.Default.AccountBox, contentDescription = "email") },
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text(text = "Enter email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text(text = "Enter password")},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "email") },
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(20.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Row {
            Button(onClick = {
                authViewModel.signup(name, email, password)
            },
                modifier = Modifier.width(150.dp)) {
                Text(text = "Register")
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = {
                navController.navigate(LOGIN1_URL)
            },
                modifier = Modifier.width(150.dp)) {
                Text(text = "Login instead")
            }
        }

    }
}

@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    MyScreensTheme {
        SignupScreen(navController = rememberNavController())
    }
}