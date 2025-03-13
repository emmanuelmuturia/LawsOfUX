package emmanuelmuturia.lawsofux.home.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import emmanuelmuturia.lawsofux.home.data.model.UXLaw
import emmanuelmuturia.lawsofux.home.ui.screen.HomeDetailsScreen
import kotlinx.serialization.Serializable

@Serializable
data class HomeDetailsScreen(val uxLaw: UXLaw)

fun NavGraphBuilder.homeDetailsScreen(
    navigateBack: () -> Unit,
    navigateToPosterShop: () -> Unit
) {
    composable<HomeDetailsScreen> { backStackEntry ->
        HomeDetailsScreen(
            navigateBack = navigateBack,
            uxLaw = backStackEntry.toRoute(),
            navigateToPosterShop = navigateToPosterShop
        )
    }
}