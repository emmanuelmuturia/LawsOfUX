package emmanuelmuturia.lawsofux.cards.data.repository

import emmanuelmuturia.lawsofux.cards.data.model.Card
import emmanuelmuturia.lawsofux.cards.source.source.LocalCardSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class CardsRepositoryImplementation(
    private val localCardSource: LocalCardSource,
    private val ioDispatcher: CoroutineDispatcher,
) : CardsRepository {
    override suspend fun getAllCards(): Flow<List<Card>> {
        return withContext(context = ioDispatcher) {
            localCardSource.getAllLocalCards().map { localCards ->
                localCards.map { localCard ->
                    Card(
                        cardId = localCard.localCardId,
                        cardTitle = localCard.localCardTitle,
                        cardDescription = localCard.localCardDescription,
                    )
                }
            }
        }
    }
}