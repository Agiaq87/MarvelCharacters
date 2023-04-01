package it.giaquinto.marvelcharacters.ui.view.screen

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.style.TextAlign
import it.giaquinto.marvelcharacters.ui.state.UIState
import it.giaquinto.marvelcharacters.ui.theme.*
import kotlinx.coroutines.flow.StateFlow

@Composable
fun Pulse(
    tweenDuration: Int,
    passedContent: @Composable () -> Unit
) {
    val infiniteTransition = rememberInfiniteTransition()

    val color by infiniteTransition.animateColor(
        initialValue = BackgroundDefaultRed,
        targetValue = BackgroundFooterBlack,
        animationSpec = infiniteRepeatable(
            animation = tween(tweenDuration),
            repeatMode = RepeatMode.Reverse
        )
    )

    val scale by infiniteTransition.animateFloat(
        initialValue = 0.875f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(tweenDuration),
            repeatMode = RepeatMode.Reverse
        )
    )

    Box(
        modifier = Modifier
            .scale(scale)
            .background(color)
            .padding(EightPadding)
    ) {
        passedContent()
    }
}


@Composable
fun LoadingScreen(
    uiState: StateFlow<UIState>
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface {
            Row {
                Box(
                    modifier = Modifier
                        .padding(
                            EightPadding,
                            NoPadding
                        )
                        .wrapContentSize()
                ) {
                    Pulse(
                        tweenDuration = DefaultTweenDuration
                    ) {
                        Text(
                            "LOADING",
                            style = MaterialTheme.typography.h1,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                /*CircularProgressIndicator(
                    modifier = Modifier
                        .size(DefaultProgressSize),
                    color = BackgroundDefaultRed,
                    strokeWidth = DefaultProgressStrokeWidth
                )*/
            }
        }
    }
}
