package emmanuelmuturia.lawsofux.info.source.dependencyInjection

import emmanuelmuturia.lawsofux.info.source.source.LocalInfoSource
import emmanuelmuturia.lawsofux.info.source.source.LocalInfoSourceImplementation
import org.koin.dsl.module

val infoSourceKoinModule =
    module {

        single<LocalInfoSource> {
            LocalInfoSourceImplementation(
                ioDispatcher = get(),
            )
        }
    }