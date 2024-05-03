package com.example.myscreens.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.myscreens.R
import com.example.myscreens.navigation.LOGIN1_URL
import com.example.myscreens.ui.theme.MyScreensTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreen(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            //Lottie Animation
            val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.splash))
            val progress by animateLottieCompositionAsState(composition)
            LottieAnimation(
                composition, progress,
                modifier = Modifier.size(300.dp)

            )
            //end of lottie animation

        }
        Spacer(modifier = Modifier.height(20.dp))

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Column {
                Text(text = "The  ",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 20.dp))
                Text(text = "best experience",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 20.dp))
                Text(text = "imaginable",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(start = 20.dp))
            }
        }
        val coroutine = rememberCoroutineScope()
        coroutine.launch {
            delay(2000)
            navController.navigate(LOGIN1_URL)
        }


    }
}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    MyScreensTheme {
        SplashScreen(navController = rememberNavController())
    }
}