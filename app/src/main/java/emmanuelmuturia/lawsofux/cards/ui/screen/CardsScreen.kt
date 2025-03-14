package emmanuelmuturia.lawsofux.cards.ui.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
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
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.cards.ui.state.CardsScreenUIState
import emmanuelmuturia.lawsofux.cards.ui.viewmodel.CardsScreenViewModel
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXExtraCardItem
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXFooter
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXTopAppBar
import kotlinx.coroutines.launch

@Composable
fun CardsScreen(
    navigateToArticlesScreen: () -> Unit,
    navigateToDeckShop: () -> Unit,
    cardsScreenViewModel: CardsScreenViewModel,
    navigateToCardsScreen: () -> Unit,
) {

    val cardsScreenListState = rememberLazyListState()

    val showScrollToTopButton by remember {
        derivedStateOf {
            cardsScreenListState.firstVisibleItemIndex > 0
        }
    }

    val cardsScreenCoroutineScope = rememberCoroutineScope()

    val cardsScreenUIState by cardsScreenViewModel.cardsScreenUIState.collectAsStateWithLifecycle()

    Scaffold(
        modifier =
        Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
        topBar = {
            LawsOfUXTopAppBar(
                navigateToArticlesScreen = navigateToArticlesScreen,
                navigateToCardsScreen = navigateToCardsScreen
            )
        },
        floatingActionButton = {
            AnimatedVisibility(visible = showScrollToTopButton) {
                FloatingActionButton(
                    modifier = Modifier.clip(shape = RoundedCornerShape(size = 21.dp)),
                    onClick = {
                        cardsScreenCoroutineScope.launch {
                            cardsScreenListState.animateScrollToItem(index = 0)
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
        CardsScreenContent(
            modifier = Modifier.padding(paddingValues = paddingValues),
            cardsScreenListState = cardsScreenListState,
            navigateToDeckShop = navigateToDeckShop,
            cardsScreenUIState = cardsScreenUIState
        )
    }

}

@Composable
private fun CardsScreenContent(
    modifier: Modifier = Modifier,
    cardsScreenListState: LazyListState,
    cardsScreenUIState: CardsScreenUIState,
    navigateToDeckShop: () -> Unit
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        state = cardsScreenListState
    ) {

        item {
            CardsScreenText()
        }

        item {
            CardsScreenImage()
        }

        item {
            CardsScreenContentTitle()
        }

        item {
            CardsScreenContentText()
        }

        item {
            CardsScreenButton(navigateToDeckShop = navigateToDeckShop)
        }

        item {
            CardsScreenRelatedTitle()
        }

        items(items = cardsScreenUIState.cards) { card ->
            LawsOfUXExtraCardItem(
                title = card.cardTitle,
                content = card.cardDescription
            )
        }

        item {
            LawsOfUXFooter()
        }

    }
}

@Composable
private fun CardsScreenText() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "A card deck of psychological principles that help you design and justify your " +
            "user interfaces.",
        fontSize = 28.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.Bold,
    )
}

@Composable
private fun CardsScreenContentTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "The UX Designer’s secret weapon",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
private fun CardsScreenContentText() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = buildAnnotatedString {

            append(text = "The UX Designer’s secret weapon, brought to you by Laws of UX & ")

            withLink(
                link =
                LinkAnnotation.Url(
                    url = "https://pipdecks.com/",
                ),
            ) {
                withStyle(
                    style =
                    SpanStyle(
                        textDecoration = TextDecoration.Underline,
                    ),
                ) {
                    append(text = "Pip Decks")
                }
            }

            append(
                text = ". Each deck includes 54 psychological principles and UX methods that " +
                    "help you design and justify your user interfaces, get buy-in from stakeholders " +
                    "and empower your design team."
            )

        },
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
private fun CardsScreenButton(navigateToDeckShop: () -> Unit) {
    Button(
        modifier =
        Modifier
            .padding(all = 7.dp),
        onClick = navigateToDeckShop,
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
private fun CardsScreenImage() {
    Image(
        painter = painterResource(id = R.drawable.card_screen_image),
        contentDescription = "Cards Screen Image",
        modifier = Modifier.padding(all = 14.dp).fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun CardsScreenRelatedTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Related",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}