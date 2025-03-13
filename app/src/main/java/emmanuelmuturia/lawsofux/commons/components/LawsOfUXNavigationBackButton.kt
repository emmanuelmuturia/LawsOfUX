package emmanuelmuturia.lawsofux.commons.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import emmanuelmuturia.lawsofux.R

@Composable
fun LawsOfUXNavigationBackButton(navigateBack: () -> Unit) {
    Button(
        modifier = Modifier.fillMaxWidth().padding(all = 7.dp),
        onClick = navigateBack,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
        )
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
            contentDescription = "Back Button",
            tint = MaterialTheme.colorScheme.onPrimary
        )

        Text(
            text = "BACK TO ALL",
            color = MaterialTheme.colorScheme.onPrimary,
            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
        )
    }
}