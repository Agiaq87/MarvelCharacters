package it.giaquinto.marvelcharacters.domain.manager

import it.giaquinto.marvelcharacters.domain.manager.data.tracker.EventDataTrack
import it.giaquinto.marvelcharacters.domain.manager.data.tracker.ScreenDataTrack
import kotlinx.coroutines.Job

interface TrackerManager {
    fun trackScreen(screenDataTrack: ScreenDataTrack): Job

    fun trackEvent(eventDataTrack: EventDataTrack): Job
}