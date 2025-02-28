package emmanuelmuturia.lawsofux.home.ui.dependencyInjection

import emmanuelmuturia.lawsofux.home.data.dependencyInjection.homeDataKoinModule
import emmanuelmuturia.lawsofux.home.ui.viewmodel.HomeScreenViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val homeUIKoinModule = module {
    viewModel {
        HomeScreenViewModel(
            homeRepository = get()
        )
    }

    includes(module = listOf(homeDataKoinModule))
}