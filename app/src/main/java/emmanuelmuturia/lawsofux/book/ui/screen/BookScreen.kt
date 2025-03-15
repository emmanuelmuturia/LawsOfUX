package emmanuelmuturia.lawsofux.book.ui.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.book.ui.state.BookScreenUIState
import emmanuelmuturia.lawsofux.book.ui.viewmodel.BookScreenViewModel
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXExtraCardItem
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXFooter
import emmanuelmuturia.lawsofux.commons.components.LawsOfUXTopAppBar
import kotlinx.coroutines.launch

@Composable
fun BookScreen(
    modifier: Modifier = Modifier,
    navigateToArticlesScreen: () -> Unit,
    navigateToCardsScreen: () -> Unit,
    navigateToAmazon: () -> Unit,
    navigateToOreilly: () -> Unit,
    navigateToBootcamp: () -> Unit,
    bookScreenViewModel: BookScreenViewModel,
    navigateToBookScreen: () -> Unit,
    navigateToInfoScreen: () -> Unit,
) {
    val bookScreenListState = rememberLazyListState()

    val showScrollToTopButton by remember {
        derivedStateOf {
            bookScreenListState.firstVisibleItemIndex > 0
        }
    }

    val bookScreenCoroutineScope = rememberCoroutineScope()

    val bookScreenUIState by
        bookScreenViewModel.bookScreenUIState.collectAsStateWithLifecycle()

    Scaffold(
        modifier =
            Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background),
        topBar = {
            LawsOfUXTopAppBar(
                navigateToArticlesScreen = navigateToArticlesScreen,
                navigateToCardsScreen = navigateToCardsScreen,
                navigateToBookScreen = navigateToBookScreen,
                navigateToInfoScreen = navigateToInfoScreen,
            )
        },
        floatingActionButton = {
            AnimatedVisibility(visible = showScrollToTopButton) {
                FloatingActionButton(
                    modifier = Modifier.clip(shape = RoundedCornerShape(size = 21.dp)),
                    onClick = {
                        bookScreenCoroutineScope.launch {
                            bookScreenListState.animateScrollToItem(index = 0)
                        }
                    },
                    containerColor = MaterialTheme.colorScheme.primary,
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.arrow_up),
                        contentDescription = "Scroll to Top Button",
                        tint = MaterialTheme.colorScheme.onPrimary,
                    )
                }
            }
        },
    ) { paddingValues ->
        BookScreenContent(
            modifier = modifier.padding(paddingValues = paddingValues),
            bookScreenListState = bookScreenListState,
            navigateToAmazon = navigateToAmazon,
            navigateToOreilly = navigateToOreilly,
            navigateToBootcamp = navigateToBootcamp,
            bookScreenUIState = bookScreenUIState,
        )
    }
}

