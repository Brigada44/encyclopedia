package com.example.encyclopedia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.encyclopedia.navigation.Navigation
import com.example.encyclopedia.screens.BottomAppBar
import com.example.encyclopedia.screens.CardPost
import com.example.encyclopedia.screens.SplashScreen
import com.example.encyclopedia.ui.theme.EncyclopediaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EncyclopediaTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Box(
                        Modifier.width(360.dp).height(220.dp)
                    ){
                        CardPost()
                    }

                 //   Navigation()
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun start(){
    Box(
        Modifier.width(300.dp).size(150.dp)
    ){
        CardPost()
    }
}
