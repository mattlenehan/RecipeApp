package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            loadUi()
        }
    }

    @Composable
    fun loadUi() {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(0xFFF2F2F2))
        ) {
            item {
                Image(
                    painter = painterResource(id = R.drawable.ic_structuredavailability),
                    contentDescription = "Happy Meal",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop
                )
            }
            item {
                Text(
                    text = "Happy Meal",
                    style = TextStyle(
                        fontSize = 26.sp
                    )
                )
            }
            item {
                Spacer(modifier = Modifier.padding(top = 8.dp))
            }
            item {
                Text(
                    text = "800 calories",
                    style = TextStyle(
                        fontSize = 17.sp
                    )
                )
            }
            item {
                Spacer(modifier = Modifier.padding(top = 8.dp))
            }
            item {
                Text(
                    text = "$5.99",
                    style = TextStyle(
                        color = Color(0xFF85bb65),
                        fontSize = 17.sp
                    )
                )
            }
        }
    }


}