@Composable
fun BookScreenContent(
    modifier: Modifier = Modifier,
    bookScreenListState: LazyListState,
    navigateToAmazon: () -> Unit,
    navigateToOreilly: () -> Unit,
    navigateToBootcamp: () -> Unit,
    bookScreenUIState: BookScreenUIState,
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        state = bookScreenListState,
    ) {
        item {
            BookScreenText()
        }

        item {
            BookScreenImage()
        }

        item {
            BookScreenOverviewTitle()
        }

        item {
            BookScreenOverviewContent()
        }

        item {
            BookScreenNewBookTitle()
        }

        item {
            BookScreenNewBookContent()
        }

        item {
            BookScreenViewOnAmazonButton(
                navigateToAmazon = navigateToAmazon,
            )
        }

        item {
            BookScreenNewConceptsImage()
        }

        item {
            BookScreenNewConcepts()
        }

        item {
            BookScreenNewConsiderationsImage()
        }

        item {
            BookScreenNewConsiderations()
        }

        item {
            BookScreenNewTechniquesImage()
        }

        item {
            BookScreenNewTechniques()
        }

        item {
            HorizontalDivider(
                modifier = Modifier.padding(all = 14.dp),
                thickness = 3.dp,
                color = MaterialTheme.colorScheme.onBackground,
            )
        }

        item {
            BookScreenLessonsTitle()
        }

        itemsIndexed(items = bookScreenUIState.bookLessons) { index, bookLesson ->
            Text(
                modifier = Modifier.padding(start = 14.dp),
                text = "${index + 1}",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
                fontWeight = FontWeight.Bold,
            )

            HorizontalDivider(
                modifier = Modifier.padding(all = 14.dp),
                thickness = 3.dp,
                color = MaterialTheme.colorScheme.onBackground,
            )

            Text(
                modifier = Modifier.padding(all = 14.dp),
                text = bookLesson.bookLessonDescription,
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
                fontWeight = FontWeight.Bold,
            )
        }

        item {
            BookScreenReviewsTitle()
        }

        items(items = bookScreenUIState.bookReviews) { bookReview ->
            Text(
                modifier = Modifier.padding(start = 14.dp),
                text = "\"${bookReview.bookReviewCaption}\"",
                fontSize = 28.sp,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
            )

            Text(
                modifier = Modifier.padding(all = 14.dp),
                text = bookReview.bookReviewAuthor,
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Clip,
                fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
                fontWeight = FontWeight.Bold,
            )

            HorizontalDivider(
                modifier = Modifier.padding(all = 14.dp),
                thickness = 3.dp,
                color = MaterialTheme.colorScheme.onBackground,
            )
        }

        item {
            BookScreenGalleryTitle()
        }

        items(items = bookScreenUIState.bookGalleries) { bookGallery ->
            Image(
                painter = painterResource(id = bookGallery.bookGalleryImage),
                contentDescription = "Project Info Screen Image",
                modifier =
                    Modifier
                        .padding(all = 14.dp)
                        .fillMaxSize()
                        .clip(shape = RoundedCornerShape(size = 21.dp)),
                contentScale = ContentScale.Crop,
            )
        }

        item {
            BookScreenBookLocationsTitle()
        }

        item {
            BookScreenHorizontalDivider()
        }

        item {
            BookScreenSecondEditionTitle()
        }

        items(items = bookScreenUIState.bookSecondEditions) { bookSecondEdition ->
            LawsOfUXExtraCardItem(
                title = bookSecondEdition.bookSecondEditionTitle,
                content = bookSecondEdition.bookSecondEditionSeller,
            )
        }

        item {
            BookScreenSecondEditionBookImage()
        }

        item {
            BookScreenSecondEditionBookTitle()
        }

        item {
            BookScreenSecondEditionBookContent()
        }

        item {
            BookScreenSecondEditionBookButton(
                navigateToOreilly = navigateToOreilly,
            )
        }

        item {
            BookScreenFirstEditionTitle()
        }

        items(items = bookScreenUIState.bookFirstEditions) { bookFirstEdition ->
            LawsOfUXExtraCardItem(
                title = bookFirstEdition.bookFirstEditionTitle,
                content = bookFirstEdition.bookFirstEditionSeller,
            )
        }

        item {
            BookScreenTranslationsTitle()
        }

        item {
            BookScreenTranslatedSecondEditionTitle()
        }

        items(items = bookScreenUIState.bookTranslatedSecondEditions) { bookTranslatedSecondEdition ->
            LawsOfUXExtraCardItem(
                title = bookTranslatedSecondEdition.bookTranslatedSecondEditionTitle,
                content = bookTranslatedSecondEdition.bookTranslatedSecondEditionSeller,
            )
        }

        item {
            BookScreenTranslatedFirstEditionTitle()
        }

        items(items = bookScreenUIState.bookTranslatedFirstEditions) { bookTranslatedFirstEdition ->
            LawsOfUXExtraCardItem(
                title = bookTranslatedFirstEdition.bookTranslatedFirstEditionTitle,
                content = bookTranslatedFirstEdition.bookTranslatedFirstEditionSeller,
            )
        }

        item {
            BookScreenRelatedTitle()
        }

        item {
            BookScreenRelatedImage()
        }

        item {
            BookScreenRelatedContent()
        }

        item {
            BookScreenRelatedButton(
                navigateToBootcamp = navigateToBootcamp,
            )
        }

        item {
            LawsOfUXFooter()
        }
    }
}

@Composable
fun BookScreenText() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            "A designer’s guide to using psychology to design better digital products and " +
                "services.",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
