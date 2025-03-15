package emmanuelmuturia.lawsofux.book.source.source

import emmanuelmuturia.lawsofux.book.source.model.LocalBookFirstEdition
import emmanuelmuturia.lawsofux.book.source.model.LocalBookGallery
import emmanuelmuturia.lawsofux.book.source.model.LocalBookLesson
import emmanuelmuturia.lawsofux.book.source.model.LocalBookReview
import emmanuelmuturia.lawsofux.book.source.model.LocalBookSecondEdition
import emmanuelmuturia.lawsofux.book.source.model.LocalBookTranslatedFirstEdition
import emmanuelmuturia.lawsofux.book.source.model.LocalBookTranslatedSecondEdition
import kotlinx.coroutines.flow.Flow

interface LocalBookSource {
    suspend fun getAllLocalBookFirstEditions(): Flow<List<LocalBookFirstEdition>>

    suspend fun getAllLocalBookGalleries(): Flow<List<LocalBookGallery>>

    suspend fun getAllLocalBookLessons(): Flow<List<LocalBookLesson>>

    suspend fun getAllLocalBookReviews(): Flow<List<LocalBookReview>>

    suspend fun getAllLocalBookSecondEditions(): Flow<List<LocalBookSecondEdition>>

    suspend fun getAllLocalBookTranslatedFirstEditions(): Flow<List<LocalBookTranslatedFirstEdition>>

    suspend fun getAllLocalBookTranslatedSecondEditions(): Flow<List<LocalBookTranslatedSecondEdition>>
}