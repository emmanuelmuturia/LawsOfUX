package emmanuelmuturia.lawsofux.articles.source.dependencyInjection

import emmanuelmuturia.lawsofux.articles.source.source.LocalArticleSource
import emmanuelmuturia.lawsofux.articles.source.source.LocalArticleSourceImplementation
import org.koin.dsl.module

val articlesSourceKoinModule =
    module {

        single<LocalArticleSource> {
            LocalArticleSourceImplementation(
                ioDispatcher = get(),
            )
        }
    }