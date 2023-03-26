package it.giaquinto.libs.module

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import it.giaquinto.marvelcharacters.data.db.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalModule {
    @Singleton
    @Provides
    fun provideMarvelDatabase(@ApplicationContext context: Context): MarvelDatabase =
        Room.databaseBuilder(context, MarvelDatabase::class.java, "marvel-characters-app").build()

    @Singleton
    @Provides
    fun provideCharacterDatabase(marvelDatabase: MarvelDatabase): CharacterDao =
        marvelDatabase.characterDao()

    @Singleton
    @Provides
    fun provideComicDatabase(marvelDatabase: MarvelDatabase): ComicDao =
        marvelDatabase.comicDao()

    @Singleton
    @Provides
    fun provideCreatorDatabase(marvelDatabase: MarvelDatabase): CreatorDao =
        marvelDatabase.creatorDao()

    @Singleton
    @Provides
    fun provideEventDatabase(marvelDatabase: MarvelDatabase): EventDao =
        marvelDatabase.eventDao()

    @Singleton
    @Provides
    fun provideSerieDatabase(marvelDatabase: MarvelDatabase): SerieDao =
        marvelDatabase.serieDao()

    @Singleton
    @Provides
    fun provideStoryDatabase(marvelDatabase: MarvelDatabase): StoryDao =
        marvelDatabase.storyDao()
}