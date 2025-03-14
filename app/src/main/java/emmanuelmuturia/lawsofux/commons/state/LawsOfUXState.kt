package emmanuelmuturia.lawsofux.commons.state

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map

sealed class LawsOfUXState<out T> {
    data class Success<out T>(val data: T) : LawsOfUXState<T>()

    data class Error(val errorMessage: String) : LawsOfUXState<Nothing>()
}

fun <T> Flow<T>.asResult(): Flow<LawsOfUXState<T>> {
    return this
        .map<T, LawsOfUXState<T>> {
            LawsOfUXState.Success(data = it)
        }.catch {
            emit(LawsOfUXState.Error(errorMessage = it.message.toString()))
        }
}