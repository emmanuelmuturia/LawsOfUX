package emmanuelmuturia.lawsofux.articles.source.model

data class LocalArticle(
    val localArticleId: String = "Default Article ID",
    val localArticleTitle: String,
    val localArticleDescription: String,
    val localArticleThumbnail: Int,
)