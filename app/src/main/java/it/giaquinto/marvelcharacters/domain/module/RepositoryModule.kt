package it.giaquinto.marvelcharacters.domain.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import it.giaquinto.marvelcharacters.data.db.*
import it.giaquinto.marvelcharacters.data.repository.*
import it.giaquinto.marvelcharacters.data.repository.implementation.*
import it.giaquinto.marvelcharacters.data.service.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Singleton
    @Provides
    fun provideCharacterRepository(
        charactersApiService: CharactersApiService,
        characterDao: CharacterDao
    ): CharacterRepository =
        CharactersRepositoryImplementation(
            charactersApiService,
            characterDao
        )

    @Singleton
    @Provides
    fun provideComicsRepository(
        comicsApiService: ComicsApiService,
        comicDao: ComicDao
    ): ComicRepository =
        ComicsRepositoryImplementation(
            comicsApiService,
            comicDao
        )

    @Singleton
    @Provides
    fun provideCreatorRepository(
        creatorsApiService: CreatorsApiService,
        creatorDao: CreatorDao
    ): CreatorRepository =
        CreatorsRepositoryImplementation(
            creatorsApiService,
            creatorDao
        )

    @Singleton
    @Provides
    fun provideEventRepository(
        eventsApiService: EventsApiService,
        eventDao: EventDao
    ): EventRepository =
        EventsRepositoryImplementation(
            eventsApiService,
            eventDao
        )

    @Singleton
    @Provides
    fun provideSerieRepository(
        seriesApiService: SeriesApiService,
        serieDao: SerieDao
    ): SerieRepository =
        SeriesRepositoryImplementation(
            seriesApiService,
            serieDao
        )

    @Singleton
    @Provides
    fun provideStoryRepository(
        storiesApiService: StoriesApiService,
        storyDao: StoryDao
    ): StoryRepository =
        StoriesRepositoryImplementation(
            storiesApiService,
            storyDao
        )
}