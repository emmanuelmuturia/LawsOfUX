package emmanuelmuturia.lawsofux.articles.ui.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.articles.data.model.Article
import emmanuelmuturia.lawsofux.articles.ui.state.ArticlesScreenUIState
import emmanuelmuturia.lawsofux.articles.ui.viewmodel.ArticlesScreenViewModel
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXFooter
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXTopAppBar
import kotlinx.coroutines.launch

@Composable
fun ArticlesScreen(
    modifier: Modifier = Modifier,
    articlesScreenViewModel: ArticlesScreenViewModel,
    navigateToArticlesScreen: () -> Unit,
    navigateToArticlesDetailsPage: () -> Unit,
    navigateToCardsScreen: () -> Unit,
    navigateToBookScreen: () -> Unit,
    navigateToInfoScreen: () -> Unit,
) {
    val articlesScreenListState = rememberLazyListState()

    val showScrollToTopButton by remember {
        derivedStateOf {
            articlesScreenListState.firstVisibleItemIndex > 0
        }
    }

    val articlesScreenCoroutineScope = rememberCoroutineScope()

    val articlesScreenUIState by
        articlesScreenViewModel.articlesScreenUIState.collectAsStateWithLifecycle()

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
                        articlesScreenCoroutineScope.launch {
                            articlesScreenListState.animateScrollToItem(index = 0)
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
        ArticlesScreenContent(
            modifier = modifier.padding(paddingValues = paddingValues),
            articlesScreenUIState = articlesScreenUIState,
            articlesScreenListState = articlesScreenListState,
            navigateToArticlesDetailsPage = navigateToArticlesDetailsPage,
            navigateToInfoScreen = navigateToInfoScreen,
        )
    }
}

@Composable
private fun ArticlesScreenContent(
    modifier: Modifier = Modifier,
    articlesScreenListState: LazyListState,
    articlesScreenUIState: ArticlesScreenUIState,
    navigateToArticlesDetailsPage: () -> Unit,
    navigateToInfoScreen: () -> Unit,
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        state = articlesScreenListState,
    ) {
        item(
            key = "ArticlesScreenText"
        ) {
            ArticlesScreenText()
        }

        items(items = articlesScreenUIState.articles, key = {
            TODO()
        }) { article ->
            ArticlesCardItem(
                article = article,
                navigateToArticlesDetailsPage = navigateToArticlesDetailsPage,
            )
        }

        item(
           key = "LawsOfUXFooter"
        ) {
            LawsOfUXFooter(
                navigateToInfoScreen = navigateToInfoScreen,
            )
        }
    }
}

@Composable
private fun ArticlesScreenText() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Selected articles on the intersection of psychology and user experience.",
        fontSize = 28.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.Bold,
        lineHeight = 37.sp,
    )
}

@Composable
private fun ArticlesCardItem(
    article: Article,
    navigateToArticlesDetailsPage: () -> Unit,
) {
    Card(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(all = 14.dp)
                .clickable {
                    navigateToArticlesDetailsPage()
                },
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = article.articleThumbnail),
                contentDescription = "Home Screen Content Thumbnail",
                contentScale = ContentScale.Crop,
            )

            Text(
                modifier = Modifier.padding(all = 14.dp),
                text = article.articleTitle,
                fontSize = 25.sp,
                color = MaterialTheme.colorScheme.onSurface,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
                fontWeight = FontWeight.ExtraBold,
            )

            Text(
                modifier = Modifier.padding(all = 14.dp),
                text = article.articleDescription,
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.onSurface,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
            )
        }
    }
}