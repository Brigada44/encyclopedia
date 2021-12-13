package com.example.encyclopedia.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.encyclopedia.R
import com.example.encyclopedia.cards.CardPost
import com.example.encyclopedia.models.Item
import com.example.encyclopedia.models.*


@Preview(showBackground = true)
@Composable
fun ItemScreen(){
    var navController = rememberNavController()
    var list :List<Item>
    list = listOf(item1, item2, item3)

    Column(Modifier.fillMaxSize()) {
        
    RecycleItemView(listItems = list)
    }
}
@Composable
fun RecycleItemView(listItems:List<Item>){

    Column() {
        listItems.forEach{
            CardItem(it)
        }
    }

}
@Composable
fun CardItem(item:Item){

}