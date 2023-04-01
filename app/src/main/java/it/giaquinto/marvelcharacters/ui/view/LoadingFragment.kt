package it.giaquinto.marvelcharacters.ui.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import it.giaquinto.marvelcharacters.ui.theme.MarvelCharactersTheme
import it.giaquinto.marvelcharacters.ui.view.composable.DefaultBackground
import it.giaquinto.marvelcharacters.ui.view.screen.LoadingScreen
import it.giaquinto.marvelcharacters.ui.viewModel.LoadingViewModel

@Composable
fun LoadingFragment(
    loadingViewModel: LoadingViewModel = viewModel()
) {

    LoadingScreen(loadingViewModel.uiState)
}

@Preview(showBackground = true)
@Composable
fun ShowLoadingPreview() {
    MarvelCharactersTheme {
        DefaultBackground {
            LoadingFragment()
        }
    }
}