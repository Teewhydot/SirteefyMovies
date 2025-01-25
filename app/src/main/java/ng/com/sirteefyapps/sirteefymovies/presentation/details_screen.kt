package ng.com.sirteefyapps.sirteefymovies.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ng.com.sirteefyapps.sirteefymovies.components.MoviesAppBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailsScreen(navController: NavController) {
    // Details screen content
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            MoviesAppBar(
                appBarTitle = "Details Screen",
                canNavigateBack = true,
                navController = navController
            )
        }
    ) {

    }


}