package it.giaquinto.marvelcharacters.domain.manager.data.tracker

import androidx.core.os.bundleOf
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import it.giaquinto.marvelcharacters.domain.manager.TrackerManager
import javax.inject.Singleton

@Singleton
internal class CustomTrackerManager : TrackerManager {
    private val firebaseAnalytics: FirebaseAnalytics by lazy {
        Firebase.analytics
    }

    override fun track(screenDataTrack: ScreenDataTrack) = with(firebaseAnalytics) {
        logEvent(
            FirebaseAnalytics.Event.SCREEN_VIEW, bundleOf(
                FirebaseAnalytics.Param.SCREEN_NAME to screenDataTrack.name,
                FirebaseAnalytics.Param.SCREEN_CLASS to screenDataTrack.content
            )
        )
    }


}