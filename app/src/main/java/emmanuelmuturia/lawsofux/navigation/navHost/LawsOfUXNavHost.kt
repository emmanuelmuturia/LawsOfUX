package emmanuelmuturia.lawsofux.navigation.navHost

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import emmanuelmuturia.lawsofux.articles.ui.navigation.ArticlesScreen
import emmanuelmuturia.lawsofux.articles.ui.navigation.articlesScreen
import emmanuelmuturia.lawsofux.articles.ui.viewmodel.ArticlesScreenViewModel
import emmanuelmuturia.lawsofux.book.ui.navigation.BookScreen
import emmanuelmuturia.lawsofux.book.ui.navigation.bookScreen
import emmanuelmuturia.lawsofux.book.ui.viewmodel.BookScreenViewModel
import emmanuelmuturia.lawsofux.cards.ui.navigation.CardsScreen
import emmanuelmuturia.lawsofux.cards.ui.navigation.cardsScreen
import emmanuelmuturia.lawsofux.cards.ui.viewmodel.CardsScreenViewModel
import emmanuelmuturia.lawsofux.commons.theme.LawsOfUXTheme
import emmanuelmuturia.lawsofux.home.ui.navigation.HomeDetailsScreen
import emmanuelmuturia.lawsofux.home.ui.navigation.HomeScreen
import emmanuelmuturia.lawsofux.home.ui.navigation.homeDetailsScreen
import emmanuelmuturia.lawsofux.home.ui.navigation.homeScreen
import emmanuelmuturia.lawsofux.home.ui.viewmodel.HomeScreenViewModel
import emmanuelmuturia.lawsofux.info.ui.navigation.InfoScreen
import emmanuelmuturia.lawsofux.info.ui.navigation.infoScreen
import emmanuelmuturia.lawsofux.info.ui.viewmodel.InfoScreenViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun LawsOfUXNavHost() {
    val navController = rememberNavController()

    val homeScreenViewModel: HomeScreenViewModel = koinViewModel()

    val articlesScreenViewModel: ArticlesScreenViewModel = koinViewModel()

    val cardsScreenViewModel: CardsScreenViewModel = koinViewModel()

    val infoScreenViewModel: InfoScreenViewModel = koinViewModel()

    val bookScreenViewModel: BookScreenViewModel = koinViewModel()

    LawsOfUXTheme {
        Surface(
            modifier =
                Modifier
                    .background(color = MaterialTheme.colorScheme.background)
                    .fillMaxSize(),
        ) {
            NavHost(navController = navController, startDestination = HomeScreen) {
                homeScreen(
                    navigateToHomeDetailsScreen = { uxLaw ->
                        navController.navigate(
                            route =
                                HomeDetailsScreen(
                                    uxLaw = uxLaw,
                                ),
                        )
                    },
                    navigateToArticlesScreen = {
                        navController.navigate(route = ArticlesScreen)
                    },
                    navigateToCardsScreen = {
                        navController.navigate(route = CardsScreen)
                    },
                    navigateToBookScreen = {
                        navController.navigate(route = BookScreen)
                    },
                    navigateToInfoScreen = {
                        navController.navigate(route = InfoScreen)
                    },
                )

                homeDetailsScreen(
                    navigateBack = { navController.popBackStack() },
                    navigateToPosterShop = {
                        // Navigate to the Poster Shop...
                    },
                    homeScreenViewModel = homeScreenViewModel,
                )

                articlesScreen(
                    articlesScreenViewModel = articlesScreenViewModel,
                    navigateToArticlesScreen = {
                        navController.navigate(route = ArticlesScreen)
                    },
                    navigateToArticlesDetailsPage = {
                        // Navigate to the Articles Details Page...
                    },
                    navigateToCardsScreen = {
                        navController.navigate(route = CardsScreen)
                    },
                    navigateToBookScreen = {
                        navController.navigate(route = BookScreen)
                    },
                    navigateToInfoScreen = {
                        navController.navigate(route = InfoScreen)
                    },
                )

                cardsScreen(
                    navigateToArticlesScreen = {
                        navController.navigate(route = ArticlesScreen)
                    },
                    navigateToDeckShop = {
                        // Navigate to the Deck Shop...
                    },
                    cardsScreenViewModel = cardsScreenViewModel,
                    navigateToCardsScreen = {
                        navController.navigate(route = CardsScreen)
                    },
                    navigateToBookScreen = {
                        navController.navigate(route = BookScreen)
                    },
                    navigateToInfoScreen = {
                        navController.navigate(route = InfoScreen)
                    },
                )

                infoScreen(
                    navigateToArticlesScreen = {
                        navController.navigate(route = ArticlesScreen)
                    },
                    navigateToCardsScreen = {
                        navController.navigate(route = CardsScreen)
                    },
                    navigateToPosterShop = {
                        // Navigate to the Poster Shop...
                    },
                    infoScreenViewModel = infoScreenViewModel,
                    navigateToBookScreen = {
                        navController.navigate(route = BookScreen)
                    },
                    navigateToInfoScreen = {
                        navController.navigate(route = InfoScreen)
                    },
                )

                bookScreen(
                    navigateToArticlesScreen = {
                        navController.navigate(route = ArticlesScreen)
                    },
                    navigateToCardsScreen = {
                        navController.navigate(route = CardsScreen)
                    },
                    navigateToAmazon = {
                        // Navigate to the Amazon...
                    },
                    navigateToOreilly = {
                        // Navigate to the Oreilly...
                    },
                    navigateToBootcamp = {
                        // Navigate to the Bootcamp...
                    },
                    bookScreenViewModel = bookScreenViewModel,
                    navigateToBookScreen = {
                        navController.navigate(route = BookScreen)
                    },
                    navigateToInfoScreen = {
                        navController.navigate(route = InfoScreen)
                    },
                )
            }
        }
    }
}