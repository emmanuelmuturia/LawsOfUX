package emmanuelmuturia.lawsofux.info.data.dependencyInjection

import emmanuelmuturia.lawsofux.info.data.repository.ProjectInfoRepository
import emmanuelmuturia.lawsofux.info.data.repository.ProjectInfoRepositoryImplementation
import emmanuelmuturia.lawsofux.info.source.dependencyInjection.projectInfoSourceKoinModule
import org.koin.dsl.module

val projectInfoDataKoinModule = module {

    single<ProjectInfoRepository> {
        ProjectInfoRepositoryImplementation(
            localProjectInfoSource = get(),
            ioDispatcher = get(),
        )
    }

    includes(module = listOf(projectInfoSourceKoinModule))

}