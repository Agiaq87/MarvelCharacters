package it.giaquinto.marvelcharacters.ui.state

interface UIState

object LoadingState : UIState

data class ErrorState(val data: ErrorType) : UIState

object SuccessState : UIState