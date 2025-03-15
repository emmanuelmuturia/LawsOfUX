package emmanuelmuturia.lawsofux.book.ui.dependencyInjection

import emmanuelmuturia.lawsofux.book.data.dependencyInjection.bookDataKoinModule
import emmanuelmuturia.lawsofux.book.ui.viewmodel.BookScreenViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val bookUIKoinModule = module {

    viewModel {
        BookScreenViewModel(
            bookRepository = get()
        )
    }

    includes(module = listOf(bookDataKoinModule))

}