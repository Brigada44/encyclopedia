package com.example.encyclopedia.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.encyclopedia.screens.MainMenu
import com.example.encyclopedia.screens.SplashScreen


@Composable
fun Navigation ()
{
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen"){
        composable("splash_screen"){
            SplashScreen(navController)
        }
        composable("main_screen"){
           MainMenu(navController = navController)
        }
    }
}