package emmanuelmuturia.lawsofux.home.ui.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withLink
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.home.data.model.UXLaw
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
        },
    ) { paddingValues ->
        HomeDetailsScreenContent(modifier = Modifier.padding(paddingValues = paddingValues))
    }
}

@Composable
private fun HomeDetailsScreenContent(modifier: Modifier) {
}

@Composable
private fun HomeDetailsScreenTitleAndImage(uxLaw: UXLaw) {
    // I will refine this later...
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            modifier = Modifier.padding(all = 14.dp),
            text = uxLaw.uxLawTitle,
            fontSize = 28.sp,
            color = MaterialTheme.colorScheme.onBackground,
            overflow = TextOverflow.Clip,
            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
            fontWeight = FontWeight.ExtraBold,
        )

        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = uxLaw.uxLawThumbnail),
            contentDescription = "Home Details Screen Content Thumbnail",
            contentScale = ContentScale.Crop,
        )
    }
}

@Composable
private fun HomeDetailsScreenDefinition(uxLaw: UXLaw) {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = uxLaw.uxLawDescription,
        fontSize = 21.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.Bold,
    )
}

@Composable
private fun HomeDetailsScreenTakeaways(modifier: Modifier = Modifier) {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Takeaways",
        fontSize = 21.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun HomeDetailsScreenOrigins(modifier: Modifier = Modifier) {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Origins",
        fontSize = 21.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun HomeDetailsScreenSource(uxLaw: UXLaw) {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            buildAnnotatedString {
                uxLaw.uXLawSource?.let {
                    LinkAnnotation.Url(
                        url = it,
                    )
                }?.let {
                    withLink(
                        link = it,
                    ) {
                        append(text = "Source")
                    }
                }
            },
        fontSize = 14.sp,
        color = MaterialTheme.colorScheme.onBackground,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        textDecoration = TextDecoration.Underline,
    )
}

@Composable
private fun HomeDetailsScreenFurtherReading(modifier: Modifier = Modifier) {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Further Reading",
        fontSize = 21.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun HomeDetailsScreenRelated(modifier: Modifier = Modifier) {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Related",
        fontSize = 21.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun HomeDetailsScreenNext(modifier: Modifier = Modifier) {
}