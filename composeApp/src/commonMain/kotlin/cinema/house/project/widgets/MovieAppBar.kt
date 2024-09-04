import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cinema.house.project.widgets.Destination
import com.example.compose.secondaryLight
import com.example.ui.theme.AppTypography

@Composable
fun MovieAppBar(
    modifier: Modifier = Modifier,
    canNavigateBack: Boolean,
    currentScreen: Destination,
    onNavigateBack: () -> Unit
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        
        color = androidx.compose.ui.graphics.Color.Red,
    ) {
        Row(
            modifier = modifier.padding(start = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AnimatedVisibility(visible = canNavigateBack) {
                IconButton(onClick = onNavigateBack) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = null,
                    )
                }
                Spacer(modifier = modifier.width(24.dp))
            }

            Text(
                text = currentScreen.title,
                style = AppTypography.bodySmall,
                modifier = modifier.padding(12.dp),
                color = secondaryLight
            )
        }
    }
}

















