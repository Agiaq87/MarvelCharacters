package it.giaquinto.marvelcharacters.domain.module

import android.content.Context
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import it.giaquinto.marvelcharacters.domain.manager.NetworkManager
import it.giaquinto.marvelcharacters.domain.manager.TrackerManager
import it.giaquinto.marvelcharacters.domain.manager.data.network.CustomNetworkManger
import it.giaquinto.marvelcharacters.domain.manager.data.tracker.CustomTrackerManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UtilModule {
    @Singleton
    @Provides
    fun provideCustomNetworkManager(@ApplicationContext context: Context): NetworkManager =
        CustomNetworkManger(context)

    @Singleton
    @Provides
    fun provideFireBaseAnalytics(): FirebaseAnalytics =
        Firebase.analytics

    @Singleton
    @Provides
    fun provideLowProfileCoroutineScope(): CoroutineScope =
        CoroutineScope(Dispatchers.IO)

    @Singleton
    @Provides
    fun provideCustomTrackerManager(
        firebaseAnalytics: FirebaseAnalytics,
        coroutineScope: CoroutineScope
    ): TrackerManager =
        CustomTrackerManager(firebaseAnalytics, coroutineScope)

}