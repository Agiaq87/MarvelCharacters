package it.giaquinto.marvelcharacters.domain.manager

import it.giaquinto.marvelcharacters.domain.manager.data.network.ConnectivityState
import kotlinx.coroutines.flow.StateFlow

interface NetworkManager {
    val stateListener: StateFlow<ConnectivityState>
    fun currentState(): ConnectivityState
}