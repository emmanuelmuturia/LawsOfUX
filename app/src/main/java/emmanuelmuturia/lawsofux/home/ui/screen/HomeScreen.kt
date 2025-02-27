package emmanuelmuturia.lawsofux.home.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * This is the app's Home Screen...
 */

@Composable
fun HomeScreen() {

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) { paddingValues ->
        HomeScreenContent(modifier = Modifier.padding(paddingValues = paddingValues))
    }

}

@Composable
fun HomeScreenContent(modifier: Modifier) {

}

@Composable
fun HomeScreenText() {

}

@Composable
fun HomeScreenNotification(modifier: Modifier = Modifier) {

}

@Composable
fun HomeScreenCardList(modifier: Modifier = Modifier) {

}

@Composable
fun HomeScreenCardItem(modifier: Modifier = Modifier) {

}