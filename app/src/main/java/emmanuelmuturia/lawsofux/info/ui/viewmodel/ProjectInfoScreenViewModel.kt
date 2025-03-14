package emmanuelmuturia.lawsofux.info.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import emmanuelmuturia.lawsofux.commons.state.LawsOfUXState
import emmanuelmuturia.lawsofux.commons.state.asResult
import emmanuelmuturia.lawsofux.info.data.repository.ProjectInfoRepository
import emmanuelmuturia.lawsofux.info.ui.state.ProjectInfoScreenUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ProjectInfoScreenViewModel(
    private val projectInfoRepository: ProjectInfoRepository,
) : ViewModel() {
    val projectInfoScreenUIState = MutableStateFlow(value = ProjectInfoScreenUIState())

    init {
        getAllProjectInfos()
    }

    private fun getAllProjectInfos() {
        projectInfoScreenUIState.value = projectInfoScreenUIState.value.copy(isLoading = true)
        viewModelScope.launch {
            projectInfoRepository.getAllProjectInfos().asResult().collect { result ->

                when (result) {
                    is LawsOfUXState.Success -> {
                        projectInfoScreenUIState.update {
                            it.copy(
                                projectInfos = result.data,
                                isLoading = false,
                            )
                        }
                    }

                    is LawsOfUXState.Error -> {
                        projectInfoScreenUIState.update {
                            it.copy(
                                isError = true,
                                isLoading = false,
                            )
                        }
                    }
                }
            }
        }
    }
}