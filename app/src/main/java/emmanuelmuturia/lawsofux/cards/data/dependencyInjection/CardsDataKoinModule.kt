package emmanuelmuturia.lawsofux.cards.data.dependencyInjection

import emmanuelmuturia.lawsofux.cards.data.repository.CardsRepository
import emmanuelmuturia.lawsofux.cards.data.repository.CardsRepositoryImplementation
import emmanuelmuturia.lawsofux.cards.source.dependencyInjection.cardsSourceKoinModule
import org.koin.dsl.module

val cardsDataKoinModule = module {

    single<CardsRepository> {
        CardsRepositoryImplementation(
            localCardSource = get(),
            ioDispatcher = get(),
        )
    }

    includes(module = listOf(cardsSourceKoinModule))

}