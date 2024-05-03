package com.example.myscreens.ui.theme.screens.files

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myscreens.R
import com.example.myscreens.navigation.STUDENTS_URL
import com.example.myscreens.ui.theme.MyScreensTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TutorsScreen(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        val mContext = LocalContext.current

        //top up bar
        TopAppBar(title = { Text(text = "Tutors", color = Color.Black,
            textAlign = TextAlign.Center) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(STUDENTS_URL)
                }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.Black
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notification",
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.Black
                    )
                }

            }
        )
        //end of top up bar
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "LET'S FIND YOU A TUTOR",
            fontFamily = FontFamily.Serif,
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(30.dp))

        Spacer(modifier = Modifier.height(20.dp))

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
                .border(
                    width = 2.dp,
                    color = Color.Black,
                    shape = CircleShape
                )
                .fillMaxWidth()
        )

        //end of searchbar
        Spacer(modifier = Modifier.height(30.dp))
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Box(modifier = Modifier
                .padding(start = 10.dp)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.math),
                    contentDescription = "Nairobi exchange",
                    modifier = Modifier
                        .background(Color.Cyan)
                        .clip(shape = CircleShape)
                        .size(100.dp),
                    contentScale = ContentScale.Crop)
            }
            Spacer(modifier = Modifier.width(20.dp))

            Box(modifier = Modifier
                .padding(start = 10.dp)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.biology),
                    contentDescription = "Nairobi exchange",
                    modifier = Modifier
                        .background(Color.Green)
                        .clip(shape = CircleShape)
                        .size(100.dp),
                    contentScale = ContentScale.Crop)
            }
            Spacer(modifier = Modifier.width(20.dp))

            Box(modifier = Modifier
                .padding(start = 10.dp)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.chemistry),
                    contentDescription = "Nairobi exchange",
                    modifier = Modifier
                        .background(Color.Magenta)
                        .clip(shape = CircleShape)
                        .size(100.dp),
                    contentScale = ContentScale.Crop)
            }
            Spacer(modifier = Modifier.width(20.dp))

            Box(modifier = Modifier
                .padding(start = 10.dp)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.physics),
                    contentDescription = "Nairobi exchange",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .clip(shape = CircleShape)
                        .size(100.dp),
                    contentScale = ContentScale.Crop)
            }
            Spacer(modifier = Modifier.width(30.dp))
        }
        Spacer(modifier = Modifier.height(30.dp))

        Column {
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {

                //card 1
                Card(
                    modifier = Modifier
                        .height(450.dp)
                        .width(250.dp)
                ) {
                    Column {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.physics),
                                contentDescription = "Nairobi exchange",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .clip(shape = CircleShape)
                                    .size(80.dp),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "George Kingston",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                                Text(text = "Mathematics tutor")
                            }


                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Box(
                            modifier = Modifier
                                .height(250.dp)
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.physics),
                                contentDescription = "picture",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        Spacer(modifier = Modifier.height(10.dp))

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
                                    .width(110.dp)
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
                                    .width(110.dp)
                                    .height(60.dp)
                                    .padding(start = 10.dp)
                            ) {
                                Text(text = "CALL")


                            }
                        }
                    }
                }
                //end of card
                Spacer(modifier = Modifier.width(20.dp))
                //card 1
                Card(
                    modifier = Modifier
                        .height(450.dp)
                        .width(250.dp)
                ) {
                    Column {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.physics),
                                contentDescription = "Nairobi exchange",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .clip(shape = CircleShape)
                                    .size(80.dp),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "George Kingston",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                                Text(text = "Mathematics tutor")
                            }


                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Box(
                            modifier = Modifier
                                .height(250.dp)
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.physics),
                                contentDescription = "picture",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        Spacer(modifier = Modifier.height(10.dp))

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
                                    .width(110.dp)
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
                                    .width(110.dp)
                                    .height(60.dp)
                                    .padding(start = 10.dp)
                            ) {
                                Text(text = "CALL")


                            }
                        }
                    }
                }
                //end of card
                Spacer(modifier = Modifier.width(20.dp))
                //card 1
                Card(
                    modifier = Modifier
                        .height(450.dp)
                        .width(250.dp)
                ) {
                    Column {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.physics),
                                contentDescription = "Nairobi exchange",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .clip(shape = CircleShape)
                                    .size(80.dp),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "George Kingston",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                                Text(text = "Mathematics tutor")
                            }


                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Box(
                            modifier = Modifier
                                .height(250.dp)
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.physics),
                                contentDescription = "picture",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        Spacer(modifier = Modifier.height(10.dp))

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
                                    .width(110.dp)
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
                                    .width(110.dp)
                                    .height(60.dp)
                                    .padding(start = 10.dp)
                            ) {
                                Text(text = "CALL")


                            }
                        }
                    }
                }
                //end of card
                Spacer(modifier = Modifier.width(20.dp))
                //card 1
                Card(
                    modifier = Modifier
                        .height(450.dp)
                        .width(250.dp)
                ) {
                    Column {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.physics),
                                contentDescription = "Nairobi exchange",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .clip(shape = CircleShape)
                                    .size(80.dp),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "George Kingston",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                                Text(text = "Mathematics tutor")
                            }


                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Box(
                            modifier = Modifier
                                .height(250.dp)
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.physics),
                                contentDescription = "picture",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        Spacer(modifier = Modifier.height(10.dp))

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
                                    .width(110.dp)
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
                                    .width(110.dp)
                                    .height(60.dp)
                                    .padding(start = 10.dp)
                            ) {
                                Text(text = "CALL")


                            }
                        }
                    }
                }
                //end of card
                Spacer(modifier = Modifier.width(20.dp))
                //card 1
                Card(
                    modifier = Modifier
                        .height(450.dp)
                        .width(250.dp)
                ) {
                    Column {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.physics),
                                contentDescription = "Nairobi exchange",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .clip(shape = CircleShape)
                                    .size(80.dp),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "George Kingston",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                                Text(text = "Mathematics tutor")
                            }


                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Box(
                            modifier = Modifier
                                .height(250.dp)
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.physics),
                                contentDescription = "picture",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        Spacer(modifier = Modifier.height(10.dp))

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
                                    .width(110.dp)
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
                                    .width(110.dp)
                                    .height(60.dp)
                                    .padding(start = 10.dp)
                            ) {
                                Text(text = "CALL")


                            }
                        }
                    }
                }
                //end of card
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun TutorsVideoScreenPreview(){
    MyScreensTheme {
        TutorsScreen(navController = rememberNavController())
    }
}