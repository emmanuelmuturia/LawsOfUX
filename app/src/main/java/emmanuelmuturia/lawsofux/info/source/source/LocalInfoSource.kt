package emmanuelmuturia.lawsofux.info.source.source

import emmanuelmuturia.lawsofux.info.source.model.LocalInfo
import kotlinx.coroutines.flow.Flow

interface LocalInfoSource {
    suspend fun getAllLocalInfos(): Flow<List<LocalInfo>>
}