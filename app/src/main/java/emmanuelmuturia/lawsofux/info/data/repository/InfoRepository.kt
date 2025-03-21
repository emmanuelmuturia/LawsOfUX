package emmanuelmuturia.lawsofux.info.data.repository

import emmanuelmuturia.lawsofux.info.data.model.Info
import kotlinx.coroutines.flow.Flow

interface InfoRepository {
    suspend fun getAllInfos(): Flow<List<Info>>
}