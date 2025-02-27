package emmanuelmuturia.lawsofux.home.source.source

import emmanuelmuturia.lawsofux.home.source.model.LocalUXLaw
import kotlinx.coroutines.flow.Flow

interface LocalUXLawsSource {
    suspend fun getAllLocalUXLaws(): Flow<List<LocalUXLaw>>
}