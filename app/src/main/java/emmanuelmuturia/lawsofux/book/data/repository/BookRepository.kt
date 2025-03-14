package emmanuelmuturia.lawsofux.book.data.repository

import emmanuelmuturia.lawsofux.book.data.model.BookFirstEdition
import emmanuelmuturia.lawsofux.book.data.model.BookGallery
import emmanuelmuturia.lawsofux.book.data.model.BookLesson
import emmanuelmuturia.lawsofux.book.data.model.BookReview
import emmanuelmuturia.lawsofux.book.data.model.BookSecondEdition
import emmanuelmuturia.lawsofux.book.data.model.BookTranslatedFirstEdition
import emmanuelmuturia.lawsofux.book.data.model.BookTranslatedSecondEdition
import kotlinx.coroutines.flow.Flow

interface BookRepository {
    suspend fun getAllBookFirstEditions(): Flow<List<BookFirstEdition>>
    suspend fun getAllBookGalleries(): Flow<List<BookGallery>>
    suspend fun getAllBookLessons(): Flow<List<BookLesson>>
    suspend fun getAllBookReviews(): Flow<List<BookReview>>
    suspend fun getAllBookSecondEditions(): Flow<List<BookSecondEdition>>
    suspend fun getAllBookTranslatedFirstEditions():
        Flow<List<BookTranslatedFirstEdition>>
    suspend fun getAllBookTranslatedSecondEditions():
        Flow<List<BookTranslatedSecondEdition>>
}