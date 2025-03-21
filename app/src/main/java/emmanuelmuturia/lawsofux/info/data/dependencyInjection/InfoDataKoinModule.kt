package emmanuelmuturia.lawsofux.info.data.dependencyInjection

import emmanuelmuturia.lawsofux.info.data.repository.InfoRepository
import emmanuelmuturia.lawsofux.info.data.repository.InfoRepositoryImplementation
import emmanuelmuturia.lawsofux.info.source.dependencyInjection.infoSourceKoinModule
import org.koin.dsl.module

val infoDataKoinModule =
    module {

        single<InfoRepository> {
            InfoRepositoryImplementation(
                localInfoSource = get(),
                ioDispatcher = get(),
            )
        }

        includes(module = listOf(infoSourceKoinModule))
    }