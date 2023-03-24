package it.giaquinto.marvelcharacters.ui.navigation

import it.giaquinto.marvelcharacters.data.model.result.MarvelResult
import it.giaquinto.marvelcharacters.ui.model.DetailType
import it.giaquinto.marvelcharacters.ui.model.ListType

sealed class Destination(val route: String) {
    object LoadingScreen : Destination("loading")
    data class ListScreen<T : MarvelResult>(
        val data: List<T>,
        val listType: ListType,
        val requireSearchBar: Boolean
    )

    data class DetailScreen<T : MarvelResult>(val data: T, val detailType: DetailType)
}
