package it.giaquinto.marvelcharacters.domain.manager.data

enum class ConnectivityState {
    OK,         // Wifi or mobile connection active
    CHANGING,   // Connection state in change
    KO         // Not connected
}