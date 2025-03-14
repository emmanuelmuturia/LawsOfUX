package emmanuelmuturia.lawsofux.commons.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.Alignment
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
        modifier =
            Modifier
                .fillMaxWidth()
                .height(height = 140.dp)
                .background(color = MaterialTheme.colorScheme.background)
                .padding(start = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        // Left section: Logo...
        Image(
            modifier = Modifier.size(size = 35.dp),
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Laws of UX Logo",
            contentScale = ContentScale.Crop,
        )

        // Center section: Menu Icon and Text with its Dropdown Menu...
        Box {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 14.dp),
            ) {
                // Menu icon that toggles the Dropdown...
                Icon(
                    imageVector =
                        if (screensMenuExpanded) {
                            Icons.Rounded.Clear
                        } else {
                            Icons.Rounded.Menu
                        },
                    contentDescription =
                        if (screensMenuExpanded) {
                            "Close Menu Button"
                        } else {
                            "Open Menu Button"
                        },
                    modifier =
                        Modifier
                            .size(size = 24.dp)
                            .clickable { screensMenuExpanded = !screensMenuExpanded },
                    tint = MaterialTheme.colorScheme.onPrimary,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "MENU",
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontFamily = FontFamily(Font(resId = R.font.ibm_plex_mono_regular)),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.clickable { screensMenuExpanded = !screensMenuExpanded },
                )
            }
            // Dropdown Menu for Screens...
            DropdownMenu(
                expanded = screensMenuExpanded,
                onDismissRequest = { screensMenuExpanded = false },
                modifier = Modifier.background(color = MaterialTheme.colorScheme.primary),
            ) {
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "ARTICLES",
                            fontFamily =
                                FontFamily(
                                    fonts =
                                        listOf(
                                            Font(resId = R.font.ibm_plex_mono_regular),
                                        ),
                                ),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Navigate to ARTICLES...
                        screensMenuExpanded = false
                    },
                )
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "BOOK",
                            fontFamily = FontFamily(Font(resId = R.font.ibm_plex_mono_regular)),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Navigate to BOOK...
                        screensMenuExpanded = false
                    },
                )
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "CARDS",
                            fontFamily =
                                FontFamily(
                                    fonts =
                                        listOf(
                                            Font(resId = R.font.ibm_plex_mono_regular),
                                        ),
                                ),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Navigate to CARDS...
                        screensMenuExpanded = false
                    },
                )
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "INFO",
                            fontFamily = FontFamily(Font(resId = R.font.ibm_plex_mono_regular)),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Navigate to INFO...
                        screensMenuExpanded = false
                    },
                )
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "STORE",
                            fontFamily =
                                FontFamily(
                                    fonts =
                                        listOf(
                                            Font(resId = R.font.ibm_plex_mono_regular),
                                        ),
                                ),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Navigate to STORE...
                        screensMenuExpanded = false
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

        // Right Section: Dark Mode Toggle and Language Dropdown...
        Box {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(end = 16.dp),
            ) {
                IconButton(onClick = {
                    // Toggle Dark Mode and Light Mode...
                }) {
                    Icon(
                        imageVector =
                            if (isSystemInDarkTheme()) {
                                ImageVector.vectorResource(id = R.drawable.light_mode)
                            } else {
                                ImageVector.vectorResource(id = R.drawable.dark_mode)
                            },
                        contentDescription = "Toggle Dark Mode and Light Mode",
                        tint = MaterialTheme.colorScheme.onPrimary,
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.clickable { languagesMenuExpanded = !languagesMenuExpanded },
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.language),
                        contentDescription = "Languages Icon",
                        modifier = Modifier.size(size = 24.dp),
                        tint = MaterialTheme.colorScheme.onPrimary,
                    )
                    Spacer(modifier = Modifier.width(width = 4.dp))
                    Text(
                        // This should be dynamic...
                        text = "ENGLISH",
                        color = MaterialTheme.colorScheme.onPrimary,
                        fontFamily =
                            FontFamily(
                                fonts =
                                    listOf(
                                        Font(resId = R.font.ibm_plex_mono_regular),
                                    ),
                            ),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                    )
                    Icon(
                        imageVector =
                            if (languagesMenuExpanded) {
                                Icons.Rounded.KeyboardArrowUp
                            } else {
                                Icons.Rounded.ArrowDropDown
                            },
                        contentDescription = "Dropdown Icon",
                        modifier = Modifier.size(size = 24.dp),
                        tint = MaterialTheme.colorScheme.onPrimary,
                    )
                }
            }
            // Dropdown menu for languages
            DropdownMenu(
                expanded = languagesMenuExpanded,
                onDismissRequest = { languagesMenuExpanded = false },
                modifier = Modifier.background(color = MaterialTheme.colorScheme.primary),
            ) {
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "Español",
                            fontFamily =
                                FontFamily(
                                    fonts =
                                        listOf(
                                            Font(resId = R.font.ibm_plex_mono_regular),
                                        ),
                                ),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Change language to Spanish...
                        languagesMenuExpanded = false
                    },
                )
                DropdownMenuItem(
                    text = {
                        Text(
                            text = "Français",
                            fontFamily =
                                FontFamily(
                                    fonts =
                                        listOf(
                                            Font(resId = R.font.ibm_plex_mono_regular),
                                        ),
                                ),
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 21.sp,
                        )
                    },
                    onClick = {
                        // Change language to French...
                        languagesMenuExpanded = false
                    },
                )
            }
        }
    }
}