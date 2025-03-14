package emmanuelmuturia.lawsofux.info.ui.state

import emmanuelmuturia.lawsofux.info.data.model.ProjectInfo

data class ProjectInfoScreenUIState(
    val projectInfos: List<ProjectInfo> = emptyList(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
)