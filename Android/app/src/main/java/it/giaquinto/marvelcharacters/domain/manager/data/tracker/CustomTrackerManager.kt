package it.giaquinto.marvelcharacters.domain.manager.data.tracker

import androidx.core.os.bundleOf
import com.google.firebase.analytics.FirebaseAnalytics
import it.giaquinto.marvelcharacters.domain.manager.TrackerManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class CustomTrackerManager @Inject constructor(
    private val firebaseAnalytics: FirebaseAnalytics,
    private val coroutineScopeLow: CoroutineScope
) : TrackerManager {

    override fun trackScreen(screenDataTrack: ScreenDataTrack) = with(coroutineScopeLow) {
        launch {
            with(firebaseAnalytics) {
                logEvent(
                    FirebaseAnalytics.Event.SCREEN_VIEW, bundleOf(
                        FirebaseAnalytics.Param.SCREEN_NAME to screenDataTrack.name,
                        FirebaseAnalytics.Param.SCREEN_CLASS to screenDataTrack.content
                    )
                )
            }
        }
    }

    override fun trackEvent(eventDataTrack: EventDataTrack): Job = with(coroutineScopeLow) {
        launch {
            with(firebaseAnalytics) {
                logEvent(
                    eventDataTrack.name,
                    eventDataTrack.params
                )
            }
        }
    }

}