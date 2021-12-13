package com.example.encyclopedia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.encyclopedia.navigation.Navigation
import com.example.encyclopedia.screens.BottomAppBar
import com.example.encyclopedia.ui.theme.EncyclopediaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EncyclopediaTheme {
                // A surface container using the 'background' color from the theme
                var navController = rememberNavController()

                Scaffold(
                    bottomBar = {
                    BottomAppBar(navController = navController)
                }) {
                    Surface(color = MaterialTheme.colors.background) {
                        Navigation(navController)


                    }
                }

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun start(){
    //MainMenuM()
   /* Box(
        Modifier
            .width(300.dp)
            .height(90.dp)
    ){

    }*/
}



