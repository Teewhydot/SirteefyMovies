package ng.com.sirteefyapps.sirteefymovies.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.compose.AsyncImagePainter
import coil3.compose.rememberAsyncImagePainter
import coil3.request.ImageRequest
import coil3.request.crossfade
import coil3.transform.CircleCropTransformation
import ng.com.sirteefyapps.sirteefymovies.ui.theme.HorizontalSpacing

@Composable
fun MovieCard(
    name: String,
    image: String,
    director: String,
    year: String,
    onItemClick: () -> Unit = {}
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(100.dp),
        shape =
        RoundedCornerShape(
            20.dp
        ),
        onClick = onItemClick
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 5.dp
            )
        ) {
            Row(modifier = Modifier.padding(2.dp), verticalAlignment = Alignment.CenterVertically) {
                Surface(
                    modifier = Modifier
                        .padding(2.dp)
                        .height(100.dp)
                        .width(90.dp),
                    shape =
                    RoundedCornerShape(
                        20.dp
                    ),
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(image)
                            .crossfade(true)
                            .build(),
                        contentScale = ContentScale.Crop,
                        contentDescription = null,
                        modifier = Modifier.clip(RectangleShape),
                    )
                }
                Column {
                    Text(text = name)
                    Text(text = director, style = MaterialTheme.typography.labelMedium)
                    Text(text = year)
                }

            }
        }
    }
}