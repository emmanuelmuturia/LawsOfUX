package emmanuelmuturia.lawsofux.info.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import emmanuelmuturia.lawsofux.info.ui.screen.InfoScreen
import emmanuelmuturia.lawsofux.info.ui.viewmodel.InfoScreenViewModel
import kotlinx.serialization.Serializable

@Serializable
object InfoScreen

fun NavGraphBuilder.infoScreen(
    navigateToArticlesScreen: () -> Unit,
    navigateToCardsScreen: () -> Unit,
    navigateToPosterShop: () -> Unit,
    infoScreenViewModel: InfoScreenViewModel,
    navigateToBookScreen: () -> Unit,
    navigateToInfoScreen: () -> Unit,
) {
    composable<InfoScreen> {
        InfoScreen(
            navigateToCardsScreen = navigateToCardsScreen,
            navigateToArticlesScreen = navigateToArticlesScreen,
            navigateToPosterShop = navigateToPosterShop,
            infoScreenViewModel = infoScreenViewModel,
            navigateToBookScreen = navigateToBookScreen,
            navigateToInfoScreen = navigateToInfoScreen,
        )
    }
}