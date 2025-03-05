package emmanuelmuturia.lawsofux.commons.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowDropDown
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import emmanuelmuturia.lawsofux.R

@Composable
fun LawsOfUXTopAppBar() {
    var screensMenuExpanded by remember { mutableStateOf(value = false) }
    var languagesMenuExpanded by remember { mutableStateOf(value = false) }

    Row(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Image(
            modifier = Modifier.size(size = 24.dp),
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Laws of UX Logo",
            contentScale = ContentScale.Crop,
        )

        Box(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(all = 14.dp)
                    .background(color = MaterialTheme.colorScheme.primary),
        ) {
            Row(modifier = Modifier.clickable { screensMenuExpanded = !screensMenuExpanded }) {
                Icon(
                    imageVector = if (screensMenuExpanded) Icons.Rounded.Clear else Icons.Rounded.Menu,
                    contentDescription = if (screensMenuExpanded) "Close Menu Button" else "Open Menu Button",
                    modifier = Modifier.size(size = 14.dp),
                    tint = MaterialTheme.colorScheme.onPrimary,
                )
                Spacer(modifier = Modifier.width(width = 8.dp))
                Text(
                    text = "MENU",
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                )
            }

            DropdownMenu(
                expanded = screensMenuExpanded,
                onDismissRequest = { screensMenuExpanded = false },
            ) {
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "ARTICLES",
                            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Navigate to ARTICLES...
                    },
                )

                DropdownMenuItem(
                    text = {
                        Text(
                            text = "BOOK",
                            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Navigate to BOOK...
                    },
                )

                DropdownMenuItem(
                    text = {
                        Text(
                            text = "CARDS",
                            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Navigate to CARDS...
                    },
                )

                DropdownMenuItem(
                    text = {
                        Text(
                            text = "INFO",
                            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Navigate to INFO...
                    },
                )

                DropdownMenuItem(
                    text = {
                        Text(
                            text = "STORE",
                            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Navigate to STORE...
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Rounded.ShoppingCart,
                            contentDescription = "Store Icon",
                            tint = MaterialTheme.colorScheme.onPrimary,
                        )
                    },
                )
            }
        }

        IconButton(onClick = {
            // Toggle Dark Mode and Light Mode...
        }) {
            Icon(
                imageVector =
                    if (isSystemInDarkTheme()) {
                        ImageVector.vectorResource(id = R.drawable.light_mode)
                    } else {
                        ImageVector.vectorResource(
                            id = R.drawable.dark_mode,
                        )
                    },
                contentDescription = "Toggle Dark Mode and Light Mode",
                tint = MaterialTheme.colorScheme.onBackground,
            )
        }

        Box(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(all = 14.dp)
                    .background(color = MaterialTheme.colorScheme.primary),
        ) {
            Row(modifier = Modifier.clickable { languagesMenuExpanded = !languagesMenuExpanded }) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.language),
                    contentDescription = "Languages Icon",
                    modifier = Modifier.size(size = 14.dp),
                    tint = MaterialTheme.colorScheme.onPrimary,
                )
                Spacer(modifier = Modifier.width(width = 8.dp))
                Text(
                    // This should be dynamic...
                    text = "ENGLISH",
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                )
                Icon(
                    imageVector = if (languagesMenuExpanded) Icons.Rounded.KeyboardArrowUp else Icons.Rounded.ArrowDropDown,
                    contentDescription = "Dropdown Icon",
                    modifier = Modifier.size(size = 14.dp),
                    tint = MaterialTheme.colorScheme.onPrimary,
                )
            }

            DropdownMenu(
                expanded = languagesMenuExpanded,
                onDismissRequest = { languagesMenuExpanded = false },
            ) {
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "Español",
                            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Change language to Spanish...
                    },
                )

                DropdownMenuItem(
                    text = {
                        Text(
                            text = "Français",
                            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Change language to French...
                    },
                )
            }
        }
    }
}