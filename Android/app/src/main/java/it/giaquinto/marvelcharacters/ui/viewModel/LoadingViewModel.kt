package it.giaquinto.marvelcharacters.ui.viewModel

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.repository.*
import it.giaquinto.marvelcharacters.domain.manager.NetworkManager
import it.giaquinto.marvelcharacters.domain.manager.TrackerManager
import it.giaquinto.marvelcharacters.domain.manager.data.network.ConnectivityState
import it.giaquinto.marvelcharacters.ui.navigation.ScreenType
import it.giaquinto.marvelcharacters.ui.state.ErrorType
import it.giaquinto.marvelcharacters.ui.state.UIState
import kotlinx.coroutines.CoroutineScope
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
) : BaseViewModel<Nothing>(networkManager, trackerManager) {

    val uiState = mutableStateOf<UIState>(UIState.LoadingState)

    init {
        collectNetworkChange()
    }

    override val screenType: ScreenType
        get() = ScreenType.LOADING
    override val dataType: Nothing?
        get() = null

    private fun collectNetworkChange() = viewModelScope.launch {
        networkManager.stateListener.collect { connectivityState ->
            Log.e(
                this@LoadingViewModel::class.java.name,
                "Collect network state with value $connectivityState"
            )
            when (connectivityState) {
                ConnectivityState.CHANGE -> uiState.value = UIState.LoadingState
                ConnectivityState.KO -> uiState.value = UIState.ErrorState(ErrorType.NETWORK)
                ConnectivityState.OK -> {
                    uiState.value = UIState.LoadingState
                    characterRepository.all().collect { collection ->
                        when (collection) {
                            is ApiResult.Loading -> Log.e("Flow", "LOading")
                            is ApiResult.Success -> {
                                collection.data.forEach {
                                    Log.e("TADA", it.toString())
                                }
                            }
                            else -> {

                            }
                        }
                    }
                }
            }
        }
    }
}