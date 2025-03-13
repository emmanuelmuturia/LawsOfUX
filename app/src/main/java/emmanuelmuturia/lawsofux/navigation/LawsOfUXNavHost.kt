package emmanuelmuturia.lawsofux.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import emmanuelmuturia.lawsofux.commons.theme.LawsOfUXTheme
import emmanuelmuturia.lawsofux.home.ui.navigation.HomeDetailsScreen
import emmanuelmuturia.lawsofux.home.ui.navigation.HomeScreen
import emmanuelmuturia.lawsofux.home.ui.navigation.homeDetailsScreen
import emmanuelmuturia.lawsofux.home.ui.navigation.homeScreen

@Composable
fun LawsOfUXNavHost() {

    val navController = rememberNavController()

    LawsOfUXTheme {
        Surface(
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.background)
                .fillMaxSize()
        ) {
            NavHost(navController = navController, startDestination = HomeScreen) {

                homeScreen(
                    navigateToHomeDetailsScreen = { uxLaw ->
                        navController.navigate(route = HomeDetailsScreen(
                            uxLaw = uxLaw
                        ))
                    }
                )

                homeDetailsScreen(
                    navigateBack = { navController.popBackStack() },
                    navigateToPosterShop = {
                        // Navigate to the Poster Shop...
                    }
                )

            }
        }
    }

}