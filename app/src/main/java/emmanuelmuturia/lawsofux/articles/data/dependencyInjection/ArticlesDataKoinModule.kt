package emmanuelmuturia.lawsofux.articles.data.dependencyInjection

import emmanuelmuturia.lawsofux.articles.data.repository.ArticleRepository
import emmanuelmuturia.lawsofux.articles.data.repository.ArticleRepositoryImplementation
import emmanuelmuturia.lawsofux.articles.source.dependencyInjection.articlesSourceKoinModule
import org.koin.dsl.module

val articlesDataKoinModule =
    module {

        single<ArticleRepository> {
            ArticleRepositoryImplementation(
                ioDispatcher = get(),
                localArticleSource = get(),
            )
        }

        includes(module = listOf(articlesSourceKoinModule))
    }