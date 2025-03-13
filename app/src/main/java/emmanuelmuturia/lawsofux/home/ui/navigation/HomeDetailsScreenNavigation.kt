package emmanuelmuturia.lawsofux.home.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import emmanuelmuturia.lawsofux.home.ui.screen.HomeDetailsScreen
import kotlinx.serialization.Serializable

@Serializable
object HomeDetailsScreen

fun NavGraphBuilder.homeDetailsScreen() {
    composable<HomeDetailsScreen> {
        HomeDetailsScreen()
    }
}