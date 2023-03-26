package it.giaquinto.marvelcharacters.domain.manager

import it.giaquinto.marvelcharacters.domain.manager.data.tracker.ScreenDataTrack
import kotlinx.coroutines.Job

interface TrackerManager {
    fun track(screenDataTrack: ScreenDataTrack): Job
}