package ng.com.sirteefyapps.sirteefymovies.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import ng.com.sirteefyapps.sirteefymovies.components.MoviesAppBar
import ng.com.sirteefyapps.sirteefymovies.services.navigation.getMovies

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailsScreen(navController: NavController, movieData: String?) {
// Using the movieData to fetch the movie details, this approach is used since we are still passing a string from the home_screen to the details screen, so we use that to filer the entire movies list and get the one that matches the id.

    // When we can pass the entire movie data class to the details screen, this approach will no longer be necessary.
val newMovieList = getMovies().filter {
    it.imdbID == movieData
}
    // Details screen content
    Scaffold(
        topBar = {
            MoviesAppBar(
                appBarTitle =newMovieList[0].title,
                canNavigateBack = true,
                navController = navController
            )
        }
    )
    {
       Column(
           modifier = Modifier
               .fillMaxSize()
               .padding(it),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
       ) {

           if (movieData != null) {
               Text(
                   text = newMovieList[0].title,
                   style = MaterialTheme.typography.headlineMedium,
                   color = Color.Black
               )
           }
       }
    }


}