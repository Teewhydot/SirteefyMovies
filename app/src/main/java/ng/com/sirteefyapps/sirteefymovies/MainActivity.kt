package ng.com.sirteefyapps.sirteefymovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ng.com.sirteefyapps.sirteefymovies.components.MovieCard
import ng.com.sirteefyapps.sirteefymovies.ui.theme.Purple80
import ng.com.sirteefyapps.sirteefymovies.ui.theme.SirteefyMoviesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SirteefyMoviesTheme {
                MoviesHome()
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun MoviesHome() {
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
        .fillMaxSize()
        .padding(20.dp), topBar = {
        TopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Purple80
        ), title = { Text(text = "Sirteefy Movies") })
    }) { innerPadding ->
        LazyColumn(modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()) {
            items(moviesList.size) {
                MovieCard(movieName = moviesList[it])
            }
        }
    }
}