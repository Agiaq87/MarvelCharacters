package it.giaquinto.marvelcharacters.domain.manager.data.network

sealed class ConnectivityState {
    object OK : ConnectivityState()         // Wifi or mobile connection active
    object CHANGE : ConnectivityState() // Connection state in change
    object KO : ConnectivityState()         // Not connected
}