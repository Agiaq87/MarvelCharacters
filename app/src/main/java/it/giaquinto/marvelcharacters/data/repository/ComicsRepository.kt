package it.giaquinto.marvelcharacters.data.repository

import it.giaquinto.marvelcharacters.data.db.ComicDao
import it.giaquinto.marvelcharacters.data.service.ComicsApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ComicsRepository @Inject constructor(
    private val comicsApiService: ComicsApiService,
    private val characterDao: ComicDao
) {
}