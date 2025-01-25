package ng.com.sirteefyapps.sirteefymovies.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ng.com.sirteefyapps.sirteefymovies.components.MovieCard
import ng.com.sirteefyapps.sirteefymovies.components.MoviesAppBar
import ng.com.sirteefyapps.sirteefymovies.ui.theme.Purple80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    val moviesList = listOf(
        "The Matrix",
        "The Matrix Reloaded",
        "The Matrix Revolutions",
        "The Matrix Resurrections",
        "The Matrix 5",
        "Saving Private Ryan",
        "The Godfather",
        "The Godfather Part II",
        "The Godfather Part III",
        "The Godfather Part IV",
        "The Godfather Part V",
        "The Godfather Part VI",
        "The Godfather Part VII",
        "The Godfather Part VIII",
        "The Godfather Part IX",
        "The Godfather Part X",
        "The Godfather Part XI",
        "The Godfather Part XII",
        "The Godfather Part XIII",
        "The Godfather Part XIV",
        "The Godfather Part XV",
        "The Godfather Part XVI",
        "The Godfather Part XVII",
        "The Godfather Part XVIII",
        "The Godfather Part XIX",
        "The Godfather Part XX",
        "The Godfather Part XXI",
        "The Godfather Part XXII",
        "The Godfather Part XXIII",
        "The Godfather Part XXIV",
        "The Godfather Part XXV",
        "The Godfather Part XXVI",
        "The Godfather Part XXVII",
        "The Godfather Part XXVIII",
        "The Godfather Part XXIX",
        "The Godfather Part XXX"
    )
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
            items(moviesList.size) {
                MovieCard(movieName = moviesList[it], onItemClick = {
                    navController.navigate("details")
                })
            }
        }
    }
}