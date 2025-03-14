package emmanuelmuturia.lawsofux.articles.ui.dependencyInjection

import emmanuelmuturia.lawsofux.articles.data.dependencyInjection.articlesDataKoinModule
import emmanuelmuturia.lawsofux.articles.ui.viewmodel.ArticlesScreenViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val articlesUIKoinModule = module {

    viewModel {
        ArticlesScreenViewModel(
            articleRepository = get()
        )
    }

    includes(module = listOf(articlesDataKoinModule))

}