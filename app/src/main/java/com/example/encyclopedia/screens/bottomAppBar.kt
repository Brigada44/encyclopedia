package com.example.encyclopedia.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun BottomAppBar(navController: NavController){
    Row(
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
            .background(Color.Gray)
            .padding(start = 30.dp , end = 30.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

    )
    {
        Column(

        ) {
            Icon(
                Icons.Rounded.Home ,
                "",
                Modifier
                    .height(30.dp)
                    .width(40.dp)

                    .clickable {

                    }
            )
            Text(
                text = "Home",
            )
        }
        Column( ) {
            Icon(
                Icons.Rounded.Home ,
                "",
                Modifier
                    .height(30.dp)
                    .width(40.dp)
                    .clickable {

                    }
            )
            Text(
                text = "Home",

                )
        }
        Column(  ) {
            Icon(
                Icons.Rounded.Home ,
                "",
                Modifier
                    .height(30.dp)
                    .width(40.dp)

                    .clickable {

                    }
            )
            Text(
                text = "Home",

                )
        }
        Column() {
            Icon(
                Icons.Rounded.Home ,
                "",
                Modifier
                    .height(30.dp)
                    .width(40.dp)
                    .clickable {

                    }
            )
            Text(
                text = "Home",

                )
        }

    }
}