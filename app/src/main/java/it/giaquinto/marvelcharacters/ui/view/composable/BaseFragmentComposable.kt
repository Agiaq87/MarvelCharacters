package it.giaquinto.marvelcharacters.ui.view.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import it.giaquinto.marvelcharacters.ui.theme.MarvelCharactersTheme


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MarvelCharactersTheme {
        DefaultBackground {

        }
    }
}
