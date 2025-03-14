package emmanuelmuturia.lawsofux.cards.source.dependencyInjection

import emmanuelmuturia.lawsofux.cards.source.source.LocalCardSource
import emmanuelmuturia.lawsofux.cards.source.source.LocalCardSourceImplementation
import org.koin.dsl.module

val cardsSourceKoinModule =
    module {

        single<LocalCardSource> {
            LocalCardSourceImplementation(
                ioDispatcher = get(),
            )
        }
    }