package it.giaquinto.marvelcharacters.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import it.giaquinto.marvelcharacters.ui.view.screen.LoadingFragment

@Composable
fun NavigationScreens() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Route.LoadingScreen.route
    ) {
        composable(route = Route.getDefaultRoutes(ScreenType.LOADING)) {
            LoadingFragment()
        }

        /*composable(route = Route.getDefaultRoutes(ScreenType.LIST)) {
            ListScreen(clazz = , data = , listType = , requireSearchBar = ) // TODO LISTFRAGMENT()
        }*/

        /*composable(route = Route.getDefaultRoutes(ScreenType.DETAIL)) {
            DetailScreen() // TODO DETAILFRAGMENT()
        }*/
    }
}