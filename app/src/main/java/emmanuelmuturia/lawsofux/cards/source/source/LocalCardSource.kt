package emmanuelmuturia.lawsofux.cards.source.source

import emmanuelmuturia.lawsofux.cards.source.model.LocalCard
import kotlinx.coroutines.flow.Flow

interface LocalCardSource {
    suspend fun getAllLocalCards(): Flow<List<LocalCard>>
}