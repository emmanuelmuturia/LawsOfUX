package emmanuelmuturia.lawsofux.book.data.repository

import emmanuelmuturia.lawsofux.book.data.model.BookFirstEdition
import emmanuelmuturia.lawsofux.book.data.model.BookGallery
import emmanuelmuturia.lawsofux.book.data.model.BookLesson
import emmanuelmuturia.lawsofux.book.data.model.BookReview
import emmanuelmuturia.lawsofux.book.data.model.BookSecondEdition
import emmanuelmuturia.lawsofux.book.data.model.BookTranslatedFirstEdition
import emmanuelmuturia.lawsofux.book.data.model.BookTranslatedSecondEdition
import emmanuelmuturia.lawsofux.book.source.source.LocalBookSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class BookRepositoryImplementation(
    private val ioDispatcher: CoroutineDispatcher,
    private val localBookSource: LocalBookSource,
) : BookRepository {
    override suspend fun getAllBookFirstEditions(): Flow<List<BookFirstEdition>> {
        return withContext(context = ioDispatcher) {
            localBookSource.getAllLocalBookFirstEditions().map { localBookFirstEditions ->
                localBookFirstEditions.map { localBookFirstEdition ->
                    BookFirstEdition(
                        bookFirstEditionId = localBookFirstEdition.localBookFirstEditionId,
                        bookFirstEditionTitle = localBookFirstEdition.localBookFirstEditionTitle,
                        bookFirstEditionSeller = localBookFirstEdition.localBookFirstEditionSeller,
                    )
                }
            }
        }
    }

    override suspend fun getAllBookGalleries(): Flow<List<BookGallery>> {
        return withContext(context = ioDispatcher) {
            localBookSource.getAllLocalBookGalleries().map { localBookGalleries ->
                localBookGalleries.map { localBookGallery ->
                    BookGallery(
                        bookGalleryId = localBookGallery.localBookGalleryId,
                        bookGalleryImage = localBookGallery.localBookGalleryImage,
                    )
                }
            }
        }
    }

    override suspend fun getAllBookLessons(): Flow<List<BookLesson>> {
        return withContext(context = ioDispatcher) {
            localBookSource.getAllLocalBookLessons().map { localBookLessons ->
                localBookLessons.map { localBookLesson ->
                    BookLesson(
                        bookLessonId = localBookLesson.localBookLessonId,
                        bookLessonDescription = localBookLesson.localBookLessonDescription,
                    )
                }
            }
        }
    }

    override suspend fun getAllBookReviews(): Flow<List<BookReview>> {
        return withContext(context = ioDispatcher) {
            localBookSource.getAllLocalBookReviews().map { localBookReviews ->
                localBookReviews.map { localBookReview ->
                    BookReview(
                        bookReviewId = localBookReview.localBookReviewId,
                        bookReviewCaption = localBookReview.localBookReviewCaption,
                        bookReviewAuthor = localBookReview.localBookReviewAuthor,
                    )
                }
            }
        }
    }

    override suspend fun getAllBookSecondEditions(): Flow<List<BookSecondEdition>> {
        return withContext(context = ioDispatcher) {
            localBookSource.getAllLocalBookSecondEditions().map { localBookSecondEditions ->
                localBookSecondEditions.map { localBookSecondEdition ->
                    BookSecondEdition(
                        bookSecondEditionId = localBookSecondEdition.localBookSecondEditionId,
                        bookSecondEditionTitle = localBookSecondEdition.localBookSecondEditionTitle,
                        bookSecondEditionSeller = localBookSecondEdition.localBookSecondEditionSeller,
                    )
                }
            }
        }
    }

    override suspend fun getAllBookTranslatedFirstEditions(): Flow<List<BookTranslatedFirstEdition>> {
        return withContext(context = ioDispatcher) {
            localBookSource.getAllLocalBookTranslatedFirstEditions().map { localBookTranslatedFirstEditions ->
                localBookTranslatedFirstEditions.map { localBookTranslatedFirstEdition ->
                    BookTranslatedFirstEdition(
                        bookTranslatedFirstEditionId = localBookTranslatedFirstEdition.localBookTranslatedFirstEditionId,
                        bookTranslatedFirstEditionTitle = localBookTranslatedFirstEdition.localBookTranslatedFirstEditionTitle,
                        bookTranslatedFirstEditionSeller = localBookTranslatedFirstEdition.localBookTranslatedFirstEditionSeller,
                    )
                }
            }
        }
    }

    override suspend fun getAllBookTranslatedSecondEditions(): Flow<List<BookTranslatedSecondEdition>> {
        return withContext(context = ioDispatcher) {
            localBookSource.getAllLocalBookTranslatedSecondEditions().map { localBookTranslatedSecondEditions ->
                localBookTranslatedSecondEditions.map { localBookTranslatedSecondEdition ->
                    BookTranslatedSecondEdition(
                        bookTranslatedSecondEditionId = localBookTranslatedSecondEdition.localBookTranslatedSecondEditionId,
                        bookTranslatedSecondEditionTitle = localBookTranslatedSecondEdition.localBookTranslatedSecondEditionTitle,
                        bookTranslatedSecondEditionSeller = localBookTranslatedSecondEdition.localBookTranslatedSecondEditionSeller,
                    )
                }
            }
        }
    }
}