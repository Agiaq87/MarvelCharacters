package it.giaquinto.marvelcharacters.domain.manager

import it.giaquinto.marvelcharacters.domain.manager.data.tracker.ScreenDataTrack

interface TrackerManager {
    fun track(screenDataTrack: ScreenDataTrack)
}