package it.giaquinto.marvelcharacters.ui.viewModel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import it.giaquinto.marvelcharacters.data.repository.*
import it.giaquinto.marvelcharacters.domain.manager.NetworkManager
import it.giaquinto.marvelcharacters.domain.manager.data.network.ConnectivityState
import kotlinx.coroutines.CoroutineScope
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
    private val coroutine: CoroutineScope
) : ViewModel() {

    //var state: MutableStateFlow =

    init {
        if (networkManager.currentState() == ConnectivityState.OK) {

        } else {

        }
    }
}