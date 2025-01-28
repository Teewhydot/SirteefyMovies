package ng.com.sirteefyapps.sirteefymovies.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ng.com.sirteefyapps.sirteefymovies.components.MovieCard
import ng.com.sirteefyapps.sirteefymovies.components.MoviesAppBar
import ng.com.sirteefyapps.sirteefymovies.models.Movie
import ng.com.sirteefyapps.sirteefymovies.models.Response
import ng.com.sirteefyapps.sirteefymovies.models.Type
import ng.com.sirteefyapps.sirteefymovies.services.navigation.AppScreens
import ng.com.sirteefyapps.sirteefymovies.services.navigation.getMovies

@Composable
fun HomeScreen(navController: NavController) {
    val moviesList = getMovies()
    Scaffold(modifier = Modifier
        .fillMaxSize(), topBar = {
    MoviesAppBar(
        appBarTitle = "Sirteefy Movies",
        canNavigateBack = false,
        navController = navController
    )
    }) { innerPadding ->
        LazyColumn(modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()) {
            items( count = moviesList.size,) {
                MovieCard(name = moviesList[it].title, onItemClick = {
                    navController.navigate("${AppScreens.DETAILS.name}/${moviesList[it].imdbID}")
                }, image = moviesList[it].poster, director = moviesList[it].director, year = moviesList[it].year)
            }
        }
    }
}