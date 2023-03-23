package it.giaquinto.marvelcharacters.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import it.giaquinto.marvelcharacters.R

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = FontFamily(listOf(Font(R.font.marvel_regular))),
        fontWeight = FontWeight.Normal,
        fontSize = 34.sp
    ),
    h4 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

val MarvelFontFamily = listOf(
    Font(R.font.titilliumweb_black),
    Font(R.font.titilliumweb_semibold),
    Font(R.font.titilliumweb_bold),
    Font(R.font.titilliumweb_light),
    Font(R.font.titilliumweb_regular)
)

val MarvelTitleFontFamily = listOf(
    Font(R.font.marvel_regular)
)