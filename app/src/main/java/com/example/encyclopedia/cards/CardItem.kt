package com.example.encyclopedia.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.encyclopedia.R

@Composable
fun CardItem(){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .clickable {  }
            .graphicsLayer {
                shadowElevation = 8.dp.toPx()
                shape = RoundedCornerShape(10.dp)
                clip = true
            }
            .background(Color.Gray),
        verticalAlignment = Alignment.CenterVertically

    ){
        Color
        val img = painterResource(id = R.drawable.card_item)
        Image(
            painter = img ,
            contentDescription = "Rose" ,
            modifier = Modifier
                .padding(start = 10.dp)
                .size(70.dp)
                .graphicsLayer {
                    shadowElevation = 8.dp.toPx()
                    shape = RoundedCornerShape(15.dp)
                    clip = true
                })
        Column(modifier = Modifier.padding(start = 20.dp)) {
            Text(text = "Rose",
            style = TextStyle(
                fontSize = 24.sp,
                color = Color.White
            )
            )
            Text(text = "Woody perennial flowering plant ")
        }
    }
}
fun getColor(colorString: String): Color {
    return Color(android.graphics.Color.parseColor("#" + colorString))
}