package cinema.house.project.pages


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import cinema.house.project.domain.model.Movie
import coil3.compose.AsyncImage
import com.example.ui.theme.AppTypography
import org.jetbrains.compose.resources.painterResource


@Composable
fun MovieListItem(
    modifier: Modifier = Modifier,
    movie: Movie,
    onMovieClick: (Movie) -> Unit
) {
    Card(
        modifier = modifier
            .height(220.dp)
            .clickable { onMovieClick(movie) },
        shape = RoundedCornerShape(8.dp)
    ) {
        Column {
            Box(
                modifier = modifier.weight(1f),
                contentAlignment = Alignment.Center
            ) {
                AsyncImage(
                    model = movie.imageUrl,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(bottomStart = 2.dp, bottomEnd = 2.dp))
                )

//                Surface(
//                    color = Color.Black.copy(alpha = 0.6f),
//                    modifier = modifier
//                        .size(50.dp),
//                    shape = CircleShape
//                ) {
//                    Image(
//                        painter = painterResource(
//                            resource = 
//                        ),
//                        contentDescription = null,
//                        modifier = modifier.padding(12.dp).align(Alignment.Center)
//                    )
//                }
            }

            Column(
                modifier = modifier.padding(10.dp)
            ){
                Text(
                    text = movie.title,
                    style = AppTypography.displayMedium,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = modifier.height(4.dp))

                Text(text = movie.releaseDate, style =AppTypography.bodySmall)
            }
        }
    }

}














