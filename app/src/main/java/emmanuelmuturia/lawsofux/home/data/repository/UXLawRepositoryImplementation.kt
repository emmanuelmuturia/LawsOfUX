package emmanuelmuturia.lawsofux.home.data.repository

import emmanuelmuturia.lawsofux.home.source.source.LocalUXLawsSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class UXLawRepositoryImplementation(
    private val ioDispatcher: CoroutineDispatcher,
    private val localUXLawsSource: LocalUXLawsSource
) : UXLawRepository {

    override suspend fun getAllLocalUXLaws() {
        withContext(context = ioDispatcher) {
            localUXLawsSource.getAllLocalUXLaws()
        }
    }
}