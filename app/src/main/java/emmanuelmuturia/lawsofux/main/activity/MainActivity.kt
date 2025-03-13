package emmanuelmuturia.lawsofux.main.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import emmanuelmuturia.lawsofux.commons.theme.LawsOfUXTheme
import emmanuelmuturia.lawsofux.home.ui.screen.HomeScreen
import emmanuelmuturia.lawsofux.navigation.LawsOfUXNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LawsOfUXNavHost()
        }
    }
}