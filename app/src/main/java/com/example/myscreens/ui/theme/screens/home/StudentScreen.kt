package com.example.myscreens.ui.theme.screens.home

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myscreens.R
import com.example.myscreens.ui.theme.MyScreensTheme

@Composable
fun HomeScreen(navController:NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        val mContext = LocalContext.current
        //search bar

        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            placeholder = { Text(text = "Search") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "searchbar"
                )
            },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
                .border(width = 2.dp, color = Color.Black, shape = CircleShape)
                .fillMaxWidth()
        )

        //end of searchbar
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Recent",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //card one

            Card(
                modifier = Modifier
                    .height(150.dp)
                    .width(200.dp)){
                Column {
                    Box(modifier = Modifier
                        .height(120.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.maths),
                            contentDescription ="picture",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                }
                Text(
                    text = "Mathematics",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            //end of card
            Spacer(modifier = Modifier.width(10.dp))
            //card two

            Card(
                modifier = Modifier
                    .height(150.dp)
                    .width(200.dp)){
                Column {
                    Box(modifier = Modifier
                        .height(120.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.chemistry),
                            contentDescription ="picture",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                }
                Text(
                    text = "Chemistry",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            //end of card
            Spacer(modifier = Modifier.width(10.dp))
            //card three

            Card(
                modifier = Modifier
                    .height(150.dp)
                    .width(200.dp)){
                Column {
                    Box(modifier = Modifier
                        .height(120.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.biology),
                            contentDescription ="picture",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                }
                Text(
                    text = "Biology",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            //end of card
            Spacer(modifier = Modifier.width(10.dp))
            //card four

            Card(
                modifier = Modifier
                    .height(150.dp)
                    .width(200.dp)){
                Column {
                    Box(modifier = Modifier
                        .height(120.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.physics),
                            contentDescription ="picture",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                }
                Text(
                    text = "Physics",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            //end of card
            Spacer(modifier = Modifier.width(10.dp))
            //card five

            Card(
                modifier = Modifier
                    .height(150.dp)
                    .width(200.dp)){
                Column {
                    Box(modifier = Modifier
                        .height(120.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.english),
                            contentDescription ="picture",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                }
                Text(
                    text = "English",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            //end of card


        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Subjects",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
        )

        //row 1
        Spacer(modifier = Modifier.height(5.dp))


        Row {
            OutlinedButton(
                onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(
                        Intent.EXTRA_EMAIL,
                        arrayOf("akinyiglory2@gmail.com")
                    )
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(
                        Intent.EXTRA_TEXT,
                        "Hello, this is the email body"
                    )
                    mContext.startActivity(shareIntent)
                },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(190.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
            ) {
                Text(text = "EMAIL")

            }


            OutlinedButton(
                onClick = {
                    val callIntent = Intent(Intent.ACTION_DIAL)
                    callIntent.data = "tel:0720245837".toUri()
                    mContext.startActivity(callIntent)
                },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(190.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
            ) {
                Text(text = "CALL")


            }
        }
        //end of row
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            OutlinedButton(
                onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(
                        Intent.EXTRA_EMAIL,
                        arrayOf("akinyiglory2@gmail.com")
                    )
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(
                        Intent.EXTRA_TEXT,
                        "Hello, this is the email body"
                    )
                    mContext.startActivity(shareIntent)
                },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(190.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
            ) {
                Text(text = "EMAIL")

            }


            OutlinedButton(
                onClick = {
                    val callIntent = Intent(Intent.ACTION_DIAL)
                    callIntent.data = "tel:0720245837".toUri()
                    mContext.startActivity(callIntent)
                },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(190.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
            ) {
                Text(text = "CALL")


            }
        }
        //end of row

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            OutlinedButton(
                onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(
                        Intent.EXTRA_EMAIL,
                        arrayOf("akinyiglory2@gmail.com")
                    )
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(
                        Intent.EXTRA_TEXT,
                        "Hello, this is the email body"
                    )
                    mContext.startActivity(shareIntent)
                },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(190.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
            ) {
                Text(text = "EMAIL")

            }


            OutlinedButton(
                onClick = {
                    val callIntent = Intent(Intent.ACTION_DIAL)
                    callIntent.data = "tel:0720245837".toUri()
                    mContext.startActivity(callIntent)
                },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(190.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
            ) {
                Text(text = "CALL")


            }
        }
        //end of row
        Spacer(modifier = Modifier.height(20.dp))

        Row {
            OutlinedButton(
                onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(
                        Intent.EXTRA_EMAIL,
                        arrayOf("akinyiglory2@gmail.com")
                    )
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(
                        Intent.EXTRA_TEXT,
                        "Hello, this is the email body"
                    )
                    mContext.startActivity(shareIntent)
                },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(190.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
            ) {
                Text(text = "EMAIL")

            }


            OutlinedButton(
                onClick = {
                    val callIntent = Intent(Intent.ACTION_DIAL)
                    callIntent.data = "tel:0720245837".toUri()
                    mContext.startActivity(callIntent)
                },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(190.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
            ) {
                Text(text = "CALL")


            }
        }
        //end of row
        Spacer(modifier = Modifier.height(20.dp))

        Row {
            OutlinedButton(
                onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(
                        Intent.EXTRA_EMAIL,
                        arrayOf("akinyiglory2@gmail.com")
                    )
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                    shareIntent.putExtra(
                        Intent.EXTRA_TEXT,
                        "Hello, this is the email body"
                    )
                    mContext.startActivity(shareIntent)
                },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(190.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
            ) {
                Text(text = "EMAIL")

            }


            OutlinedButton(
                onClick = {
                    val callIntent = Intent(Intent.ACTION_DIAL)
                    callIntent.data = "tel:0720245837".toUri()
                    mContext.startActivity(callIntent)
                },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(190.dp)
                    .height(60.dp)
                    .padding(start = 10.dp)
            ) {
                Text(text = "CALL")


            }
        }
        //end of row
        Text(text = "Education is a passport to the future, for tomorrrow belongs to those who prepare for it today!",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(5.dp))


    }

}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    MyScreensTheme {
        HomeScreen(navController = rememberNavController())
    }
}