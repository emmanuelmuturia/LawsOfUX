package emmanuelmuturia.lawsofux.home.ui.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowDropDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withLink
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXCardItem
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXExtraCardItem
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXNavigationBackButton
import emmanuelmuturia.lawsofux.home.data.model.UXLaw
import emmanuelmuturia.lawsofux.home.ui.viewmodel.HomeScreenViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeDetailsScreen(
    navigateBack: () -> Unit,
    uxLaw: UXLaw,
    navigateToPosterShop: () -> Unit,
    homeScreenViewModel: HomeScreenViewModel,
) {
    val homeDetailsScreenListState = rememberLazyListState()

    val showScrollToTopButton by remember {
        derivedStateOf {
            homeDetailsScreenListState.firstVisibleItemIndex > 0
        }
    }

    val homeDetailsScreenCoroutineScope = rememberCoroutineScope()

    var languagesMenuExpanded by remember { mutableStateOf(value = false) }

    val homeScreenUIState by homeScreenViewModel.homeScreenUIState.collectAsStateWithLifecycle()

    Scaffold(
        modifier =
            Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background),
        topBar = {
            CenterAlignedTopAppBar(
                colors =
                    TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.background,
                    ),
                actions = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(end = 16.dp),
                    ) {
                        IconButton(onClick = {
                            // Toggle Dark Mode and Light Mode...
                        }) {
                            Icon(
                                imageVector =
                                    if (isSystemInDarkTheme()) {
                                        ImageVector.vectorResource(id = R.drawable.light_mode)
                                    } else {
                                        ImageVector.vectorResource(id = R.drawable.dark_mode)
                                    },
                                contentDescription = "Toggle Dark Mode and Light Mode",
                                tint = MaterialTheme.colorScheme.onPrimary,
                            )
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier =
                                Modifier.clickable {
                                    languagesMenuExpanded = !languagesMenuExpanded
                                },
                        ) {
                            Icon(
                                imageVector = ImageVector.vectorResource(id = R.drawable.language),
                                contentDescription = "Languages Icon",
                                modifier = Modifier.size(size = 24.dp),
                                tint = MaterialTheme.colorScheme.onPrimary,
                            )
                            Spacer(modifier = Modifier.width(width = 4.dp))
                            Text(
                                // This should be dynamic...
                                text = "ENGLISH",
                                color = MaterialTheme.colorScheme.onPrimary,
                                fontFamily =
                                    FontFamily(
                                        fonts =
                                            listOf(
                                                Font(resId = R.font.ibm_plex_mono_regular),
                                            ),
                                    ),
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                            )
                            Icon(
                                imageVector =
                                    if (languagesMenuExpanded) {
                                        Icons.Rounded.KeyboardArrowUp
                                    } else {
                                        Icons.Rounded.ArrowDropDown
                                    },
                                contentDescription = "Dropdown Icon",
                                modifier = Modifier.size(size = 24.dp),
                                tint = MaterialTheme.colorScheme.onPrimary,
                            )
                        }
                    }
                    // Dropdown menu for languages
                    DropdownMenu(
                        expanded = languagesMenuExpanded,
                        onDismissRequest = { languagesMenuExpanded = false },
                        modifier = Modifier.background(color = MaterialTheme.colorScheme.primary),
                    ) {
                        DropdownMenuItem(
                            text = {
                                Text(
                                    text = "Español",
                                    fontFamily =
                                        FontFamily(
                                            fonts =
                                                listOf(
                                                    Font(resId = R.font.ibm_plex_mono_regular),
                                                ),
                                        ),
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onPrimary,
                                    fontSize = 21.sp,
                                )
                            },
                            onClick = {
                                // Change language to Spanish...
                                languagesMenuExpanded = false
                            },
                        )
                        DropdownMenuItem(
                            text = {
                                Text(
                                    text = "Français",
                                    fontFamily =
                                        FontFamily(
                                            fonts =
                                                listOf(
                                                    Font(resId = R.font.ibm_plex_mono_regular),
                                                ),
                                        ),
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onPrimary,
                                    fontSize = 21.sp,
                                )
                            },
                            onClick = {
                                // Change language to French...
                                languagesMenuExpanded = false
                            },
                        )
                    }
                },
                navigationIcon = {
                    LawsOfUXNavigationBackButton(
                        navigateBack = navigateBack,
                    )
                },
                title = {
                },
            )
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
        HomeDetailsScreenContent(
            modifier = Modifier.padding(paddingValues = paddingValues),
            homeDetailsScreenListState = homeDetailsScreenListState,
            uxLaw = uxLaw,
            navigateToPosterShop = navigateToPosterShop,
            uxLaws = homeScreenUIState.uxLaws,
        )
    }
}

