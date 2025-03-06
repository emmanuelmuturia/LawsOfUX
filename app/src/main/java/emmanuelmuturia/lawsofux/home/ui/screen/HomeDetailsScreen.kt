package emmanuelmuturia.lawsofux.home.ui.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import emmanuelmuturia.lawsofux.R
import kotlinx.coroutines.launch

@Composable
fun HomeDetailsScreen() {

    val homeDetailsScreenListState = rememberLazyListState()

    val showScrollToTopButton by remember {
        derivedStateOf {
            homeDetailsScreenListState.firstVisibleItemIndex > 0
        }
    }

    val homeDetailsScreenCoroutineScope = rememberCoroutineScope()

    Scaffold(
        modifier =
        Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
        topBar = {
            // Custom Top App Bar...
        },
        floatingActionButton = {
            AnimatedVisibility(visible = showScrollToTopButton) {
                FloatingActionButton(
                    modifier = Modifier.clip(shape = RoundedCornerShape(size = 21.dp)),
                    onClick = {
                        homeDetailsScreenCoroutineScope.launch {
                            homeDetailsScreenListState.animateScrollToItem(index = 0)
                        }
                    },
                    containerColor = MaterialTheme.colorScheme.primary,
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.arrow_up),
                        contentDescription = "Scroll to Top Button",
                        tint = MaterialTheme.colorScheme.onPrimary,
                    )
                }
            }
        }
    ) { paddingValues ->
        HomeDetailsScreenContent(modifier = Modifier.padding(paddingValues = paddingValues))
    }

}

@Composable
private fun HomeDetailsScreenContent(modifier: Modifier) {

}

@Composable
private fun HomeDetailsScreenTitleAndImage(modifier: Modifier = Modifier) {

}

@Composable
private fun HomeDetailsScreenDefinition(modifier: Modifier = Modifier) {

}

@Composable
private fun HomeDetailsScreenTakeaways(modifier: Modifier = Modifier) {

}

@Composable
private fun HomeDetailsScreenOrigins(modifier: Modifier = Modifier) {

}

@Composable
private fun HomeDetailsScreenFurtherReading(modifier: Modifier = Modifier) {

}

@Composable
private fun HomeDetailsScreenRelated(modifier: Modifier = Modifier) {

}

@Composable
private fun HomeDetailsScreenNext(modifier: Modifier = Modifier) {

}