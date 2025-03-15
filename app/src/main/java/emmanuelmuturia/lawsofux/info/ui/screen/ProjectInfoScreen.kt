package emmanuelmuturia.lawsofux.info.ui.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withLink
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXExtraCardItem
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXFooter
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXTopAppBar
import emmanuelmuturia.lawsofux.info.ui.state.ProjectInfoScreenUIState
import emmanuelmuturia.lawsofux.info.ui.viewmodel.ProjectInfoScreenViewModel
import kotlinx.coroutines.launch

@Composable
fun ProjectInfoScreen(
    navigateToArticlesScreen: () -> Unit,
    navigateToCardsScreen: () -> Unit,
    navigateToPosterShop: () -> Unit,
    projectInfoScreenViewModel: ProjectInfoScreenViewModel,
    navigateToBookScreen: () -> Unit,
    navigateToInfoScreen: () -> Unit,
) {
    val projectInfoScreenListState = rememberLazyListState()

    val showScrollToTopButton by remember {
        derivedStateOf {
            projectInfoScreenListState.firstVisibleItemIndex > 0
        }
    }

    val projectInfoScreenCoroutineScope = rememberCoroutineScope()

    val projectInfoScreenUIState by
        projectInfoScreenViewModel.projectInfoScreenUIState.collectAsStateWithLifecycle()

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
                navigateToInfoScreen = navigateToInfoScreen
            )
        },
        floatingActionButton = {
            AnimatedVisibility(visible = showScrollToTopButton) {
                FloatingActionButton(
                    modifier = Modifier.clip(shape = RoundedCornerShape(size = 21.dp)),
                    onClick = {
                        projectInfoScreenCoroutineScope.launch {
                            projectInfoScreenListState.animateScrollToItem(index = 0)
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
        ProjectInfoScreenContent(
            modifier = Modifier.padding(paddingValues = paddingValues),
            navigateToPosterShop = navigateToPosterShop,
            projectInfoScreenUIState = projectInfoScreenUIState,
            projectInfoScreenListState = projectInfoScreenListState
        )
    }
}

@Composable
private fun ProjectInfoScreenContent(
    modifier: Modifier = Modifier,
    navigateToPosterShop: () -> Unit,
    projectInfoScreenUIState: ProjectInfoScreenUIState,
    projectInfoScreenListState: LazyListState,
) {

    var userName by remember { mutableStateOf(value = "") }
    var userEmail by remember { mutableStateOf(value = "") }
    var userSubject by remember { mutableStateOf(value = "") }
    var userMessage by remember { mutableStateOf(value = "") }

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        state = projectInfoScreenListState
    ) {
        item {
            ProjectInfoScreenText()
        }

        item {
            ProjectInfoScreenImage()
        }

        item {
            ProjectInfoScreenContentText()
        }

        item {
            ProjectInfoScreenContentTextNote()
        }

        item {
            ProjectInfoScreenShareTitle()
        }

        item {
            ProjectInfoScreenShareContent()
        }

        item {
            ProjectInfoScreenPostersTitle()
        }

        item {
            ProjectInfoScreenPostersContent()
        }

        item {
            ProjectInfoScreenIndexPosterTitle()
        }

        item {
            ProjectInfoScreenIndexPosterImage()
        }

        item {
            ProjectInfoScreenIndexPosterCaption()
        }

        item {
            ProjectInfoScreenIndexPosterButton(
                navigateToPosterShop = navigateToPosterShop,
            )
        }

        item {
            ProjectInfoScreenInfoTitle()
        }

        items(items = projectInfoScreenUIState.projectInfos) { projectInfo ->
            LawsOfUXExtraCardItem(
                title = projectInfo.projectInfoTitle,
                content = projectInfo.projectInfoDescription,
            )
        }

        item {
            ProjectInfoScreenColophonTitle()
        }

        item {
            ProjectInfoScreenColophonContent()
        }

        item {
            ProjectInfoScreenDivider()
        }

        item {
            ProjectInfoScreenContactTitle()
        }

        item {
            ProjectInfoScreenContactCaption()
        }

        item {
            ProjectInfoScreenContactBoxTitle(
                title = "NAME",
            )
        }

        item {
            ProjectInfoScreenContactBox(
                value = userName,
                onValueChange = { userName = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )
        }

        item {
            ProjectInfoScreenContactBoxTitle(
                title = "EMAIL",
            )
        }

        item {
            ProjectInfoScreenContactBox(
                value = userEmail,
                onValueChange = { userEmail = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )
        }

        item {
            ProjectInfoScreenContactBoxTitle(
                title = "SUBJECT",
            )
        }

        item {
            ProjectInfoScreenContactBox(
                value = userSubject,
                onValueChange = { userSubject = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )
        }

        item {
            ProjectInfoScreenContactBoxTitle(
                title = "MESSAGE",
            )
        }

        item {
            ProjectInfoScreenContactBox(
                value = userMessage,
                onValueChange = { userMessage = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                height = 210.dp
            )
        }

        item {
            ProjectInfoScreenContactButton()
        }

        item {
            LawsOfUXFooter()
        }
    }
}

@Composable
private fun ProjectInfoScreenText() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            "Laws of UX is focused on making complex psychology heuristics accessible to " +
                "more designers through an interactive resource that collects those that are " +
                "relevant to user experience design.",
        fontSize = 28.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.Bold,
    )
}

@Composable
private fun ProjectInfoScreenImage() {
    Image(
        painter = painterResource(id = R.drawable.info_screen_image),
        contentDescription = "Project Info Screen Image",
        modifier =
            Modifier
                .padding(all = 14.dp)
                .fillMaxSize(),
        contentScale = ContentScale.Crop,
    )
}

@Composable
private fun ProjectInfoScreenContentText() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            buildAnnotatedString {
                append(
                    text =
                        "As humans, we have an underlying “blueprint” for how we perceive and " +
                            "process the world around us, and the study of psychology helps us decipher " +
                            "this blueprint. Designers can use this knowledge to build more intuitive, " +
                            "human-centered products and experiences. Instead of forcing users to adapt to " +
                            "the design of a product or experience, we can use some key principles from " +
                            "psychology as a guide for designing in a way that is adapted to people.\n" +
                            "\n" +
                            "This website seeks to make complex psychology heuristics accessible to more " +
                            "designers through an interactive resource that collects those that are " +
                            "relevant to user experience design and presents them in a visually engaging " +
                            "way. " +
                            "It was created by ",
                )

                withLink(
                    link =
                        LinkAnnotation.Url(
                            url = "https://jonyablonski.com/",
                        ),
                ) {
                    withStyle(
                        style =
                            SpanStyle(
                                textDecoration = TextDecoration.Underline,
                            ),
                    ) {
                        append(text = "Jon Yablonski")
                    }
                }

                append(
                    text =
                        "Have some feedback you’d like to share? I’m always open to suggestions " +
                            "and ideas. Feel free to reach out via the contact form below.",
                )
            },
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
private fun ProjectInfoScreenContentTextNote() {
    Box(
        modifier = Modifier.fillMaxSize().padding(all = 7.dp).border(
            width = 1.dp,
            color = MaterialTheme.colorScheme.onBackground,
            shape = RoundedCornerShape(size = 7.dp)
        )
    ) {
        Text(
            modifier = Modifier.padding(all = 14.dp),
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
                )
                ) {
                    append(text = "----------------------------------------")
                    append(text = "NOTE\n")
                }
                append(text = "----------------------------------------")
                append(text = "All content on this website is licensed under the Creative Commons " +
                    "Attribution-NonCommercial-NoDerivatives 4.0 International License. To view a " +
                    "copy of this license, visit ")
                withLink(
                    link =
                    LinkAnnotation.Url(
                        url = "https://creativecommons.org/licenses/by-nc-nd/4.0/",
                    ),
                ) {
                    withStyle(
                        style =
                        SpanStyle(
                            textDecoration = TextDecoration.Underline,
                        ),
                    ) {
                        append(text = "https://creativecommons.org/licenses/by-nc-nd/4.0/")
                    }
                }
                append(text = ".")
            },
            fontSize = 18.sp,
            color = MaterialTheme.colorScheme.onBackground,
            overflow = TextOverflow.Clip,
            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        )
    }
}

@Composable
private fun ProjectInfoScreenShareTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Share this project",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun ProjectInfoScreenShareContent() {
    Row(
        //modifier = Modifier.padding(all = 14.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Image(
            painter = painterResource(id = R.drawable.x),
            contentDescription = "X Image",
            modifier =
            Modifier
                .size(size = 70.dp),
            contentScale = ContentScale.Crop,
        )

        Image(
            painter = painterResource(id = R.drawable.meta),
            contentDescription = "Meta Image",
            modifier =
            Modifier
                .size(size = 70.dp),
            contentScale = ContentScale.Crop,
        )

        Image(
            painter = painterResource(id = R.drawable.linkedin),
            contentDescription = "LinkedIn Image",
            modifier =
            Modifier
                .size(size = 70.dp),
            contentScale = ContentScale.Crop,
        )

        Image(
            painter = painterResource(id = R.drawable.pinterest),
            contentDescription = "Pinterest Image",
            modifier =
            Modifier
                .size(size = 70.dp),
            contentScale = ContentScale.Crop,
        )
    }
}

