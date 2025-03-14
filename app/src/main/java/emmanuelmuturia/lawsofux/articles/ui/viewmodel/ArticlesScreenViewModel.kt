package emmanuelmuturia.lawsofux.articles.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import emmanuelmuturia.lawsofux.articles.data.repository.ArticleRepository
import emmanuelmuturia.lawsofux.articles.ui.state.ArticlesScreenUIState
import emmanuelmuturia.lawsofux.commons.state.LawsOfUXState
import emmanuelmuturia.lawsofux.commons.state.asResult
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ArticlesScreenViewModel(
    private val articleRepository: ArticleRepository,
) : ViewModel() {
    val articlesScreenUIState = MutableStateFlow(value = ArticlesScreenUIState())

    init {
        getAllArticles()
    }

    private fun getAllArticles() {
        articlesScreenUIState.value = articlesScreenUIState.value.copy(isLoading = true)

        viewModelScope.launch {
            articleRepository.getAllArticles().asResult().collect { result ->
                when (result) {
                    is LawsOfUXState.Success -> {
                        articlesScreenUIState.update {
                            it.copy(
                                articles = result.data,
                                isLoading = false,
                            )
                        }
                    }

                    is LawsOfUXState.Error -> {
                        articlesScreenUIState.update {
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