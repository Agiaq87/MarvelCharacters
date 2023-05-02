package it.giaquinto.marvelcharacters.ui.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import it.giaquinto.marvelcharacters.domain.manager.TrackerManager
import it.giaquinto.marvelcharacters.domain.manager.data.tracker.ScreenDataTrack
import it.giaquinto.marvelcharacters.ui.navigation.Route
import it.giaquinto.marvelcharacters.ui.navigation.ScreenType
import it.giaquinto.marvelcharacters.ui.theme.MarvelCharactersTheme
import it.giaquinto.marvelcharacters.ui.view.screen.*
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
    val navController = rememberNavController()


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
                NavHost(
                    navController = navController,
                    startDestination = Route.LoadingScreen.route
                ) {
                    composable(route = Route.getDefaultRoutes(ScreenType.LOADING)) {
                        LoadingFragment()
                    }

                    composable(route = Route.getDefaultRoutes(ScreenType.LIST)) {
                        //ListFragment()
                    }

                    composable(route = Route.getDefaultRoutes(ScreenType.DETAIL)) {

                    }
                }
            }
        }
    }
}






