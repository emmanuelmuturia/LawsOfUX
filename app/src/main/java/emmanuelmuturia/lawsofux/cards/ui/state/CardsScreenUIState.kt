package emmanuelmuturia.lawsofux.cards.ui.state

import emmanuelmuturia.lawsofux.cards.data.model.Card

data class CardsScreenUIState(
    val cards: List<Card> = emptyList(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
)