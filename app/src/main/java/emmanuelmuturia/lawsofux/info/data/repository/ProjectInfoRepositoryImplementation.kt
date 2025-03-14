package emmanuelmuturia.lawsofux.info.data.repository

import emmanuelmuturia.lawsofux.info.data.model.ProjectInfo
import emmanuelmuturia.lawsofux.info.source.source.LocalProjectInfoSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class ProjectInfoRepositoryImplementation(
    private val localProjectInfoSource: LocalProjectInfoSource,
    private val ioDispatcher: CoroutineDispatcher,
) : ProjectInfoRepository {
    override suspend fun getAllProjectInfos(): Flow<List<ProjectInfo>> {
        return withContext(context = ioDispatcher) {
            localProjectInfoSource.getAllLocalProjectInfos().map { localProjectInfos ->
                localProjectInfos.map { localProjectInfo ->
                    ProjectInfo(
                        projectInfoTitle = localProjectInfo.localProjectInfoTitle,
                        projectInfoDescription = localProjectInfo.localProjectInfoDescription
                    )
                }
            }
        }
    }
}