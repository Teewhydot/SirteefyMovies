package ng.com.sirteefyapps.sirteefymovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ng.com.sirteefyapps.sirteefymovies.services.navigation.MovieAppNavigation
import ng.com.sirteefyapps.sirteefymovies.ui.theme.SirteefyMoviesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SirteefyMoviesTheme {
                    MovieAppNavigation()            }
        }
    }
}

