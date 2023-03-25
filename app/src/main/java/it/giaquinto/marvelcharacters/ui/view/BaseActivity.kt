package it.giaquinto.marvelcharacters.ui.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import it.giaquinto.marvelcharacters.ui.theme.MarvelCharactersTheme
import it.giaquinto.marvelcharacters.ui.view.composable.*

class BaseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainView()
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainView() {
    MarvelCharactersTheme {
        Scaffold(
            topBar = {
                AppBar()
            },
            bottomBar = {
                AppFooter(
                    {},
                    {},
                    {}
                )
            }
        ) {
            DefaultBackground {
                LoadingScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainView()
}



