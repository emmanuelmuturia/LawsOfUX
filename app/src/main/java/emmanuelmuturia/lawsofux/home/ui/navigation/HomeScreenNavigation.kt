package emmanuelmuturia.lawsofux.home.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import emmanuelmuturia.lawsofux.home.data.model.UXLaw
import emmanuelmuturia.lawsofux.home.ui.screen.HomeScreen
import kotlinx.serialization.Serializable

@Serializable
object HomeScreen

fun NavGraphBuilder.homeScreen(
    navigateToHomeDetailsScreen: (UXLaw) -> Unit,
    navigateToArticlesScreen: () -> Unit,
    navigateToCardsScreen: () -> Unit,
    navigateToBookScreen: () -> Unit,
    navigateToInfoScreen: () -> Unit,
) {
    composable<HomeScreen> {
        HomeScreen(
            navigateToHomeDetailsScreen = navigateToHomeDetailsScreen,
            navigateToArticlesScreen = navigateToArticlesScreen,
            navigateToCardsScreen = navigateToCardsScreen,
            navigateToBookScreen = navigateToBookScreen,
            navigateToInfoScreen = navigateToInfoScreen,
        )
    }
}