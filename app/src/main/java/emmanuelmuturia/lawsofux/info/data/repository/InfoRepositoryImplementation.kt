package emmanuelmuturia.lawsofux.info.data.repository

import emmanuelmuturia.lawsofux.info.data.model.Info
import emmanuelmuturia.lawsofux.info.source.source.LocalInfoSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class InfoRepositoryImplementation(
    private val localInfoSource: LocalInfoSource,
    private val ioDispatcher: CoroutineDispatcher,
) : InfoRepository {
    override suspend fun getAllInfos(): Flow<List<Info>> {
        return withContext(context = ioDispatcher) {
            localInfoSource.getAllLocalInfos().map { localInfos ->
                localInfos.map { localInfo ->
                    Info(
                        infoId = localInfo.localInfoId,
                        infoTitle = localInfo.localInfoTitle,
                        infoDescription = localInfo.localInfoDescription,
                    )
                }
            }
        }
    }
}