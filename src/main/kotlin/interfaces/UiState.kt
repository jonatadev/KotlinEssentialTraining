package interfaces

sealed interface UiState {

    // loading
    object Loading: UiState

    // loaded
    data class Loaded(
        val title: String,
        val subtitle: String
    ) : UiState

    // Error
    class Error(val error: Throwable): UiState
}