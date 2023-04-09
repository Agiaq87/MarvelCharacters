package it.giaquinto.marvelcharacters.ui.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint
import it.giaquinto.marvelcharacters.domain.manager.TrackerManager
import it.giaquinto.marvelcharacters.domain.manager.data.tracker.ScreenDataTrack
import it.giaquinto.marvelcharacters.ui.theme.MarvelCharactersTheme
import it.giaquinto.marvelcharacters.ui.view.composable.*
import it.giaquinto.marvelcharacters.ui.view.screen.LoadingFragment
import javax.inject.Inject

@AndroidEntryPoint
class BaseActivity : ComponentActivity() {

    @Inject
    lateinit var trackerManager: TrackerManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        trackerManager.trackScreen(
            ScreenDataTrack.forActivity()
        )

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
                LoadingFragment()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainView()
}



