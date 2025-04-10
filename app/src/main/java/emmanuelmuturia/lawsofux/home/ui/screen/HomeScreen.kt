package emmanuelmuturia.lawsofux.home.ui.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withLink
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXCardItem
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXFooter
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXTopAppBar
import emmanuelmuturia.lawsofux.home.data.model.UXLaw
import emmanuelmuturia.lawsofux.home.ui.state.HomeScreenUIState
import emmanuelmuturia.lawsofux.home.ui.viewmodel.HomeScreenViewModel
import kotlinx.coroutines.launch
import org.koin.androidx.compose.koinViewModel

/**
 * This is the app's Home Screen...
 */

@Composable
fun HomeScreen(
    navigateToHomeDetailsScreen: (UXLaw) -> Unit,
    navigateToArticlesScreen: () -> Unit,
    navigateToCardsScreen: () -> Unit,
    navigateToBookScreen: () -> Unit,
    navigateToInfoScreen: () -> Unit,
) {
    val homeScreenListState = rememberLazyListState()

    val showScrollToTopButton by remember {
        derivedStateOf {
            homeScreenListState.firstVisibleItemIndex > 0
        }
    }

    val homeScreenCoroutineScope = rememberCoroutineScope()

    Scaffold(
        modifier =
            Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background),
        topBar = {
            LawsOfUXTopAppBar(
                navigateToArticlesScreen = navigateToArticlesScreen,
                navigateToCardsScreen = navigateToCardsScreen,
                navigateToBookScreen = navigateToBookScreen,
                navigateToInfoScreen = navigateToInfoScreen,
            )
        },
        floatingActionButton = {
            AnimatedVisibility(visible = showScrollToTopButton) {
                FloatingActionButton(
                    modifier = Modifier.clip(shape = RoundedCornerShape(size = 21.dp)),
                    onClick = {
                        homeScreenCoroutineScope.launch {
                            homeScreenListState.animateScrollToItem(index = 0)
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
        val homeScreenViewModel: HomeScreenViewModel = koinViewModel()
        val homeScreenUIState: HomeScreenUIState by
            homeScreenViewModel.homeScreenUIState.collectAsStateWithLifecycle()
        HomeScreenContent(
            modifier = Modifier.padding(paddingValues = paddingValues),
            homeScreenUIState = homeScreenUIState,
            homeScreenListState = homeScreenListState,
            navigateToHomeDetailsScreen = navigateToHomeDetailsScreen,
            navigateToInfoScreen = navigateToInfoScreen,
        )
    }
}

@Composable
private fun HomeScreenContent(
    modifier: Modifier,
    homeScreenUIState: HomeScreenUIState,
    homeScreenListState: LazyListState,
    navigateToHomeDetailsScreen: (UXLaw) -> Unit,
    navigateToInfoScreen: () -> Unit,
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        state = homeScreenListState,
    ) {
        item(
            key = "HomeScreenText",
        ) { HomeScreenText() }
        item(
            key = "HomeScreenNotification",
        ) { HomeScreenNotification() }
        items(items = homeScreenUIState.uxLaws, key = { uxLaw ->
            uxLaw.uxLawId
        }) { uxLaw ->
            LawsOfUXCardItem(
                uxLaw = uxLaw,
                navigateToHomeDetailsScreen = {
                    navigateToHomeDetailsScreen(uxLaw)
                },
            )
        }
        item(
            key = "HomeScreenSpacer",
        ) { Spacer(modifier = Modifier.height(height = 21.dp)) }
        item(
            key = "LawsOfUXFooter",
        ) {
            LawsOfUXFooter(
                navigateToInfoScreen = navigateToInfoScreen,
            )
        }
    }
}

@Composable
private fun HomeScreenText() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            "Laws of UX is a collection of best practices that designers can consider when " +
                "building user interfaces.",
        fontSize = 21.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        lineHeight = 33.sp,
    )
}

@Composable
private fun HomeScreenNotification() {
    Card(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(all = 14.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().height(intrinsicSize = IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Icon(
                modifier = Modifier.padding(all = 21.dp),
                imageVector = Icons.Rounded.Notifications,
                contentDescription = "Home Screen Notification Icon",
                tint = MaterialTheme.colorScheme.onSurface,
            )

            VerticalDivider(
                thickness = 1.4.dp,
                color = MaterialTheme.colorScheme.background,
            )

            Text(
                modifier = Modifier.padding(all = 10.dp),
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
                fontSize = 14.sp,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
            )
        }
    }
}