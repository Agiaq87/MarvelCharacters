package it.giaquinto.marvelcharacters.data.repository.implementation

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.db.ComicDao
import it.giaquinto.marvelcharacters.data.model.result.MarvelComic
import it.giaquinto.marvelcharacters.data.repository.ComicRepository
import it.giaquinto.marvelcharacters.data.service.ComicsApiService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ComicsRepositoryImplementation @Inject constructor(
    private val comicsApiService: ComicsApiService,
    private val characterDao: ComicDao
) : ComicRepository {
    override fun all(): Flow<ApiResult<List<MarvelComic>>> {
        TODO("Not yet implemented")
    }

    override fun byComicID(comicID: String): Flow<ApiResult<List<MarvelComic>>> {
        TODO("Not yet implemented")
    }

    override fun byCharacterID(characterID: String): Flow<ApiResult<List<MarvelComic>>> {
        TODO("Not yet implemented")
    }

    override fun byCreatorID(creatorID: String): Flow<ApiResult<List<MarvelComic>>> {
        TODO("Not yet implemented")
    }

    override fun byEventID(eventID: String): Flow<ApiResult<List<MarvelComic>>> {
        TODO("Not yet implemented")
    }

    override fun bySeriesID(seriesID: String): Flow<ApiResult<List<MarvelComic>>> {
        TODO("Not yet implemented")
    }

    override fun byStoryID(storyID: String): Flow<ApiResult<List<MarvelComic>>> {
        TODO("Not yet implemented")
    }
}