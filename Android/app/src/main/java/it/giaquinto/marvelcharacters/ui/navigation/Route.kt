package it.giaquinto.marvelcharacters.ui.navigation

import it.giaquinto.marvelcharacters.data.model.result.MarvelResult
import it.giaquinto.marvelcharacters.ui.model.DetailType
import it.giaquinto.marvelcharacters.ui.model.ListType

sealed class Route(val route: String) {
    object LoadingScreen : Route(getDefaultRoutes(ScreenType.LOADING))

    data class ListScreen<T : MarvelResult>(
        val clazz: T,
        val data: List<T>,
        val listType: ListType,
        val requireSearchBar: Boolean
    ) : Route(getDefaultRoutes(ScreenType.LIST))

    data class DetailScreen<T : MarvelResult>(
        val data: T,
        val detailType: DetailType
    ) : Route(getDefaultRoutes(ScreenType.DETAIL))

    companion object {
        fun getDefaultRoutes(screenType: ScreenType): String = when (screenType) {
            ScreenType.LOADING -> "Loading"
            ScreenType.LIST -> "List"
            ScreenType.DETAIL -> "Detail"
        }
    }
}
