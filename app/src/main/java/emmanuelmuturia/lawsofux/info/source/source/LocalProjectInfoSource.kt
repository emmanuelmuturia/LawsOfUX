package emmanuelmuturia.lawsofux.info.source.source

import emmanuelmuturia.lawsofux.info.source.model.LocalProjectInfo
import kotlinx.coroutines.flow.Flow

interface LocalProjectInfoSource {
    suspend fun getAllLocalProjectInfos(): Flow<List<LocalProjectInfo>>
}