fun BookScreenImage() {
    Image(
        painter = painterResource(id = R.drawable.laws_of_ux_book),
        contentDescription = "Project Info Screen Image",
        modifier =
            Modifier
                .padding(all = 14.dp)
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(size = 21.dp)),
        contentScale = ContentScale.Crop,
    )
}

@Composable
fun BookScreenOverviewTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Overview",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun BookScreenOverviewContent() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            "An understanding of psychology-specifically the psychology behind how users " +
                "behave and interact with digital interfaces-is perhaps the single most valuable " +
                "non-design skill a designer can have. The most elegant design can fail if it " +
                "forces users to conform to the design instead of working within the “blueprint” of " +
                "how humans perceive and process the world around them. This practical guide " +
                "explains " +
                "how you can apply key principles of psychology to build products and experiences " +
                "that " +
                "are more human-centered and intuitive. It deconstructs familiar apps and " +
                "experiences to provide clear examples of how UX designers can build interfaces " +
                "that adapt to how users perceive and process digital interfaces.",
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
fun BookScreenNewBookTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "New: 2nd Edition",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun BookScreenNewBookContent() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            "The craft of design has a dynamic nature that keeps evolving along with " +
                "technology. With every new technological advancement, new constraints and " +
                "possibilities are introduced. Since the first edition of this book, " +
                "LLMs (Large Language Models) have undergone significant advancements, AI-powered " +
                "image generation tools have emerged, spatial computing has entered the mainstream, " +
                "and smartphones have become even more powerful. However, the principles and " +
                "concepts covered in this book remain timeless, and they provide a solid " +
                "foundation for every designer, regardless of their level of expertise.\n" +
                "\n" +
                "To enhance the reader’s experience, the second edition includes additional " +
                "information linking these principles and concepts to psychology concepts, " +
                "techniques, and key considerations. This edition also features updated examples " +
                "throughout, making it a practical guide for designers who want to stay " +
                "up-to-date " +
                "with the latest trends and best practices in the field of design.",
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
fun BookScreenViewOnAmazonButton(navigateToAmazon: () -> Unit) {
    Button(
        modifier =
            Modifier
                .padding(all = 7.dp),
        onClick = navigateToAmazon,
        colors =
            ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
            ),
    ) {
        Text(
            text = "VIEW ON AMAZON",
            color = MaterialTheme.colorScheme.onPrimary,
            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
        )
    }
}

/*@Composable
fun BookScreenViewMoreBuyingOptionsText() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
        buildAnnotatedString {
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
                    append(text = "http://creativecommons.org/licenses/by-nc-nd/4.0/")
                }
            }
        },
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}*/

@Composable
private fun BookScreenNewConceptsImage() {
    Image(
        painter = painterResource(id = R.drawable.new_concepts),
        contentDescription = "New Concepts Image",
        modifier =
            Modifier
                .padding(all = 14.dp)
                .size(size = 70.dp),
        contentScale = ContentScale.Crop,
    )
}

