package it.giaquinto.marvelcharacters.data.repository

import it.giaquinto.marvelcharacters.data.db.StoryDao
import it.giaquinto.marvelcharacters.data.service.StoriesApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StoriesRepository @Inject constructor(
    private val storiesApiService: StoriesApiService,
    private val storyDao: StoryDao
) {
}