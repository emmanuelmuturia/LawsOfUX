package emmanuelmuturia.lawsofux.commons.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emmanuelmuturia.lawsofux.R
import java.util.Calendar

@Composable
fun LawsOfUXFooter(
    navigateToInfoScreen: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(all = 21.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(space = 7.dp),
    ) {
        Text(
            text = "Laws of UX © Jon Yablonski ${getCurrentYear()}",
            color = MaterialTheme.colorScheme.onPrimary,
            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
        )

        Row {
            Text(
                modifier = Modifier.clickable {
                    navigateToInfoScreen()
                },
                text = buildAnnotatedString {
                    withStyle(
                        style =
                        SpanStyle(
                            textDecoration = TextDecoration.Underline,
                        ),
                    ) {
                        append(text = "Contact")
                    }
                },
                color = MaterialTheme.colorScheme.onPrimary,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
            )

            Text(
                text = " | ",
                color = MaterialTheme.colorScheme.onPrimary,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
            )

            Text(
                text = buildAnnotatedString {
                    withLink(
                        link =
                        LinkAnnotation.Url(
                            url = "https://creativecommons.org/licenses/by-nc-nd/4.0/",
                        ),
                    ) {
                        withStyle(
                            style =
                            SpanStyle(
                                textDecoration = TextDecoration.Underline,
                            ),
                        ) {
                            append("Licence")
                            // I need to figure out how to append the Click icon...
                        }
                    }
                },
                color = MaterialTheme.colorScheme.onPrimary,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
            )
        }
    }
}

private fun getCurrentYear(): String {
    return "${Calendar.getInstance().get(Calendar.YEAR)}"
}