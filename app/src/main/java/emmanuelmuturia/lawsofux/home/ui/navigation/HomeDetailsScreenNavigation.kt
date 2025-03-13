package emmanuelmuturia.lawsofux.home.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import emmanuelmuturia.lawsofux.home.data.model.UXLaw
import emmanuelmuturia.lawsofux.home.ui.screen.HomeDetailsScreen
import emmanuelmuturia.lawsofux.home.ui.viewmodel.HomeScreenViewModel
import emmanuelmuturia.lawsofux.navigation.navType.CustomNavType
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlin.reflect.typeOf

@Serializable
data class HomeDetailsScreen(val uxLaw: UXLaw)

fun NavGraphBuilder.homeDetailsScreen(
    navigateBack: () -> Unit,
    navigateToPosterShop: () -> Unit,
    homeScreenViewModel: HomeScreenViewModel
) {
    composable<HomeDetailsScreen>(
        typeMap = mapOf(
            typeOf<UXLaw>() to CustomNavType.uxLawType
        )
    ) { backStackEntry ->
        HomeDetailsScreen(
            navigateBack = navigateBack,
            uxLaw = backStackEntry.toRoute<HomeDetailsScreen>().uxLaw,
            navigateToPosterShop = navigateToPosterShop,
            homeScreenViewModel = homeScreenViewModel
        )
    }
}