package emmanuelmuturia.lawsofux.home.ui.state

import emmanuelmuturia.lawsofux.home.data.model.UXLaw

data class HomeScreenUIState(
    val uxLaws: List<UXLaw> = emptyList(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
)