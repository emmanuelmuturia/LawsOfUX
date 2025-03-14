package emmanuelmuturia.lawsofux.info.source.dependencyInjection

import emmanuelmuturia.lawsofux.info.source.source.LocalProjectInfoSource
import emmanuelmuturia.lawsofux.info.source.source.LocalProjectInfoSourceImplementation
import org.koin.dsl.module

val projectInfoSourceKoinModule =
    module {

        single<LocalProjectInfoSource> {
            LocalProjectInfoSourceImplementation(
                ioDispatcher = get(),
            )
        }
    }