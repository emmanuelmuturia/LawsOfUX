package emmanuelmuturia.lawsofux.commons.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emmanuelmuturia.lawsofux.R

@Composable
fun LawsOfUXExtraCardItem(
    title: String,
    content: String,
) {
    Card(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(all = 14.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                modifier = Modifier.padding(all = 14.dp),
                text = title,
                fontSize = 21.sp,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
                fontWeight = FontWeight.ExtraBold,
            )

            Text(
                modifier = Modifier.padding(all = 14.dp),
                text = content,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
            )

            Row(
                modifier = Modifier.padding(end = 14.dp),
                horizontalArrangement = Arrangement.End,
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.diagonal_arrow),
                    contentDescription = "Further Reading Icon",
                    modifier = Modifier.padding(all = 14.dp),
                    tint = MaterialTheme.colorScheme.onBackground,
                )
            }
        }
    }
}