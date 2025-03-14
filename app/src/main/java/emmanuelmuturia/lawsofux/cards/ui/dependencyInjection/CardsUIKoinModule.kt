package emmanuelmuturia.lawsofux.cards.ui.dependencyInjection

import emmanuelmuturia.lawsofux.cards.data.dependencyInjection.cardsDataKoinModule
import emmanuelmuturia.lawsofux.cards.ui.viewmodel.CardsScreenViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val cardsUIKoinModule = module {

    viewModel {
        CardsScreenViewModel(
            cardsRepository = get(),
        )
    }

    includes(module = listOf(cardsDataKoinModule))

}