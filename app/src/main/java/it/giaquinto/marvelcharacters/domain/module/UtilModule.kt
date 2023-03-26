package it.giaquinto.marvelcharacters.domain.module

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import it.giaquinto.marvelcharacters.domain.manager.NetworkManager
import it.giaquinto.marvelcharacters.domain.manager.TrackerManager
import it.giaquinto.marvelcharacters.domain.manager.data.network.CustomNetworkManger
import it.giaquinto.marvelcharacters.domain.manager.data.tracker.CustomTrackerManager
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
    fun provideCustomTrackerManager(): TrackerManager =
        CustomTrackerManager()
}