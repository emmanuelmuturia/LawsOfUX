package emmanuelmuturia.lawsofux.book.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import emmanuelmuturia.lawsofux.book.ui.screen.BookScreen
import emmanuelmuturia.lawsofux.book.ui.viewmodel.BookScreenViewModel
import kotlinx.serialization.Serializable

@Serializable
object BookScreen

fun NavGraphBuilder.bookScreen(
    navigateToArticlesScreen: () -> Unit,
    navigateToCardsScreen: () -> Unit,
    navigateToAmazon: () -> Unit,
    navigateToOreilly: () -> Unit,
    navigateToBootcamp: () -> Unit,
    bookScreenViewModel: BookScreenViewModel
) {
    composable<BookScreen> {
        BookScreen(
            navigateToArticlesScreen = navigateToArticlesScreen,
            navigateToCardsScreen = navigateToCardsScreen,
            navigateToAmazon = navigateToAmazon,
            navigateToOreilly = navigateToOreilly,
            navigateToBootcamp = navigateToBootcamp,
            bookScreenViewModel = bookScreenViewModel,
        )
    }
}