package emmanuelmuturia.lawsofux.book.data.dependencyInjection

import emmanuelmuturia.lawsofux.book.data.repository.BookRepository
import emmanuelmuturia.lawsofux.book.data.repository.BookRepositoryImplementation
import emmanuelmuturia.lawsofux.book.source.dependencyInjection.bookSourceKoinModule
import org.koin.dsl.module

val bookDataKoinModule = module {

    single<BookRepository> {
        BookRepositoryImplementation(
            ioDispatcher = get(),
            localBookSource = get()
        )
    }

    includes(module = listOf(bookSourceKoinModule))

}