package com.example.myscreens.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myscreens.ui.theme.screens.home.HomeScreen
import com.example.myscreens.ui.theme.screens.home.TeachersScreen
import com.example.myscreens.ui.theme.screens.login.LoginScreen
import com.example.myscreens.ui.theme.screens.login.LoginScreen2
import com.example.myscreens.ui.theme.screens.signup.SignupScreen
import com.example.myscreens.ui.theme.screens.signup.SignupScreen1
import com.example.myscreens.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN1_URL){
            LoginScreen(navController = navController)
        }
        composable(LOGIN2_URL){
            LoginScreen2(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(SIGNUP1_URL){
            SignupScreen1(navController = navController)
        }
        composable(STUDENTS_URL){
            HomeScreen(navController = navController)
        }
        composable(TEACHERS_URL){
            TeachersScreen(navController = navController)
        }
        composable(SPLASH_URL){
            SplashScreen(navController = navController)
        }
    }
}