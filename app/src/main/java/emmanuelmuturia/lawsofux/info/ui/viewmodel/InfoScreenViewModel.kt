package emmanuelmuturia.lawsofux.info.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import emmanuelmuturia.lawsofux.commons.state.LawsOfUXState
import emmanuelmuturia.lawsofux.commons.state.asResult
import emmanuelmuturia.lawsofux.info.data.repository.InfoRepository
import emmanuelmuturia.lawsofux.info.ui.state.InfoScreenUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class InfoScreenViewModel(
    private val infoRepository: InfoRepository,
) : ViewModel() {
    val infoScreenUIState = MutableStateFlow(value = InfoScreenUIState())

    init {
        getAllInfos()
    }

    private fun getAllInfos() {
        infoScreenUIState.value = infoScreenUIState.value.copy(isLoading = true)
        viewModelScope.launch {
            infoRepository.getAllInfos().asResult().collect { result ->

                when (result) {
                    is LawsOfUXState.Success -> {
                        infoScreenUIState.update {
                            it.copy(
                                infos = result.data,
                                isLoading = false,
                            )
                        }
                    }

                    is LawsOfUXState.Error -> {
                        infoScreenUIState.update {
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