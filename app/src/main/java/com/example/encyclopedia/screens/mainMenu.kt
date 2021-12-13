package com.example.encyclopedia.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.example.encyclopedia.R
import com.example.encyclopedia.cards.CardPost
import com.example.encyclopedia.cards.philosopherRegular
import com.example.encyclopedia.models.Item
import com.example.encyclopedia.models.*


@Composable
fun MainMenu(navController: NavController){
    //val bottomItems = listOf("Home","History","Saved","Search")
    val scrollState = rememberScrollState()
    LaunchedEffect(Unit) { scrollState.animateScrollTo(0) }
        Column()
        {
            Header()
            SearchField()
            Column(
                Modifier
                    .padding(start = 26.dp, end = 26.dp, bottom = 50.dp)
                    .verticalScroll(scrollState),
                verticalArrangement = Arrangement.spacedBy(12.dp))
            {
                Text(text = "Posts",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold
                ))
                var list:List<Item>
                list = listOf(item1,item2,item3)

                RecycleViewCard(listItem =list , navController = navController )
            }
        }
}
@Composable
fun RecycleViewCard(listItem:List<Item>,navController: NavController){
    listItem.forEach {
        CardPost(navController = navController, item = it)
    }
}
@Composable
fun Header(){
    Row(
        Modifier.padding(
            start = 23.dp,
            top = 23.dp
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
                fontWeight = FontWeight.Normal,
                fontFamily = philosopherRegular,
                fontSize =  42.sp
            ),
            modifier = Modifier.padding(start = 1.dp, top = 48.dp))
    }
}
@Composable
fun SearchField(){
    var txtSearch by remember { mutableStateOf("") }
    Row(
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier.padding(top = 30.dp,bottom = 30.dp)
    ) {
        TextField(
            value = txtSearch,
            onValueChange ={

            txtSearch = it
            },

        leadingIcon = {
            Image(painter = painterResource(id = R.drawable.searchbox),
                contentDescription ="",
            modifier = Modifier.size(30.dp))
        },
            textStyle  = TextStyle(
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.raleway_regular,FontWeight.Normal))
            ),
            colors =  TextFieldDefaults.textFieldColors(
                textColor = Color(0x333333),
                backgroundColor = Color(0xf5f5f5).copy(1f),
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            placeholder = { Text(text = "Search in pedia",fontSize = 24.sp)},
            modifier = Modifier
                .padding(start = 26.dp, top = 10.dp, end = 26.dp)
                .fillMaxWidth()

                .graphicsLayer {
                    shadowElevation = 10.dp.toPx()
                    shape = RoundedCornerShape(25.dp)
                    clip = true
                }
                .clip(RoundedCornerShape(25.dp)),
        )
    }
}

