package emmanuelmuturia.lawsofux.info.ui.dependencyInjection

import emmanuelmuturia.lawsofux.info.data.dependencyInjection.infoDataKoinModule
import emmanuelmuturia.lawsofux.info.ui.viewmodel.InfoScreenViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val infoUIKoinModule =
    module {

        viewModel {
            InfoScreenViewModel(
                infoRepository = get(),
            )
        }

        includes(module = listOf(infoDataKoinModule))
    }