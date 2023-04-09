package it.giaquinto.marvelcharacters.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.model.result.MarvelResult
import it.giaquinto.marvelcharacters.data.repository.BaseRepository
import it.giaquinto.marvelcharacters.domain.manager.NetworkManager
import it.giaquinto.marvelcharacters.domain.manager.TrackerManager
import it.giaquinto.marvelcharacters.domain.manager.data.network.ConnectivityState
import it.giaquinto.marvelcharacters.domain.manager.data.tracker.EventDataTrack
import it.giaquinto.marvelcharacters.domain.manager.data.tracker.ScreenDataTrack
import it.giaquinto.marvelcharacters.ui.navigation.ScreenType
import kotlinx.coroutines.launch


abstract class BaseViewModel<T : MarvelResult?> constructor(
    val networkManager: NetworkManager,
    val trackerManager: TrackerManager
) : ViewModel() {

    abstract val screenType: ScreenType
    abstract val dataType: T?

    private var alreadySubmittedTrack: Boolean = false

    init {
        viewModelScope.launch {
            networkManager.stateListener.collect {
                when (it) {
                    is ConnectivityState.OK -> {
                        if (!alreadySubmittedTrack) {
                            trackerManager.trackScreen(
                                when (screenType) {
                                    ScreenType.LOADING -> ScreenDataTrack.forLoadingFragment()
                                    ScreenType.LIST -> ScreenDataTrack.forListFragment(dataType)
                                    ScreenType.DETAIL -> ScreenDataTrack.forDetailFragment(dataType)
                                }
                            )
                            alreadySubmittedTrack = true
                        }

                    }
                    else -> {}
                }
            }
        }
    }

    suspend fun <EXTENDED_MARVEL_RESULT: MarvelResult, EXTENDED_MARVEL_REPOSITORY: BaseRepository<EXTENDED_MARVEL_RESULT>> collect(
        repository: EXTENDED_MARVEL_REPOSITORY,
        onLoading: () -> Unit,
        onError: (String) -> Unit,
        onSuccess: (List<EXTENDED_MARVEL_RESULT>) -> Unit
    ) = with(repository) {
        all().collect {
            when(it) {
                is ApiResult.Loading -> {
                    logRepoOnTracker(EventDataTrack.FetchNetwork(repository, it))
                    onLoading()
                }
                is ApiResult.Success -> {
                    logRepoOnTracker(EventDataTrack.FetchNetwork(repository, it))
                    onSuccess(it.data)
                }
                is ApiResult.Error -> {
                    logRepoOnTracker(EventDataTrack.FetchNetwork(repository, it))
                    onError(it.message)
                }
            }
        }
    }

    private fun <EXTENDED_MARVEL_RESULT: MarvelResult, EXTENDED_MARVEL_REPOSITORY: BaseRepository<EXTENDED_MARVEL_RESULT>> logRepoOnTracker(
        event: EventDataTrack.FetchNetwork<EXTENDED_MARVEL_RESULT, EXTENDED_MARVEL_REPOSITORY>
    ) =
        trackerManager.trackEvent(event)
}