@Composable
private fun ProjectInfoScreenPostersTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Posters",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun ProjectInfoScreenPostersContent() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            buildAnnotatedString {
                append(text = "High-resolution posters are available for purchase via ")

                withLink(
                    link =
                        LinkAnnotation.Url(
                            url = "https://jonyablonski.bigcartel.com/",
                        ),
                ) {
                    withStyle(
                        style =
                            SpanStyle(
                                textDecoration = TextDecoration.Underline,
                            ),
                    ) {
                        append(text = "The Online Store of Jon Yablonski")
                    }
                }

                append(
                    text =
                        ". In addition, there are 11\"×17” posters available for free. Posters " +
                            "are " +
                            "licensed under the " +
                            "Creative Commons Attribution-NonCommercial-NoDerivatives " +
                            "4.0 International License. To view a copy of this license, visit ",
                )

                withLink(
                    link =
                        LinkAnnotation.Url(
                            url = "https://creativecommons.org/licenses/by-nc-nd/4.0/",
                        ),
                ) {
                    withStyle(
                        style =
                            SpanStyle(
                                textDecoration = TextDecoration.Underline,
                            ),
                    ) {
                        append(text = "http://creativecommons.org/licenses/by-nc-nd/4.0/")
                    }
                }

                append(text = ".")
            },
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
private fun ProjectInfoScreenIndexPosterTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Index Poster",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun ProjectInfoScreenIndexPosterImage() {
    Image(
        painter = painterResource(id = R.drawable.index_poster_image),
        contentDescription = "Cards Screen Image",
        modifier =
            Modifier
                .padding(all = 14.dp)
                .fillMaxSize(),
        contentScale = ContentScale.Crop,
    )
}

