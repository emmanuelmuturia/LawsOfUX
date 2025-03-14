package emmanuelmuturia.lawsofux.articles.source.source

import emmanuelmuturia.lawsofux.articles.source.model.LocalArticle
import kotlinx.coroutines.flow.Flow

interface LocalArticleSource {
    suspend fun getAllLocalArticles(): Flow<List<LocalArticle>>
}