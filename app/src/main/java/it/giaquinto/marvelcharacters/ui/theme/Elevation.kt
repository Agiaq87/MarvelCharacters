package it.giaquinto.marvelcharacters.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class Elevation(val cardElevation: Dp = 0.dp)

internal val LocalElevations = staticCompositionLocalOf { Elevation() }