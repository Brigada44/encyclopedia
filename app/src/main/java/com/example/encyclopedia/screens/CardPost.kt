package com.example.encyclopedia.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.encyclopedia.R
import com.example.encyclopedia.ui.theme.Shapes

@Preview(showBackground = true)
@Composable
fun CardPost(){
    val colorText = Color.Black.copy(0.6f)
    val img = painterResource(id = R.drawable.post)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .graphicsLayer {
                shadowElevation = 8.dp.toPx()
                shape = RoundedCornerShape(25.dp)
                clip = true
            }
            .width(300.dp)
            .height(300.dp),
        )
    {
        Image(
            painter = img,
            contentDescription = "null",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
            )
        Box(
            modifier = Modifier .graphicsLayer {
                shape = RoundedCornerShape(10.dp)
                clip = true
            }
                .align(Alignment.BottomStart)
        ) {
            TextCard()
        }
    }
}

@Composable
fun TextCard(){
    val colorText = Color.Black.copy(0.6f)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorText),
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Text(text = "How to find out the gender of a puppy",
                modifier = Modifier.padding(top = 10.dp,start = 10.dp),
                color = Color.White,
            )
            Text(text = "The gender of the puppy is quite obvious if you know a few of the anatomical features of the dogs...",
                modifier = Modifier.padding(top = 3.dp,start = 10.dp),
                color = Color.White
            )
        }
}

