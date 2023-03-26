package it.giaquinto.marvelcharacters.domain.manager

import it.giaquinto.marvelcharacters.domain.manager.data.network.ConnectivityState

interface NetworkManager {
    fun currentState(): ConnectivityState
}