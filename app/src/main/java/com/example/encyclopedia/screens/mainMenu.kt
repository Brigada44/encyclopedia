package com.example.encyclopedia.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Scaffold
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.encyclopedia.R



@Composable
fun MainMenu(navController: NavController){
    val bottomItems = listOf("Home","History","Saved","Search")
    Scaffold(
        bottomBar = {
            BottomAppBar(navController = navController)
        }

    ) {
        Header()
    }
}

@Composable
fun Header(){
    Row(
        Modifier.padding(
            start = 46.dp,
            top = 54.dp
        )
    ){
        val img = painterResource(id = R.drawable.book_menu)
        Image(painter = img, contentDescription = "" ,
            Modifier
                .height(96.dp)
                .width(105.dp)
        )
        Text(text = "Encyclopedia",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontSize =  26.sp
             ),
            modifier = Modifier.padding(start = 25.dp, top = 48.dp))
    }
}