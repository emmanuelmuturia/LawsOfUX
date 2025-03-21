package emmanuelmuturia.lawsofux.info.ui.state

import emmanuelmuturia.lawsofux.info.data.model.Info

data class InfoScreenUIState(
    val infos: List<Info> = emptyList(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
)