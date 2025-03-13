package emmanuelmuturia.lawsofux.commons.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.home.data.model.UXLaw

@Composable
fun LawsOfUXCardItem(
    uxLaw: UXLaw,
    navigateToHomeDetailsScreen: (UXLaw) -> Unit,
) {
    Card(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(all = 14.dp)
                .clickable {
                    navigateToHomeDetailsScreen(uxLaw)
                },
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = uxLaw.uxLawThumbnail),
                contentDescription = "Home Screen Content Thumbnail",
                contentScale = ContentScale.Crop,
            )

            Text(
                modifier = Modifier.padding(all = 14.dp),
                text = uxLaw.uxLawTitle,
                fontSize = 25.sp,
                color = MaterialTheme.colorScheme.onSurface,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
                fontWeight = FontWeight.ExtraBold,
            )

            Text(
                modifier = Modifier.padding(all = 14.dp),
                text = uxLaw.uxLawDescription,
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.onSurface,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
            )
        }
    }
}