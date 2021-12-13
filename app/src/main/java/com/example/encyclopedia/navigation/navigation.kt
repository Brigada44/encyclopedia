package com.example.encyclopedia.navigation

import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.encyclopedia.models.Item
import com.example.encyclopedia.screens.Article
import com.example.encyclopedia.screens.MainMenu
import com.example.encyclopedia.screens.SplashScreen
import com.google.gson.Gson


@Composable
fun Navigation (navController: NavHostController)
{

    NavHost(navController = navController, startDestination = "main_screen"){
        composable("splash_screen"){
            SplashScreen(navController)
        }
        composable("main_screen"){
           MainMenu(navController)
        }
        composable("article_screen/{item}",
            arguments = listOf(navArgument("item"){
                type = NavType.StringType
            })

            ){
            backStackEntry ->
            backStackEntry?.arguments?.getString("item")?.let { json->
                val item = Gson().fromJson(json,Item::class.java)
                Article(navController = navController, item = item)
            }
        }
    }
}

