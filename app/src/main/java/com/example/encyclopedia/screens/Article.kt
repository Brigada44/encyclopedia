package com.example.encyclopedia.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.encyclopedia.R
import com.example.encyclopedia.cards.openSansBold
import com.example.encyclopedia.cards.openSansRegular
import com.example.encyclopedia.cards.ralewayBold
import com.example.encyclopedia.models.Item


@Composable
fun Article(navController: NavController,item: Item){
    val scrollState = rememberScrollState()
    LaunchedEffect(Unit) { scrollState.animateScrollTo(0) }
    val listState = rememberLazyListState()
    Column(Modifier.verticalScroll(scrollState)
        .padding(bottom = 35.dp))
    {
        ImageBox(navController,item)
    }
}

@Composable
fun BackButton(navController: NavController){
    Row(modifier = Modifier.padding(start = 7.dp,top = 10.dp)
        .clickable { navController.popBackStack() }){
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "",
            modifier = Modifier
                .height(20.dp)
                .width(20.dp)
                .align(Alignment.CenterVertically)
                ,
        )
        Text(
            text = "Back",
            style = TextStyle(
                color = Color.White,
                fontSize = 24.sp
            )
            )
    }
}
@Composable
fun ImageBox(navController: NavController,item: Item){
    var img = painterResource(id = item.photo)
    var like = painterResource(id = R.drawable.like)

    Box (){

        Image(
            painter= img,
            contentDescription = "null",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(420.dp)
                .height(262.dp))
        BackButton(navController = navController)
            Text(
                text = item.name,
                modifier = Modifier
                    .padding(top = 3.dp, start = 10.dp, bottom = 20.dp)
                    .align(Alignment.BottomStart)
                    .graphicsLayer
                    {
                        shadowElevation = 14.dp.toPx()
                    },
                color = Color.White,
                style = TextStyle(
                    fontSize = 48.sp,
                    fontFamily = openSansBold
                )
            )
            Image(
                painter = like,
                contentDescription = null,
                modifier = Modifier
                    .width(65.dp)
                    .height(65.dp)
                    .padding(top = 3.dp, start = 10.dp, bottom = 30.dp, end = 10.dp)
                    .align(Alignment.BottomEnd),
                )
    }
    Text(text = item.textP1,
        modifier = Modifier
            .padding(start = 18.dp,end = 18.dp),
        textAlign = TextAlign.Justify,
        style = TextStyle(
            fontSize = 18.sp,
            fontFamily = openSansRegular
        )
    )
    Text(text = item.textP2,
        modifier = Modifier
            .padding(start = 20.dp,end = 20.dp,top = 8.dp,bottom = 20.dp),
        textAlign = TextAlign.Justify,
        style = TextStyle(
            fontSize = 18.sp,
            fontFamily = openSansRegular
        )
    )
}




