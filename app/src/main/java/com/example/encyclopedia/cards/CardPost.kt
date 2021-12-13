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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.annotation.ExperimentalCoilApi
import com.example.encyclopedia.R
import com.example.encyclopedia.models.Item
import com.google.gson.Gson


@ExperimentalCoilApi
@Composable
fun CardPost(navController: NavController,item: Item){
    val colorText = Color.Black.copy(0.6f)
    val img = painterResource(item.photo)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .graphicsLayer {
                shadowElevation = 8.dp.toPx()
                shape = RoundedCornerShape(25.dp)
                clip = true
            }
            .width(300.dp)
            .height(220.dp)
            .clickable {
                var itemSer = Gson().toJson(item)
                navController.navigate("article_screen/$itemSer",)
            }
        )
    {
        Image(
            painter = img,
            contentDescription = "null",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize().size(70.dp),
            )
        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
        ) {
            TextCard(item)
        }
    }
}
var ralewayBold = FontFamily(Font(R.font.raleway_bold,FontWeight.Bold))
var ralewayNormal =FontFamily(Font(R.font.raleway_regular,FontWeight.Normal))
var openSansBold = FontFamily(Font(R.font.opensans_bold,FontWeight.Bold))
var openSansRegular = FontFamily(Font(R.font.openoans_regular,FontWeight.Normal))
var philosopherRegular = FontFamily(Font(R.font.philosopher_regular,FontWeight.Normal))
@Composable
fun TextCard(item: Item){
    val colorText = Color.Black.copy(0.6f)

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorText),
            horizontalAlignment = Alignment.Start
            ) {
            Text(text = item.name,
                modifier = Modifier.padding(top = 10.dp,start = 10.dp),
                style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontFamily = ralewayBold
                )

            )
            Text(text = item.shortDesc,
                modifier = Modifier.padding(top = 3.dp,start = 10.dp,bottom = 20.dp),
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.White,
                    fontFamily = ralewayNormal
                )

            )
        }
}

