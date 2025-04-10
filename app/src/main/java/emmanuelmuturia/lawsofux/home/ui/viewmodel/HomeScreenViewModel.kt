package emmanuelmuturia.lawsofux.home.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import emmanuelmuturia.lawsofux.commons.state.LawsOfUXState
import emmanuelmuturia.lawsofux.commons.state.asResult
import emmanuelmuturia.lawsofux.home.data.repository.HomeRepository
import emmanuelmuturia.lawsofux.home.ui.state.HomeScreenUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeScreenViewModel(
    private val homeRepository: HomeRepository,
) : ViewModel() {
    val homeScreenUIState = MutableStateFlow(value = HomeScreenUIState())

    init {
        getUxLaws()
    }

    private fun getUxLaws() {
        homeScreenUIState.value = homeScreenUIState.value.copy(isLoading = true)
        viewModelScope.launch {
            homeRepository.getAllLocalUXLaws().asResult().collect { result ->
                when (result) {
                    is LawsOfUXState.Success -> {
                        homeScreenUIState.update {
                            it.copy(
                                uxLaws = result.data,
                                isLoading = false,
                            )
                        }
                    }

                    is LawsOfUXState.Error -> {
                        homeScreenUIState.update {
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