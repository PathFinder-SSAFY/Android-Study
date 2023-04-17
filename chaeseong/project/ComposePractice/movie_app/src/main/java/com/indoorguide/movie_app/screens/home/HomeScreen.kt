package com.indoorguide.movie_app.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.indoorguide.movie_app.MovieRow
import com.indoorguide.movie_app.navigation.MovieScreens

@Composable
fun HomeScreen(navController: NavController) {

    Scaffold(topBar = {
        TopAppBar(
            backgroundColor = Color.Magenta,
            elevation = 5.dp
        ) {
            Text(text = "Movies")
        }
    }) {
        Modifier.padding(it)
        MainContent(navController = navController)
    }
}


@Composable
fun MainContent(
    navController: NavController,
    movieList: List<String> = listOf(
        "Avatar", "300", "Harry Poter", "Joker"
    )
) {
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn() {
            items(movieList) {
                MovieRow(it) { movie ->
                    navController.navigate(route = MovieScreens.DetailesScreen.name + "/$movie")
                }
            }
        }
    } // End of Column
} // End of MainContent
