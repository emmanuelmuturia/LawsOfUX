package emmanuelmuturia.lawsofux.book.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import emmanuelmuturia.lawsofux.book.data.repository.BookRepository
import emmanuelmuturia.lawsofux.book.ui.state.BookScreenUIState
import emmanuelmuturia.lawsofux.commons.state.LawsOfUXState
import emmanuelmuturia.lawsofux.commons.state.asResult
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class BookScreenViewModel(
    private val bookRepository: BookRepository,
) : ViewModel() {
    val bookScreenUIState = MutableStateFlow(value = BookScreenUIState())

    init {
        getAllBookFirstEditions()
        getAllBookGalleries()
        getAllBookLessons()
        getAllBookReviews()
        getAllBookSecondEditions()
        getAllBookTranslatedFirstEditions()
        getAllBookTranslatedSecondEditions()
    }

    private fun getAllBookFirstEditions() {
        bookScreenUIState.value =
            bookScreenUIState.value.copy(
                isLoading = true,
            )
        viewModelScope.launch {
            bookRepository.getAllBookFirstEditions().asResult().collect { result ->
                when (result) {
                    is LawsOfUXState.Success -> {
                        bookScreenUIState.update {
                            it.copy(
                                bookFirstEditions = result.data,
                                isLoading = false,
                            )
                        }
                    }

                    is LawsOfUXState.Error -> {
                        bookScreenUIState.update {
                            it.copy(
                                error = result.errorMessage,
                                isLoading = false,
                            )
                        }
                    }
                }
            }
        }
    }

    private fun getAllBookGalleries() {
        bookScreenUIState.value =
            bookScreenUIState.value.copy(
                isLoading = true,
            )
        viewModelScope.launch {
            bookRepository.getAllBookGalleries().asResult().collect { result ->
                when (result) {
                    is LawsOfUXState.Success -> {
                        bookScreenUIState.update {
                            it.copy(
                                bookGalleries = result.data,
                                isLoading = false,
                            )
                        }
                    }

                    is LawsOfUXState.Error -> {
                        bookScreenUIState.update {
                            it.copy(
                                error = result.errorMessage,
                                isLoading = false,
                            )
                        }
                    }
                }
            }
        }
    }

    private fun getAllBookLessons() {
        bookScreenUIState.value =
            bookScreenUIState.value.copy(
                isLoading = true,
            )
        viewModelScope.launch {
            bookRepository.getAllBookLessons().asResult().collect { result ->
                when (result) {
                    is LawsOfUXState.Success -> {
                        bookScreenUIState.update {
                            it.copy(
                                bookLessons = result.data,
                                isLoading = false,
                            )
                        }
                    }

                    is LawsOfUXState.Error -> {
                        bookScreenUIState.update {
                            it.copy(
                                error = result.errorMessage,
                                isLoading = false,
                            )
                        }
                    }
                }
            }
        }
    }

    private fun getAllBookReviews() {
        bookScreenUIState.value =
            bookScreenUIState.value.copy(
                isLoading = true,
            )
        viewModelScope.launch {
            bookRepository.getAllBookReviews().asResult().collect { result ->
                when (result) {
                    is LawsOfUXState.Success -> {
                        bookScreenUIState.update {
                            it.copy(
                                bookReviews = result.data,
                                isLoading = false,
                            )
                        }
                    }

                    is LawsOfUXState.Error -> {
                        bookScreenUIState.update {
                            it.copy(
                                error = result.errorMessage,
                                isLoading = false,
                            )
                        }
                    }
                }
            }
        }
    }

    private fun getAllBookSecondEditions() {
        bookScreenUIState.value =
            bookScreenUIState.value.copy(
                isLoading = true,
            )
        viewModelScope.launch {
            bookRepository.getAllBookSecondEditions().asResult().collect { result ->
                when (result) {
                    is LawsOfUXState.Success -> {
                        bookScreenUIState.update {
                            it.copy(
                                bookSecondEditions = result.data,
                                isLoading = false,
                            )
                        }
                    }

                    is LawsOfUXState.Error -> {
                        bookScreenUIState.update {
                            it.copy(
                                error = result.errorMessage,
                                isLoading = false,
                            )
                        }
                    }
                }
            }
        }
    }

    private fun getAllBookTranslatedFirstEditions() {
        bookScreenUIState.value =
            bookScreenUIState.value.copy(
                isLoading = true,
            )
        viewModelScope.launch {
            bookRepository.getAllBookTranslatedFirstEditions().asResult().collect { result ->
                when (result) {
                    is LawsOfUXState.Success -> {
                        bookScreenUIState.update {
                            it.copy(
                                bookTranslatedFirstEditions = result.data,
                                isLoading = false,
                            )
                        }
                    }

                    is LawsOfUXState.Error -> {
                        bookScreenUIState.update {
                            it.copy(
                                error = result.errorMessage,
                                isLoading = false,
                            )
                        }
                    }
                }
            }
        }
    }

    private fun getAllBookTranslatedSecondEditions() {
        bookScreenUIState.value =
            bookScreenUIState.value.copy(
                isLoading = true,
            )
        viewModelScope.launch {
            bookRepository.getAllBookTranslatedSecondEditions().asResult().collect { result ->
                when (result) {
                    is LawsOfUXState.Success -> {
                        bookScreenUIState.update {
                            it.copy(
                                bookTranslatedSecondEditions = result.data,
                                isLoading = false,
                            )
                        }
                    }

                    is LawsOfUXState.Error -> {
                        bookScreenUIState.update {
                            it.copy(
                                error = result.errorMessage,
                                isLoading = false,
                            )
                        }
                    }
                }
            }
        }
    }
}