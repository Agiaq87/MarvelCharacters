package it.giaquinto.marvelcharacters.ui.state

sealed class UIState {
    object LoadingState : UIState()

    data class ErrorState(val data: ErrorType) : UIState()

    object SuccessState : UIState()
}

