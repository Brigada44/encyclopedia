package com.example.encyclopedia.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.encyclopedia.R


@Composable
fun BottomAppBar(navController: NavController){
    Row(
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
            .background(Color.White)
            .padding(start = 30.dp, end = 30.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Column(
            modifier = Modifier.clickable { navController.navigate("main_screen") }

        ) {
            Image(
                painter =  painterResource(id = R.drawable.home),
                "",
                Modifier
                    .height(30.dp)
                    .width(40.dp)
            )
            Text(
                text = "Home"
            )
        }
        Column(
            modifier = Modifier
                .clickable { }
        ) {
            Image(
                painter =  painterResource(id = R.drawable.history),
                "",
                Modifier
                    .height(30.dp)
                    .width(40.dp)
            )
            Text(
                text = "History"
                )
        }
        Column(
            modifier = Modifier.clickable {  }
        ) {
            Image(
                painter =  painterResource(id = R.drawable.save),
                "",
                Modifier
                    .height(30.dp)
                    .width(40.dp)
            )
            Text(
                text = "Saved"
                )
        }
        Column(
            modifier = Modifier.clickable {  }
        ) {
            Image(
                painter =  painterResource(id = R.drawable.search),
                "",
                Modifier
                    .height(30.dp)
                    .width(40.dp)
            )
            Text(
                text = "Search"
                )
        }

    }
}