@Composable
private fun HomeDetailsScreenContent(
    modifier: Modifier,
    homeDetailsScreenListState: LazyListState,
    uxLaw: UXLaw,
    navigateToPosterShop: () -> Unit,
    uxLaws: List<UXLaw>,
) {
    val randomLawsOfUX = remember { uxLaws.shuffled().take(n = 3) }

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        state = homeDetailsScreenListState,
    ) {
        item {
            HomeDetailsScreenTitle(uxLaw = uxLaw)
        }

        item {
            HomeDetailsScreenImage(uxLaw = uxLaw)
        }

        item {
            HomeDetailsScreenDefinition(uxLaw = uxLaw)
        }

        item {
            HomeDetailsScreenTakeawayTitle()
        }

        itemsIndexed(items = uxLaw.uXLawTakeaways) { index, uxLawTakeAway ->

            Text(
                modifier = Modifier.padding(start = 14.dp),
                text = "${index + 1}",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
                fontWeight = FontWeight.Bold,
            )

            HorizontalDivider(
                modifier = Modifier.padding(all = 14.dp),
                thickness = 3.dp,
                color = MaterialTheme.colorScheme.onBackground,
            )

            Text(
                modifier = Modifier.padding(all = 14.dp),
                text = uxLawTakeAway,
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
                fontWeight = FontWeight.Bold,
            )
        }

        item {
            HomeDetailsScreenOriginsTitle()
        }

        item {
            HomeDetailsScreenOriginsContent(uxLaw = uxLaw)
        }

        item {
            HomeDetailsScreenSource(uxLaw = uxLaw)
        }

        item {
            HomeDetailsScreenFurtherReadingTitle()
        }

        items(items = uxLaw.uXLawFurtherReading) { furtherReading ->
            LawsOfUXExtraCardItem(
                title = furtherReading.first,
                content = furtherReading.second,
            )
        }

        item {
            HomeDetailsScreenLargePosterButton(
                navigateToPosterShop = navigateToPosterShop,
            )
        }

        item {
            HomeDetailsScreenSmallPosterText(uxLaw = uxLaw)
        }

        item {
            HomeDetailsScreenDivider()
        }

        item {
            HomeDetailsScreenRelatedTitle()
        }

        items(items = randomLawsOfUX) { uxLaw ->
            LawsOfUXCardItem(uxLaw = uxLaw, navigateToHomeDetailsScreen = {})
        }

        item {
            HomeDetailsScreenNext(
                uxLaws = uxLaws,
                currentUXLaw = uxLaw,
            )
        }
    }
}

@Composable
private fun HomeDetailsScreenTitle(uxLaw: UXLaw) {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = uxLaw.uxLawTitle,
        fontSize = 28.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily =
            FontFamily(
                fonts =
                    listOf(
                        Font(resId = R.font.ibm_plex_sans_regular),
                    ),
            ),
        fontWeight = FontWeight.ExtraBold,
        textAlign = TextAlign.Center,
    )
}

@Composable
private fun HomeDetailsScreenImage(uxLaw: UXLaw) {
    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(id = uxLaw.uxLawThumbnail),
        contentDescription = "Home Details Screen Content Thumbnail",
        contentScale = ContentScale.Crop,
    )
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
    )
}

@Composable
private fun HomeDetailsScreenTakeawayTitle(modifier: Modifier = Modifier) {
    // I will check on this later...
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Takeaways",
        fontSize = 28.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun HomeDetailsScreenOriginsTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Origins",
        fontSize = 28.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun HomeDetailsScreenOriginsContent(uxLaw: UXLaw) {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = uxLaw.uXLawOrigins,
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
private fun HomeDetailsScreenSource(uxLaw: UXLaw) {
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
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        textDecoration = TextDecoration.Underline,
    )
}

@Composable
private fun HomeDetailsScreenFurtherReadingTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Further Reading",
        fontSize = 28.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun HomeDetailsScreenLargePosterButton(navigateToPosterShop: () -> Unit) {
    Button(
        modifier =
            Modifier
                .padding(all = 7.dp),
        onClick = navigateToPosterShop,
        colors =
            ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
            ),
    ) {
        Text(
            text = "BUY LARGE FORMAT POSTER",
            color = MaterialTheme.colorScheme.onPrimary,
            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
        )
    }
}

@Composable
private fun HomeDetailsScreenSmallPosterText(uxLaw: UXLaw) {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            buildAnnotatedString {
                uxLaw.uXLawFreePoster.let {
                    LinkAnnotation.Url(
                        url = it,
                    )
                }.let {
                    withLink(
                        link = it,
                    ) {
                        append(text = "Download free poster")
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
private fun HomeDetailsScreenDivider() {
    HorizontalDivider(
        modifier = Modifier.padding(all = 14.dp),
        thickness = 3.dp,
        color = MaterialTheme.colorScheme.onBackground,
    )
}

@Composable
private fun HomeDetailsScreenRelatedTitle(modifier: Modifier = Modifier) {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Related",
        fontSize = 28.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun HomeDetailsScreenNext(
    uxLaws: List<UXLaw>,
    currentUXLaw: UXLaw,
) {
    val currentUXLawIndex = uxLaws.indexOf(element = currentUXLaw)

    Card(
        modifier =
            Modifier
                .fillMaxWidth()
                .clickable {
                    // navigateToHomeDetailsScreen(uxLaw)
                },
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
    ) {
        Column(modifier = Modifier.fillMaxSize().padding(all = 14.dp)) {
            Button(
                modifier = Modifier.padding(all = 7.dp),
                onClick = {
                    // navigateToHomeDetailsScreen(uxLaw)
                },
                colors =
                    ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                    ),
            ) {
                Text(
                    text = "NEXT",
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
                )
            }

            Text(
                text = uxLaws[currentUXLawIndex + 1].uxLawTitle,
                fontSize = 28.sp,
                color = MaterialTheme.colorScheme.onPrimary,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
                fontWeight = FontWeight.ExtraBold,
            )
        }
    }
}