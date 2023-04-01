package it.giaquinto.marvelcharacters.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import it.giaquinto.marvelcharacters.data.model.result.MarvelResult
import it.giaquinto.marvelcharacters.domain.manager.NetworkManager
import it.giaquinto.marvelcharacters.domain.manager.TrackerManager
import it.giaquinto.marvelcharacters.domain.manager.data.network.ConnectivityState
import it.giaquinto.marvelcharacters.domain.manager.data.tracker.ScreenDataTrack
import it.giaquinto.marvelcharacters.ui.navigation.ScreenType
import kotlinx.coroutines.launch


abstract class BaseViewModel<T : MarvelResult?> constructor(
    networkManager: NetworkManager,
    trackerManager: TrackerManager
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
                            trackerManager.track(
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
}