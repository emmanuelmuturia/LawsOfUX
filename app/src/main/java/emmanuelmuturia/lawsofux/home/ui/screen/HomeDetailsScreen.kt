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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowDropDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withLink
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXNavigationBackButton
import emmanuelmuturia.lawsofux.home.data.model.UXLaw
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeDetailsScreen(
    navigateBack: () -> Unit,
) {
    val homeDetailsScreenListState = rememberLazyListState()

    val showScrollToTopButton by remember {
        derivedStateOf {
            homeDetailsScreenListState.firstVisibleItemIndex > 0
        }
    }

    val homeDetailsScreenCoroutineScope = rememberCoroutineScope()

    var languagesMenuExpanded by remember { mutableStateOf(value = false) }

    Scaffold(
        modifier =
        Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background,
                ),
                actions = {

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
                            modifier = Modifier.clickable {
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
                        navigateBack = navigateBack
                    )
                },
                title = {
                    Text(
                        text = "Home Details Screen",
                        color = MaterialTheme.colorScheme.onBackground,
                        fontFamily = FontFamily(
                            fonts = listOf(
                                Font(resId = R.font.ibm_plex_sans_regular)
                            )
                        ),
                    )
                }
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