package emmanuelmuturia.lawsofux.info.data.repository

import emmanuelmuturia.lawsofux.info.data.model.ProjectInfo
import kotlinx.coroutines.flow.Flow

interface ProjectInfoRepository {
    suspend fun getAllProjectInfos(): Flow<List<ProjectInfo>>
}