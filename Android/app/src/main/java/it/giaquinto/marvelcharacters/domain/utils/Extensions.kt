package it.giaquinto.marvelcharacters.domain.utils

import android.util.Log
import it.giaquinto.marvelcharacters.BuildConfig

fun Log.print(msg: String) = if (BuildConfig.DEBUG) {
    Log.d("MARVEL-CHARACTERS", msg)
} else {
}