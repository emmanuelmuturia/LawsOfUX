package emmanuelmuturia.lawsofux.cards.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import emmanuelmuturia.lawsofux.cards.data.repository.CardsRepository
import emmanuelmuturia.lawsofux.cards.ui.state.CardsScreenUIState
import emmanuelmuturia.lawsofux.commons.state.LawsOfUXState
import emmanuelmuturia.lawsofux.commons.state.asResult
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CardsScreenViewModel(
    private val cardsRepository: CardsRepository,
) : ViewModel() {
    val cardsScreenUIState = MutableStateFlow(value = CardsScreenUIState())

    init {
        getAllCards()
    }

    private fun getAllCards() {
        cardsScreenUIState.value = cardsScreenUIState.value.copy(isLoading = true)
        viewModelScope.launch {
            cardsRepository.getAllCards().asResult().collect { result ->
                when (result) {
                    is LawsOfUXState.Success -> {
                        cardsScreenUIState.update {
                            it.copy(
                                cards = result.data,
                                isLoading = false,
                            )
                        }
                    }

                    is LawsOfUXState.Error -> {
                        cardsScreenUIState.update {
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