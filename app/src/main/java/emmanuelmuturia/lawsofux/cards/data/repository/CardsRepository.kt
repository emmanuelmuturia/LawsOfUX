package emmanuelmuturia.lawsofux.cards.data.repository

import emmanuelmuturia.lawsofux.cards.data.model.Card
import kotlinx.coroutines.flow.Flow

interface CardsRepository {
    suspend fun getAllCards(): Flow<List<Card>>
}