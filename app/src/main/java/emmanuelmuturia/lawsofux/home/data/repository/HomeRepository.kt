package emmanuelmuturia.lawsofux.home.data.repository

import emmanuelmuturia.lawsofux.home.data.model.UXLaw
import kotlinx.coroutines.flow.Flow

interface HomeRepository {
    suspend fun getAllLocalUXLaws(): Flow<List<UXLaw>>
}