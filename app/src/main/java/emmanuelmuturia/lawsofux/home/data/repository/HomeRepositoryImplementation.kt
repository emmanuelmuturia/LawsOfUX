package emmanuelmuturia.lawsofux.home.data.repository

import emmanuelmuturia.lawsofux.home.data.model.UXLaw
import emmanuelmuturia.lawsofux.home.source.source.LocalUXLawsSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class HomeRepositoryImplementation(
    private val ioDispatcher: CoroutineDispatcher,
    private val localUXLawsSource: LocalUXLawsSource,
) : HomeRepository {
    override suspend fun getAllLocalUXLaws(): Flow<List<UXLaw>> {
        return withContext(context = ioDispatcher) {
            localUXLawsSource.getAllLocalUXLaws().map { localUXLaws ->
                localUXLaws.map { localUXLaw ->
                    UXLaw(
                        uxLawId = localUXLaw.localUxLawID,
                        uxLawThumbnail = localUXLaw.localUxLawThumbnail,
                        uxLawTitle = localUXLaw.localUxLawTitle,
                        uxLawDescription = localUXLaw.localUxLawDescription,
                        uXLawTakeaways = localUXLaw.localUXLawTakeaways,
                        uXLawOrigins = localUXLaw.localUXLawOrigins,
                        uXLawFurtherReading = localUXLaw.localUXLawFurtherReading,
                        uXLawSource = localUXLaw.localUXLawSource,
                        uXLawLargeFormatPoster = localUXLaw.localUXLawLargeFormatPoster,
                        uXLawFreePoster = localUXLaw.localUXLawFreePoster,
                    )
                }
            }
        }
    }
}