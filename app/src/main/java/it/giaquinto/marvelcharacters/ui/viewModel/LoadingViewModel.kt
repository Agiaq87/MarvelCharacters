package it.giaquinto.marvelcharacters.ui.viewModel

import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import it.giaquinto.marvelcharacters.data.repository.*
import it.giaquinto.marvelcharacters.domain.manager.NetworkManager
import it.giaquinto.marvelcharacters.domain.manager.TrackerManager
import it.giaquinto.marvelcharacters.domain.manager.data.network.ConnectivityState
import it.giaquinto.marvelcharacters.ui.navigation.ScreenType
import it.giaquinto.marvelcharacters.ui.state.ErrorState
import it.giaquinto.marvelcharacters.ui.state.ErrorType
import it.giaquinto.marvelcharacters.ui.state.LoadingState
import it.giaquinto.marvelcharacters.ui.state.UIState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoadingViewModel @Inject constructor(
    private val characterRepository: CharacterRepository,
    private val comicRepository: ComicRepository,
    private val creatorRepository: CreatorRepository,
    private val eventRepository: EventRepository,
    private val serieRepository: SerieRepository,
    private val storyRepository: StoryRepository,
    private val networkManager: NetworkManager,
    private val coroutine: CoroutineScope,
    trackerManager: TrackerManager,
) : BaseViewModel<Nothing>(trackerManager) {

    private val _uiState = MutableStateFlow<UIState>(LoadingState)
    val uiState: StateFlow<UIState> = _uiState

    init {
        viewModelScope.launch {
            if (networkManager.currentState() == ConnectivityState.OK) {

            } else {
                _uiState.value = ErrorState(ErrorType.NETWORK)
            }
        }
    }

    override val screenType: ScreenType
        get() = ScreenType.LOADING
    override val dataType: Nothing?
        get() = null
}