@Composable
private fun ProjectInfoScreenIndexPosterCaption() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "A museum-quality poster made on thick and durable matte paper.",
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
private fun ProjectInfoScreenIndexPosterButton(navigateToPosterShop: () -> Unit) {
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
private fun ProjectInfoScreenInfoTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "More about this project",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun ProjectInfoScreenColophonTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Colophon",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun ProjectInfoScreenColophonContent() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            buildAnnotatedString {
                append(
                    text = "Tools used to create this site include ",
                )

                withLink(
                    link =
                        LinkAnnotation.Url(
                            url = "https://www.sketch.com/",
                        ),
                ) {
                    withStyle(
                        style =
                            SpanStyle(
                                textDecoration = TextDecoration.Underline,
                            ),
                    ) {
                        append(text = "Sketch App")
                    }
                }

                append(
                    text = " for design, ",
                )

                withLink(
                    link =
                        LinkAnnotation.Url(
                            url = "https://gohugo.io/",
                        ),
                ) {
                    withStyle(
                        style =
                            SpanStyle(
                                textDecoration = TextDecoration.Underline,
                            ),
                    ) {
                        append(text = "Hugo")
                    }
                }

                append(
                    text = " for static site generation, and ",
                )

                withLink(
                    link =
                        LinkAnnotation.Url(
                            url = "https://gohugo.io/hugo-pipes/introduction/",
                        ),
                ) {
                    withStyle(
                        style =
                            SpanStyle(
                                textDecoration = TextDecoration.Underline,
                            ),
                    ) {
                        append(text = "Hugo Pipes")
                    }
                }

                append(text = " for asset processing. Typography is set in ")

                withLink(
                    link =
                        LinkAnnotation.Url(
                            url = "https://www.ibm.com/plex/",
                        ),
                ) {
                    withStyle(
                        style =
                            SpanStyle(
                                textDecoration = TextDecoration.Underline,
                            ),
                    ) {
                        append(text = "IBM Plex Sans and Plex Mono")
                    }
                }

                append(text = ", an open-source typeface by IBM.")
            },
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
private fun ProjectInfoScreenDivider() {
    HorizontalDivider(
        modifier = Modifier.padding(all = 14.dp),
        thickness = 3.dp,
        color = MaterialTheme.colorScheme.onBackground,
    )
}

@Composable
private fun ProjectInfoScreenContactTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Contact",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun ProjectInfoScreenContactCaption() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Feel free to reach out with feedback, questions or just to say hello.",
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
private fun ProjectInfoScreenContactBoxTitle(title: String) {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = title,
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun ProjectInfoScreenContactBox(
    value: String,
    onValueChange: (String) -> Unit,
    keyboardOptions: KeyboardOptions,
    height: Dp = 56.dp
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier.padding(all = 14.dp).height(height = height).fillMaxWidth(),
        colors =
            TextFieldDefaults.colors(
                cursorColor = MaterialTheme.colorScheme.onBackground,
                focusedContainerColor = MaterialTheme.colorScheme.background,
                unfocusedContainerColor = MaterialTheme.colorScheme.background,
                focusedIndicatorColor = MaterialTheme.colorScheme.onBackground,
                unfocusedIndicatorColor = MaterialTheme.colorScheme.onBackground,
            ),
        shape = RoundedCornerShape(size = 21.dp),
        keyboardOptions = keyboardOptions,
        textStyle = TextStyle(
            fontSize = 18.sp,
            color = MaterialTheme.colorScheme.onBackground,
            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        )
    )
}

@Composable
private fun ProjectInfoScreenContactButton() {
    Button(
        modifier =
            Modifier
                .padding(all = 14.dp),
        onClick = {

        },
        colors =
            ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
            ),
    ) {
        Text(
            text = "SEND",
            color = MaterialTheme.colorScheme.onPrimary,
            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
        )
    }
}