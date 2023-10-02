package com.example.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.screens.home.HomeScreen
import com.example.movieapp.screens.details.DetailScreen

@Composable
 fun MovieNavigation(){
     val navController = rememberNavController()

        NavHost(navController = navController,
            startDestination = MovieScreens.HomeScreen.name){
            composable(MovieScreens.HomeScreen.name){
                //here we pass where this should lead us to
                HomeScreen(navController= navController)
            }
            //www.google.com/detail_screen/id=34
            composable(MovieScreens.DetailScreen.name+"/{movie}",
                arguments = listOf(navArgument(name="movie") {type= NavType.StringType})
                ){
                backStackEntry ->
                DetailScreen(navController=navController,
                    backStackEntry.arguments?.getString("movie"))
            }
        }
 }