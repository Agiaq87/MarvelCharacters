package it.giaquinto.marvelcharacters.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

object ThemeBorder {
    val alertDialogBorder =
        BorderData(2.dp, SolidColor(ThemeColor.secondaryBlack), RoundedCornerShape(1.dp))

    data class BorderData(
        val width: Dp,
        val brush: Brush,
        val shape: Shape
    )
}