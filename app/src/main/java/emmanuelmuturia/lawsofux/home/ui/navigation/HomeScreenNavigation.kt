package emmanuelmuturia.lawsofux.home.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import emmanuelmuturia.lawsofux.home.ui.screen.HomeScreen
import kotlinx.serialization.Serializable

@Serializable
object HomeScreen

fun NavGraphBuilder.homeScreen() {
    composable<HomeScreen> {
        HomeScreen()
    }
}