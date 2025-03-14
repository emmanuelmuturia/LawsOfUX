package emmanuelmuturia.lawsofux.articles.data.repository

import emmanuelmuturia.lawsofux.articles.data.model.Article
import emmanuelmuturia.lawsofux.articles.source.source.LocalArticleSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class ArticleRepositoryImplementation(
    private val ioDispatcher: CoroutineDispatcher,
    private val localArticleSource: LocalArticleSource
) : ArticleRepository {
    override suspend fun getAllArticles(): Flow<List<Article>> {
        return withContext(
            context = ioDispatcher
        ) {
            localArticleSource.getAllLocalArticles().map { localArticles ->
                localArticles.map { localArticle ->
                    Article(
                        articleTitle = localArticle.localArticleTitle,
                        articleDescription = localArticle.localArticleDescription,
                        articleThumbnail = localArticle.localArticleThumbnail
                    )
                }
            }
        }
    }
}