@Composable
private fun BookScreenNewConcepts() {
    val newConcepts =
        listOf(
            "Paradox of Choice",
            "Complexity Bias",
            "Flow",
        )
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            buildAnnotatedString {
                withStyle(
                    style =
                        SpanStyle(
                            fontWeight = FontWeight.ExtraBold,
                        ),
                ) {
                    appendLine(value = "New Concepts")
                }
                newConcepts.forEach { newConcept ->
                    appendLine(value = "\u2022 $newConcept")
                }
            },
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
private fun BookScreenNewConsiderationsImage() {
    Image(
        painter = painterResource(id = R.drawable.new_considerations),
        contentDescription = "New Concepts Image",
        modifier =
            Modifier
                .padding(all = 14.dp)
                .size(size = 70.dp),
        contentScale = ContentScale.Crop,
    )
}

@Composable
private fun BookScreenNewConsiderations() {
    val newConsiderations =
        listOf(
            "The Human Factor",
            "Accessibility",
            "Paradox of the Active User",
            "Personalization",
        )
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            buildAnnotatedString {
                withStyle(
                    style =
                        SpanStyle(
                            fontWeight = FontWeight.ExtraBold,
                        ),
                ) {
                    appendLine(value = "New Concepts")
                }
                newConsiderations.forEach { newConsideration ->
                    appendLine(value = "\u2022 $newConsideration")
                }
            },
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
private fun BookScreenNewTechniquesImage() {
    Image(
        painter = painterResource(id = R.drawable.new_techniques),
        contentDescription = "New Concepts Image",
        modifier =
            Modifier
                .padding(all = 14.dp)
                .size(size = 70.dp),
        contentScale = ContentScale.Crop,
    )
}

@Composable
private fun BookScreenNewTechniques() {
    val newTechniques =
        listOf(
            "Contextual Inquiry",
            "User Interviews",
            "Eye-tracking",
        )
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            buildAnnotatedString {
                withStyle(
                    style =
                        SpanStyle(
                            fontWeight = FontWeight.ExtraBold,
                        ),
                ) {
                    appendLine(value = "New Concepts")
                }
                newTechniques.forEach { newTechnique ->
                    appendLine(value = "\u2022 $newTechnique")
                }
            },
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
private fun BookScreenLessonsTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "What you’ll learn",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun BookScreenReviewsTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Reviews",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun BookScreenGalleryTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Gallery",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun BookScreenBookLocationsTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Where you can find it",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun BookScreenHorizontalDivider() {
    HorizontalDivider(
        modifier = Modifier.padding(all = 14.dp),
        color = MaterialTheme.colorScheme.onBackground,
        thickness = 3.dp,
    )
}

@Composable
fun BookScreenSecondEditionTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Second Edition",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun BookScreenSecondEditionBookImage() {
    Image(
        painter = painterResource(id = R.drawable.laws_of_ux_book),
        contentDescription = "Project Info Screen Image",
        modifier =
            Modifier
                .padding(all = 14.dp)
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(size = 21.dp)),
        contentScale = ContentScale.Crop,
    )
}

@Composable
fun BookScreenSecondEditionBookTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Check it out first",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun BookScreenSecondEditionBookContent() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            "Review the book online with this 30-day free membership to the O’Reilly " +
                "Learning Platform.",
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
fun BookScreenSecondEditionBookButton(navigateToOreilly: () -> Unit) {
    Button(
        modifier =
            Modifier
                .padding(all = 7.dp),
        onClick = navigateToOreilly,
        colors =
            ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
            ),
    ) {
        Text(
            text = "ACCESS NOW",
            color = MaterialTheme.colorScheme.onPrimary,
            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
        )
    }
}

@Composable
fun BookScreenFirstEditionTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "First Edition",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun BookScreenTranslationsTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Translations",
        fontSize = 28.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun BookScreenTranslatedSecondEditionTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Second Edition",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun BookScreenTranslatedFirstEditionTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "First Edition",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun BookScreenRelatedTitle() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text = "Related",
        fontSize = 25.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
        fontWeight = FontWeight.ExtraBold,
    )
}

@Composable
fun BookScreenRelatedImage() {
    Image(
        painter = painterResource(id = R.drawable.book_related),
        contentDescription = "Related Image",
        modifier =
            Modifier
                .padding(all = 14.dp)
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(size = 21.dp)),
        contentScale = ContentScale.Crop,
    )
}

@Composable
fun BookScreenRelatedContent() {
    Text(
        modifier = Modifier.padding(all = 14.dp),
        text =
            "A discussion with Andrés Zapata, D.Sc. that dives into the details around the " +
                "second edition of the “Laws of UX” book.",
        fontSize = 18.sp,
        color = MaterialTheme.colorScheme.onBackground,
        overflow = TextOverflow.Clip,
        fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_sans_regular))),
    )
}

@Composable
fun BookScreenRelatedButton(navigateToBootcamp: () -> Unit) {
    Button(
        modifier =
            Modifier
                .padding(all = 7.dp),
        onClick = navigateToBootcamp,
        colors =
            ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
            ),
    ) {
        Text(
            text = "READ ON BOOTCAMP",
            color = MaterialTheme.colorScheme.onPrimary,
            fontFamily = FontFamily(fonts = listOf(Font(resId = R.font.ibm_plex_mono_regular))),
        )
    }
}