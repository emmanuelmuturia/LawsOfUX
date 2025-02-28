package emmanuelmuturia.lawsofux.home.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withLink
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.home.data.model.UXLaw
import emmanuelmuturia.lawsofux.home.ui.state.HomeScreenUIState

/**
 * This is the app's Home Screen...
 */

@Composable
fun HomeScreen() {
    Scaffold(
        modifier =
            Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background),
    ) { paddingValues ->
        HomeScreenContent(modifier = Modifier.padding(paddingValues = paddingValues))
    }
}

@Composable
fun HomeScreenContent(modifier: Modifier) {
}

@Composable
fun HomeScreenText() {
    Text(
        text = "Laws of UX is a collection of best practices that designers can consider when building user interfaces.",
        fontSize = 49.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
    )
}

@Composable
fun HomeScreenNotification() {
    Card(
        modifier = Modifier.fillMaxWidth().padding(all = 14.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
    ) {
        Row {
            Icon(
                imageVector = Icons.Rounded.Notifications,
                contentDescription = "Home Screen Notification Icon",
                tint = MaterialTheme.colorScheme.onSurface,
            )

            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 3.dp,
                color = MaterialTheme.colorScheme.background,
            )

            Text(
                text =
                    buildAnnotatedString {
                        append(
                            text =
                                "The updated Laws of UX large format index poster is now " +
                                    "available! Additions include Paradox of the Active User, " +
                                    "Selection Attention, Cognitive Bias, and more. ",
                        )

                        withLink(
                            link =
                                LinkAnnotation.Url(
                                    url =
                                        "https://jonyablonski.bigcartel.com/product/" +
                                            "laws-of-ux-index-poster",
                                ),
                        ) {
                            withStyle(
                                style =
                                    SpanStyle(
                                        textDecoration = TextDecoration.Underline,
                                    ),
                            ) {
                                append(text = "Check it out →")
                            }
                        }
                    },
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 18.sp,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
            )
        }
    }
}

@Composable
fun HomeScreenCardList(homeScreenUIState: HomeScreenUIState) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items = homeScreenUIState.uxLaws) { uxLaw ->
            HomeScreenCardItem(uxLaw = uxLaw)
        }
    }
}

@Composable
fun HomeScreenCardItem(uxLaw: UXLaw) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(all = 14.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
    ) {
        Column {
            Image(
                painter = painterResource(id = uxLaw.uxLawThumbnail),
                contentDescription = "Home Screen Content Thumbnail",
                contentScale = ContentScale.Crop,
            )

            Text(
                text = uxLaw.uxLawTitle,
                fontSize = 25.sp,
                color = MaterialTheme.colorScheme.onSurface,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
                fontWeight = FontWeight.Bold,
            )

            Text(
                text = uxLaw.uxLawDescription,
                fontSize = 25.sp,
                color = MaterialTheme.colorScheme.onSurface,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
            )
        }
    }
}