package emmanuelmuturia.lawsofux.info.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import emmanuelmuturia.lawsofux.info.ui.screen.ProjectInfoScreen
import emmanuelmuturia.lawsofux.info.ui.viewmodel.ProjectInfoScreenViewModel
import kotlinx.serialization.Serializable

@Serializable
object ProjectInfoScreen

fun NavGraphBuilder.projectInfoScreen(
    navigateToArticlesScreen: () -> Unit,
    navigateToCardsScreen: () -> Unit,
    navigateToPosterShop: () -> Unit,
    projectInfoScreenViewModel: ProjectInfoScreenViewModel
) {
    composable<ProjectInfoScreen> {
        ProjectInfoScreen(
            navigateToCardsScreen = navigateToCardsScreen,
            navigateToArticlesScreen = navigateToArticlesScreen,
            navigateToPosterShop = navigateToPosterShop,
            projectInfoScreenViewModel = projectInfoScreenViewModel
        )
    }
}