package emmanuelmuturia.lawsofux.info.ui.dependencyInjection

import emmanuelmuturia.lawsofux.info.data.dependencyInjection.projectInfoDataKoinModule
import emmanuelmuturia.lawsofux.info.ui.viewmodel.ProjectInfoScreenViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val projectInfoUIKoinModule =
    module {

        viewModel {
            ProjectInfoScreenViewModel(
                projectInfoRepository = get(),
            )
        }

        includes(module = listOf(projectInfoDataKoinModule))
    }