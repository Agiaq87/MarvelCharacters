package it.giaquinto.marvelcharacters.domain.manager.data

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import dagger.hilt.android.qualifiers.ApplicationContext
import it.giaquinto.marvelcharacters.domain.manager.NetworkManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CustomNetworkManger @Inject constructor(
    @ApplicationContext context: Context
) : NetworkManager, ConnectivityManager.NetworkCallback() {

    private val connectivityManager: ConnectivityManager by lazy {
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    private var connectivityState: ConnectivityState = ConnectivityState.CHANGING

    init {
        connectivityManager.registerNetworkCallback(
            NetworkRequest.Builder()
                .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
                .addTransportType(NetworkCapabilities.TRANSPORT_WIFI)
                .addTransportType(NetworkCapabilities.TRANSPORT_CELLULAR)
                .build(),
            this
        )
    }

    override fun currentState(): ConnectivityState =
        connectivityState


    override fun onAvailable(network: Network) {
        connectivityState = ConnectivityState.OK
        super.onAvailable(network)
    }

    override fun onLosing(network: Network, maxMsToLive: Int) {
        connectivityState = ConnectivityState.CHANGING
        super.onLosing(network, maxMsToLive)
    }

    override fun onLost(network: Network) {
        connectivityState = ConnectivityState.KO
        super.onLost(network)
    }

    override fun onUnavailable() {
        connectivityState = ConnectivityState.KO
        super.onUnavailable()
    }

    override fun onCapabilitiesChanged(network: Network, networkCapabilities: NetworkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities)
        connectivityState =
            if (networkCapabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET))
                ConnectivityState.OK
            else
                ConnectivityState.KO
    }
}