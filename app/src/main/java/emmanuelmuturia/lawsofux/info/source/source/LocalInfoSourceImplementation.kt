package emmanuelmuturia.lawsofux.info.source.source

import emmanuelmuturia.lawsofux.info.source.model.LocalInfo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.withContext

class LocalInfoSourceImplementation(
    private val ioDispatcher: CoroutineDispatcher,
) : LocalInfoSource {
    private val localInfos =
        listOf(
            LocalInfo(
                localInfoTitle = "Book Club: Laws of UX",
                localInfoDescription = "MONDO ROBOT DESIGN SERIES",
            ),
            LocalInfo(
                localInfoTitle = "Translating Laws of UX",
                localInfoDescription = "JONYABLONSKI.COM",
            ),
            LocalInfo(
                localInfoTitle = "Laws of UX v2.0",
                localInfoDescription = "JONYABLONSKI.COM",
            ),
            LocalInfo(
                localInfoTitle = "Laws of UX: Making the resources you are looking for",
                localInfoDescription = "PROTOTYPR.COM",
            ),
            LocalInfo(
                localInfoTitle = "Laws of UX — Jon’s book, an interview",
                localInfoDescription = "UX COLLECTIVE",
            ),
            LocalInfo(
                localInfoTitle = "10 Laws Of UX, Illustrated",
                localInfoDescription = "FASTCOMPANY",
            ),
            LocalInfo(
                localInfoTitle = "Why All UX Designers Need to Check Out the Laws of UX",
                localInfoDescription = "ADOBE",
            ),
            LocalInfo(
                localInfoTitle = "Interview w/ Jon Yablonski",
                localInfoDescription = "DEVELOPER TEA",
            ),
        )

    override suspend fun getAllLocalInfos(): Flow<List<LocalInfo>> {
        return withContext(context = ioDispatcher) {
            flowOf(value = localInfos)
        }
    }
}