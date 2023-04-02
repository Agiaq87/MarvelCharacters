package it.giaquinto.marvelcharacters.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = BackgroundDefaultRed,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = BackgroundDefaultRed,
    primaryVariant = BackgroundFooterBlack,
    secondary = Teal200,
    surface = BackgroundDefaultRedItem,
    onPrimary = OnPrimaryDefaultColor,
    onSurface = OnPrimaryDefaultColor,
)

@Composable
fun MarvelCharactersTheme(
    //darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}