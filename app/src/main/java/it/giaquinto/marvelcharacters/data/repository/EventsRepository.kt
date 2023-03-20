package it.giaquinto.marvelcharacters.data.repository

import it.giaquinto.marvelcharacters.data.db.EventDao
import it.giaquinto.marvelcharacters.data.service.EventsApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EventsRepository @Inject constructor(
    private val eventsApiService: EventsApiService,
    private val eventDao: EventDao
) {
}