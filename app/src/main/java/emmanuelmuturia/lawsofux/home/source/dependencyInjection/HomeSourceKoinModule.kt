package emmanuelmuturia.lawsofux.home.source.dependencyInjection

import emmanuelmuturia.lawsofux.home.source.source.LocalUXLawsSource
import emmanuelmuturia.lawsofux.home.source.source.LocalUXLawsSourceImplementation
import org.koin.dsl.module

val homeSourceKoinModule = module {
    single<LocalUXLawsSource> {
        LocalUXLawsSourceImplementation(
            ioDispatcher = get(),
        )
    }
}