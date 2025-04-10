package emmanuelmuturia.lawsofux.articles.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import emmanuelmuturia.lawsofux.articles.ui.screen.ArticlesScreen
import emmanuelmuturia.lawsofux.articles.ui.viewmodel.ArticlesScreenViewModel
import kotlinx.serialization.Serializable

@Serializable
object ArticlesScreen

fun NavGraphBuilder.articlesScreen(
    articlesScreenViewModel: ArticlesScreenViewModel,
    navigateToArticlesScreen: () -> Unit,
    navigateToArticlesDetailsPage: () -> Unit,
    navigateToCardsScreen: () -> Unit,
    navigateToBookScreen: () -> Unit,
    navigateToInfoScreen: () -> Unit,
) {
    composable<ArticlesScreen> {
        ArticlesScreen(
            articlesScreenViewModel = articlesScreenViewModel,
            navigateToArticlesScreen = navigateToArticlesScreen,
            navigateToArticlesDetailsPage = navigateToArticlesDetailsPage,
            navigateToCardsScreen = navigateToCardsScreen,
            navigateToBookScreen = navigateToBookScreen,
            navigateToInfoScreen = navigateToInfoScreen,
        )
    }
}