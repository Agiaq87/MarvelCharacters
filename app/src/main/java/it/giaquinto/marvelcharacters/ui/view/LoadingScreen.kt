package it.giaquinto.marvelcharacters.ui.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import it.giaquinto.marvelcharacters.ui.theme.*
import it.giaquinto.marvelcharacters.ui.view.composable.DefaultBackground

@Composable
fun LoadingScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface {
            Box(
                modifier = Modifier
                    .padding(
                        LargePadding,
                        VeryLargePadding,
                        LargePadding
                    )
                    .wrapContentSize()
            ) {
                Text(
                    "LOADING",
                    style = MaterialTheme.typography.h1,
                    textAlign = TextAlign.Center
                )
            }
            CircularProgressIndicator(
                modifier = Modifier
                    .size(DefaultProgressSize),
                color = BackgroundDefaultRed,
                strokeWidth = DefaultProgressStrokeWidth
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowLoadingPreview() {
    MarvelCharactersTheme {
        DefaultBackground {
            LoadingScreen()
        }
    }
}