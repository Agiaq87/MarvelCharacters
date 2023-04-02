package it.giaquinto.marvelcharacters.domain.manager.data.network

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import dagger.hilt.android.qualifiers.ApplicationContext
import it.giaquinto.marvelcharacters.domain.manager.NetworkManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CustomNetworkManger @Inject constructor(
    @ApplicationContext context: Context
) : NetworkManager, ConnectivityManager.NetworkCallback() {

    private val connectivityManager: ConnectivityManager by lazy {
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    private var _connectivityState = MutableStateFlow<ConnectivityState>(ConnectivityState.CHANGE)
    override val stateListener = _connectivityState.asStateFlow()

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
        _connectivityState.value


    override fun onAvailable(network: Network) {
        _connectivityState.update { ConnectivityState.OK }
        super.onAvailable(network)
    }

    override fun onLosing(network: Network, maxMsToLive: Int) {
        _connectivityState.update {
            ConnectivityState.CHANGE
        }
        super.onLosing(network, maxMsToLive)
    }

    override fun onLost(network: Network) {
        _connectivityState.update {
            ConnectivityState.KO
        }
        super.onLost(network)
    }

    override fun onUnavailable() {
        _connectivityState.update {
            ConnectivityState.KO
        }
        super.onUnavailable()
    }

    override fun onCapabilitiesChanged(network: Network, networkCapabilities: NetworkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities)
        _connectivityState.update {
            if (networkCapabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET))
                ConnectivityState.OK
            else
                ConnectivityState.KO
        }

    }

    companion object {
        private const val DELAY = 500L
    }
}