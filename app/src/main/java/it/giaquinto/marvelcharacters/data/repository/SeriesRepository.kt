package it.giaquinto.marvelcharacters.data.repository

import it.giaquinto.marvelcharacters.data.db.SerieDao
import it.giaquinto.marvelcharacters.data.service.SeriesApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SeriesRepository @Inject constructor(
    private val seriesApiService: SeriesApiService,
    private val serieDao: SerieDao
) {
}