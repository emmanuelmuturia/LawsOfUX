package emmanuelmuturia.lawsofux.home.data.dependencyInjection

import emmanuelmuturia.lawsofux.home.data.repository.HomeRepository
import emmanuelmuturia.lawsofux.home.data.repository.HomeRepositoryImplementation
import emmanuelmuturia.lawsofux.home.source.dependencyInjection.homeSourceKoinModule
import org.koin.dsl.module

val homeDataKoinModule = module {
    single<HomeRepository> {
        HomeRepositoryImplementation(
            ioDispatcher = get(),
            localUXLawsSource = get()
        )
    }

    includes(module = listOf(homeSourceKoinModule))
}