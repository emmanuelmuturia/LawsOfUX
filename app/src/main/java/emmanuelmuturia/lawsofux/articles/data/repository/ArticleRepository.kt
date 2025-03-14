package emmanuelmuturia.lawsofux.articles.data.repository

import emmanuelmuturia.lawsofux.articles.data.model.Article
import kotlinx.coroutines.flow.Flow

interface ArticleRepository {
    suspend fun getAllArticles(): Flow<List<Article>>
}