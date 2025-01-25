package ng.com.sirteefyapps.sirteefymovies.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import ng.com.sirteefyapps.sirteefymovies.ui.theme.Purple80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoviesAppBar(appBarTitle: String, canNavigateBack: Boolean = false, navController: NavController) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Purple80
        ),
        title = {
            Text(text = appBarTitle)
        },
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = { navController.popBackStack()}) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back Arrow"
                    )
                }
            }
        })
}