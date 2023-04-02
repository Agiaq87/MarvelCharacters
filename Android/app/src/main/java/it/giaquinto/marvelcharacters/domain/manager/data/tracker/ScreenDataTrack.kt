package it.giaquinto.marvelcharacters.domain.manager.data.tracker

import it.giaquinto.marvelcharacters.data.model.result.*

data class ScreenDataTrack(
    val name: String,
    val content: String
) {
    companion object {
        fun forActivity(): ScreenDataTrack =
            ScreenDataTrack(
                "Base Activity",
                "BaseActivity"
            )

        fun forLoadingFragment(): ScreenDataTrack =
            ScreenDataTrack(
                "Loading Fragment",
                "LoadingFragment"
            )

        fun <T : MarvelResult> forListFragment(dataClass: T?) =
            ScreenDataTrack(
                "List Fragment",
                content = when (dataClass) {
                    is MarvelCharacter -> "CharacterListFragment"
                    is MarvelComic -> "ComicListFragment"
                    is MarvelCreator -> "CreatorListFragment"
                    is MarvelEvent -> "EventListFragment"
                    is MarvelStory -> "StoryListFragment"
                    is MarvelSerie -> "SerieListFragment"
                    else -> "ListFragment"
                }
            )

        fun <T : MarvelResult> forDetailFragment(dataClass: T?) =
            ScreenDataTrack(
                "Detail Fragment",
                content = when (dataClass) {
                    is MarvelCharacter -> "CharacterDetailFragment"
                    is MarvelComic -> "ComicDetailFragment"
                    is MarvelCreator -> "CreatorDetailFragment"
                    is MarvelEvent -> "EventDetailFragment"
                    is MarvelStory -> "StoryDetailFragment"
                    is MarvelSerie -> "SerieDetailFragment"
                    else -> "DetailFragment"
                }
            )
    }
}
