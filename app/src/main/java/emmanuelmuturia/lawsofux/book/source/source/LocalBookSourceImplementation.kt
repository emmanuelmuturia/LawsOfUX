package emmanuelmuturia.lawsofux.book.source.source

import emmanuelmuturia.lawsofux.R
import emmanuelmuturia.lawsofux.book.source.model.LocalBookFirstEdition
import emmanuelmuturia.lawsofux.book.source.model.LocalBookGallery
import emmanuelmuturia.lawsofux.book.source.model.LocalBookLesson
import emmanuelmuturia.lawsofux.book.source.model.LocalBookReview
import emmanuelmuturia.lawsofux.book.source.model.LocalBookSecondEdition
import emmanuelmuturia.lawsofux.book.source.model.LocalBookTranslatedFirstEdition
import emmanuelmuturia.lawsofux.book.source.model.LocalBookTranslatedSecondEdition
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext

class LocalBookSourceImplementation(
    private val ioDispatcher: CoroutineDispatcher
) : LocalBookSource {

    private val localBookLessons = listOf(
        LocalBookLesson(
            localBookLessonDescription = "How aesthetically pleasing design creates positive " +
                "responses"
        ),LocalBookLesson(
            localBookLessonDescription = "The principles of psychology most useful for designers"
        ),LocalBookLesson(
            localBookLessonDescription = "How these psychology principles relate to UX heuristics"
        ),LocalBookLesson(
            localBookLessonDescription = "Predictive models including Fitts's law, Jakob's law, " +
                "and Hick's law"
        ),LocalBookLesson(
            localBookLessonDescription = "A practical framework for applying principles of " +
                "psychology in your design process"
        ),LocalBookLesson(
            localBookLessonDescription = "Ethical implications of using psychology in design"
        ),
    )

    private val localBookReviews = listOf(
        LocalBookReview(
            localBookReviewCaption = "The Laws of UX serves as an excellent resource for both " +
                "newcomers and professionals, encouraging them to delve into the deeper why " +
                "behind design choices instead of merely imitating existing patterns.",
            localBookReviewAuthor = "CHRIS DESJARDINS, CEO, TUNGSTEN"
        ),LocalBookReview(
            localBookReviewCaption = "This is the book I didn’t know I needed at the start of my " +
                "career and the one I insist on for my students and staff.",
            localBookReviewAuthor = "ANDRES CURREY ZAPATA, D.SC."
        ),LocalBookReview(
            localBookReviewCaption = "Jon has broken down common psychology principles in a way " +
                "that makes it easier to apply in everyday designs across all industries.",
            localBookReviewAuthor = "JAMES RAMPTON, LECTURER, UNIVERSITY OF MICHIGAN"
        ),
    )

    private val localBookGalleries = listOf(
        LocalBookGallery(
            localBookGalleryImage = R.drawable.gallery_1
        ),LocalBookGallery(
            localBookGalleryImage = R.drawable.gallery_2
        ),LocalBookGallery(
            localBookGalleryImage = R.drawable.gallery_3
        ),LocalBookGallery(
            localBookGalleryImage = R.drawable.gallery_4
        ),LocalBookGallery(
            localBookGalleryImage = R.drawable.gallery_5
        ),LocalBookGallery(
            localBookGalleryImage = R.drawable.gallery_6
        ),
    )

    private val localBookSecondEditions = listOf(
        LocalBookSecondEdition(
            localBookSecondEditionTitle = "Amazon",
            localBookSecondEditionSeller = "AMAZON.COM"
        ),LocalBookSecondEdition(
            localBookSecondEditionTitle = "Apple Books",
            localBookSecondEditionSeller = "BOOKS.APPLE.COM"
        ),LocalBookSecondEdition(
            localBookSecondEditionTitle = "Target",
            localBookSecondEditionSeller = "TARGET.COM"
        ),LocalBookSecondEdition(
            localBookSecondEditionTitle = "O'reilly Learning",
            localBookSecondEditionSeller = "LEARNING.OREILLY.COM"
        ),LocalBookSecondEdition(
            localBookSecondEditionTitle = "Barnes & Noble",
            localBookSecondEditionSeller = "BARNESANDNOBLE.COM"
        ),LocalBookSecondEdition(
            localBookSecondEditionTitle = "Bookshop",
            localBookSecondEditionSeller = "BOOKSHOP.COM"
        ),LocalBookSecondEdition(
            localBookSecondEditionTitle = "Alibris",
            localBookSecondEditionSeller = "ALIBRIS.COM"
        ),
    )

    private val localBookFirstEditions = listOf(
        LocalBookFirstEdition(
            localBookFirstEditionTitle = "Amazon",
            localBookFirstEditionSeller = "AMAZON.COM"
        ),LocalBookFirstEdition(
            localBookFirstEditionTitle = "Audible",
            localBookFirstEditionSeller = "AUDIBLE.COM"
        ),LocalBookFirstEdition(
            localBookFirstEditionTitle = "Google Play [Audiobook]",
            localBookFirstEditionSeller = "PLAY.GOOGLE.COM"
        ),LocalBookFirstEdition(
            localBookFirstEditionTitle = "O'reilly Learning",
            localBookFirstEditionSeller = "OREILLY.COM"
        ),LocalBookFirstEdition(
            localBookFirstEditionTitle = "Blackwell's",
            localBookFirstEditionSeller = "BLACKWELLS.CO.UK/BOOKSHOP"
        ),LocalBookFirstEdition(
            localBookFirstEditionTitle = "OnBuy",
            localBookFirstEditionSeller = "ONBUY.COM"
        ),
    )

    private val localBookTranslatedSecondEditions = listOf(
        LocalBookTranslatedSecondEdition(
            localBookTranslatedSecondEditionTitle = "Portuguese",
            localBookTranslatedSecondEditionSeller = "NOVATEC"
        ),LocalBookTranslatedSecondEdition(
            localBookTranslatedSecondEditionTitle = "Bulgarian",
            localBookTranslatedSecondEditionSeller = "ASENEVTSI PUBLISHING"
        ),LocalBookTranslatedSecondEdition(
            localBookTranslatedSecondEditionTitle = "Korean",
            localBookTranslatedSecondEditionSeller = "ONLYBOOK.CO"
        ),LocalBookTranslatedSecondEdition(
            localBookTranslatedSecondEditionTitle = "German",
            localBookTranslatedSecondEditionSeller = "DPUNKT"
        ),
    )

    private val localBookTranslatedFirstEditions = listOf(
        LocalBookTranslatedFirstEdition(
            localBookTranslatedFirstEditionTitle = "Thai",
            localBookTranslatedFirstEditionSeller = "INFOPRESS"
        ),LocalBookTranslatedFirstEdition(
            localBookTranslatedFirstEditionTitle = "Chinese",
            localBookTranslatedFirstEditionSeller = "JD.COM"
        ),LocalBookTranslatedFirstEdition(
            localBookTranslatedFirstEditionTitle = "Mongolian",
            localBookTranslatedFirstEditionSeller = "UXER PUBLISHING"
        ),LocalBookTranslatedFirstEdition(
            localBookTranslatedFirstEditionTitle = "Spanish",
            localBookTranslatedFirstEditionSeller = "PARRAMON.COM"
        ),LocalBookTranslatedFirstEdition(
            localBookTranslatedFirstEditionTitle = "German",
            localBookTranslatedFirstEditionSeller = "DPUNKTD.DE"
        ),LocalBookTranslatedFirstEdition(
            localBookTranslatedFirstEditionTitle = "Korean",
            localBookTranslatedFirstEditionSeller = "ONLYBOOK.CO.KR"
        ),LocalBookTranslatedFirstEdition(
            localBookTranslatedFirstEditionTitle = "Portuguese",
            localBookTranslatedFirstEditionSeller = "NOVATEC.COM"
        ),LocalBookTranslatedFirstEdition(
            localBookTranslatedFirstEditionTitle = "Japanese",
            localBookTranslatedFirstEditionSeller = "O'REILLY JAPAN"
        ),LocalBookTranslatedFirstEdition(
            localBookTranslatedFirstEditionTitle = "Polish",
            localBookTranslatedFirstEditionSeller = "HELION"
        ),LocalBookTranslatedFirstEdition(
            localBookTranslatedFirstEditionTitle = "Russian",
            localBookTranslatedFirstEditionSeller = "BHV ST PETERSBURG"
        ),
    )

    override suspend fun getAllLocalBookFirstEditions(): Flow<List<LocalBookFirstEdition>> {
        return withContext(context = ioDispatcher) {
            flowOf(value = localBookFirstEditions)
        }
    }

    override suspend fun getAllLocalBookGalleries(): Flow<List<LocalBookGallery>> {
        return withContext(context = ioDispatcher) {
            flowOf(value = localBookGalleries)
        }
    }

    override suspend fun getAllLocalBookLessons(): Flow<List<LocalBookLesson>> {
        return withContext(context = ioDispatcher) {
            flowOf(value = localBookLessons)
        }
    }

    override suspend fun getAllLocalBookReviews(): Flow<List<LocalBookReview>> {
        return withContext(context = ioDispatcher) {
            flowOf(value = localBookReviews)
        }
    }

    override suspend fun getAllLocalBookSecondEditions(): Flow<List<LocalBookSecondEdition>> {
        return withContext(context = ioDispatcher) {
            flowOf(value = localBookSecondEditions)
        }
    }

    override suspend fun getAllLocalBookTranslatedFirstEditions(): Flow<List<LocalBookTranslatedFirstEdition>> {
        return withContext(context = ioDispatcher) {
            flowOf(value = localBookTranslatedFirstEditions)
        }
    }

    override suspend fun getAllLocalBookTranslatedSecondEditions(): Flow<List<LocalBookTranslatedSecondEdition>> {
        return withContext(context = ioDispatcher) {
            flowOf(value = localBookTranslatedSecondEditions)
        }
    }
}