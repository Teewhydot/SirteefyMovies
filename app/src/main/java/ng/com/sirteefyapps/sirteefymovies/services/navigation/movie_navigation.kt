package ng.com.sirteefyapps.sirteefymovies.services.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ng.com.sirteefyapps.sirteefymovies.presentation.DetailsScreen
import ng.com.sirteefyapps.sirteefymovies.presentation.HomeScreen


@Preview(showBackground = true)
@Composable
fun MovieAppNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.HOME.name
    ) {
        composable(AppScreens.HOME.name) {
             HomeScreen(navController = navController)
        }
        composable(AppScreens.DETAILS.name) {
            DetailsScreen(navController = navController)
        }
    }


}