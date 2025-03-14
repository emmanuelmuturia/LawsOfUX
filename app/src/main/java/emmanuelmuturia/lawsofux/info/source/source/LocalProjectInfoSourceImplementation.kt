package emmanuelmuturia.lawsofux.info.source.source

import emmanuelmuturia.lawsofux.info.source.model.LocalProjectInfo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext

class LocalProjectInfoSourceImplementation(
    private val ioDispatcher: CoroutineDispatcher,
) : LocalProjectInfoSource {
    private val localProjectInfos =
        listOf(
            LocalProjectInfo(
                localProjectInfoTitle = "Book Club: Laws of UX",
                localProjectInfoDescription = "MONDO ROBOT DESIGN SERIES",
            ),
            LocalProjectInfo(
                localProjectInfoTitle = "Translating Laws of UX",
                localProjectInfoDescription = "JONYABLONSKI.COM",
            ),
            LocalProjectInfo(
                localProjectInfoTitle = "Laws of UX v2.0",
                localProjectInfoDescription = "JONYABLONSKI.COM",
            ),
            LocalProjectInfo(
                localProjectInfoTitle = "Laws of UX: Making the resources you are looking for",
                localProjectInfoDescription = "PROTOTYPR.COM",
            ),
            LocalProjectInfo(
                localProjectInfoTitle = "Laws of UX — Jon’s book, an interview",
                localProjectInfoDescription = "UX COLLECTIVE",
            ),
            LocalProjectInfo(
                localProjectInfoTitle = "10 Laws Of UX, Illustrated",
                localProjectInfoDescription = "FASTCOMPANY",
            ),
            LocalProjectInfo(
                localProjectInfoTitle = "Why All UX Designers Need to Check Out the Laws of UX",
                localProjectInfoDescription = "ADOBE",
            ),
            LocalProjectInfo(
                localProjectInfoTitle = "Interview w/ Jon Yablonski",
                localProjectInfoDescription = "DEVELOPER TEA",
            ),
        )

    override suspend fun getAllLocalProjectInfos(): Flow<List<LocalProjectInfo>> {
        return withContext(context = ioDispatcher) {
            flowOf(localProjectInfos)
        }
    }
}