package emmanuelmuturia.lawsofux.articles.ui.state

import emmanuelmuturia.lawsofux.articles.data.model.Article

data class ArticlesScreenUIState(
    val articles: List<Article> = emptyList(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
)