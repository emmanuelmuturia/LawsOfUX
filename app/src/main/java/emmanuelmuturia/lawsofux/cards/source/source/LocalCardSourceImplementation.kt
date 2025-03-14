package emmanuelmuturia.lawsofux.cards.source.source

import emmanuelmuturia.lawsofux.cards.source.model.LocalCard
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext

class LocalCardSourceImplementation(
    private val ioDispatcher: CoroutineDispatcher,
) : LocalCardSource {
    private val localCards =
        listOf(
            LocalCard(
                localCardTitle = "Laws of UX Review: First Impressions",
                localCardDescription = "Britni Pepper | Medium",
            ),
            LocalCard(
                localCardTitle = "Defining Design Principles",
                localCardDescription = "Phillip Macdonald | Daring Greatly",
            ),
        )

    override suspend fun getAllLocalCards(): Flow<List<LocalCard>> {
        return withContext(context = ioDispatcher) {
            flowOf(value = localCards)
        }
    }
}