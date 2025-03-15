package emmanuelmuturia.lawsofux.book.source.dependencyInjection

import emmanuelmuturia.lawsofux.book.source.source.LocalBookSource
import emmanuelmuturia.lawsofux.book.source.source.LocalBookSourceImplementation
import org.koin.dsl.module

val bookSourceKoinModule =
    module {

        single<LocalBookSource> {
            LocalBookSourceImplementation(
                ioDispatcher = get(),
            )
        }
    }