package ng.com.sirteefyapps.sirteefymovies.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ng.com.sirteefyapps.sirteefymovies.ui.theme.HorizontalSpacing

@Composable
fun MovieCard(movieName: String) {
    Card(modifier = Modifier.padding(10.dp).fillMaxWidth().height(100.dp)) {
        Row(modifier = Modifier.padding(10.dp),verticalAlignment = Alignment.CenterVertically,) {
            Surface(modifier = Modifier.padding(10.dp).height(50.dp).width(50.dp)) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Movie Icon"
                )
            }
            HorizontalSpacing(10)
            Text(text = movieName)
        }
    }
}