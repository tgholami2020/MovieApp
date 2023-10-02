package com.example.movieapp.screens.details

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController, movieData: String?) {

    Scaffold(topBar = {
        TopAppBar(title = { Text(text = "Movie") },

            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector =Icons.Default.ArrowBack ,
                        contentDescription ="Go Back",
                        modifier= Modifier.clickable {
                            navController.popBackStack()
                        })

                }
            },
        actions = {IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.FavoriteBorder,
                contentDescription = "my favorite")
            }
        }
            )

//        Row(modifier= Modifier
//            .height(50.dp)
//            .padding(4.dp),
//            horizontalArrangement = Arrangement.Center,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Icon(imageVector = Icons.Default.ArrowBack,
//                contentDescription = "Arrow Back",
//                modifier = Modifier.clickable {
//                    navController.popBackStack()
//                })
//            Spacer(modifier = Modifier.width(50.dp))
//            Text(text = "Movies")
//        }
    })
{value->
      //  Text(text = movieData.toString(), style = MaterialTheme.typography.bodyLarge)
    Surface (modifier= Modifier
        .padding(value)
        .fillMaxWidth()
        .fillMaxWidth()
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ){
            Text(text = movieData.toString(),
                style = MaterialTheme.typography.bodyLarge)
        }
    }
    }
}