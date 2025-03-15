package emmanuelmuturia.lawsofux.book.ui.state

import emmanuelmuturia.lawsofux.book.data.model.BookFirstEdition
import emmanuelmuturia.lawsofux.book.data.model.BookGallery
import emmanuelmuturia.lawsofux.book.data.model.BookLesson
import emmanuelmuturia.lawsofux.book.data.model.BookReview
import emmanuelmuturia.lawsofux.book.data.model.BookSecondEdition
import emmanuelmuturia.lawsofux.book.data.model.BookTranslatedFirstEdition
import emmanuelmuturia.lawsofux.book.data.model.BookTranslatedSecondEdition

data class BookScreenUIState(
    val bookFirstEditions: List<BookFirstEdition> = emptyList(),
    val bookGalleries: List<BookGallery> = emptyList(),
    val bookLessons: List<BookLesson> = emptyList(),
    val bookReviews: List<BookReview> = emptyList(),
    val bookSecondEditions: List<BookSecondEdition> = emptyList(),
    val bookTranslatedFirstEditions: List<BookTranslatedFirstEdition> = emptyList(),
    val bookTranslatedSecondEditions: List<BookTranslatedSecondEdition> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null,
)