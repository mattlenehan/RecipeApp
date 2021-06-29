package com.example.recipeapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipeapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    @Composable
    fun loadUi() {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(0xFFF2F2F2))
                .padding(all = 16.dp)
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
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Happy Meal",
                        style = TextStyle(
                            fontSize = 26.sp
                        )
                    )

                    Text(
                        text = "$5.99",
                        style = TextStyle(
                            color = Color(0xFF85bb65),
                            fontSize = 17.sp
                        ),
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
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
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = {},
                        modifier = Modifier.align(Alignment.CenterVertically)
                    ) {
                        Text(text = "Order Now")
                    }
                }
            }
        }
    }


}

