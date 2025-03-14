package emmanuelmuturia.lawsofux.cards.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import emmanuelmuturia.lawsofux.cards.ui.screen.CardsScreen
import emmanuelmuturia.lawsofux.cards.ui.viewmodel.CardsScreenViewModel
import kotlinx.serialization.Serializable

@Serializable
object CardsScreen

fun NavGraphBuilder.cardsScreen(
    navigateToArticlesScreen: () -> Unit,
    navigateToDeckShop: () -> Unit,
    cardsScreenViewModel: CardsScreenViewModel,
    navigateToCardsScreen: () -> Unit,
) {
    composable<CardsScreen> {
        CardsScreen(
            navigateToArticlesScreen = navigateToArticlesScreen,
            cardsScreenViewModel = cardsScreenViewModel,
            navigateToDeckShop = navigateToDeckShop,
            navigateToCardsScreen = navigateToCardsScreen,
        )
    }
}