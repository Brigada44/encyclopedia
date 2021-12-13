package com.example.encyclopedia.screens

import android.icu.number.Scale
import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.encyclopedia.R
import com.example.encyclopedia.cards.philosopherRegular
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){
    val scale = remember {
        Animatable(0f)
    }
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.3f,
            animationSpec = tween(
                durationMillis = 500,
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            )
        )
        delay(3000L)
        navController.navigate("main_screen")
    }
    Box(
        modifier = Modifier
            .height(1000.dp)
            .fillMaxWidth()
            .background(Color(0xFF202020)),
        contentAlignment = Alignment.Center

    ){
        val img = painterResource(id = R.drawable.splash_background)
        Image(
            painter = img,
            contentDescription = "null",
            alignment = Alignment.TopStart,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
            )
        Box(
            Modifier
                .width(296.dp)
                .height(323.dp)
                .clip(RoundedCornerShape(45.dp))
                .background(Color.White),
            Alignment.Center
        ) {
            val img = painterResource(id = R.drawable.splash_book)
            Image(
                painter = img,
                contentDescription = "null",
                alignment = Alignment.TopStart,
                contentScale = ContentScale.Crop,
                modifier = Modifier.width(206.dp).height(191.dp)
            )
            Text(text = "Encyclopedia",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontFamily = philosopherRegular,
                    fontSize =  26.sp
                ),
                modifier = Modifier.padding( top = 191.dp))
        }
    }
}


