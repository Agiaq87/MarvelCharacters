package it.giaquinto.marvelcharacters.data.repository.implementation

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.db.SerieDao
import it.giaquinto.marvelcharacters.data.model.result.MarvelCharacter
import it.giaquinto.marvelcharacters.data.model.result.MarvelSerie
import it.giaquinto.marvelcharacters.data.repository.SerieRepository
import it.giaquinto.marvelcharacters.data.service.SeriesApiService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SeriesRepositoryImplementation @Inject constructor(
    private val seriesApiService: SeriesApiService,
    private val serieDao: SerieDao
) : SerieRepository {
    override suspend fun all(): Flow<ApiResult<out List<MarvelCharacter>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byCharacterID(characterID: String): Flow<ApiResult<out List<MarvelSerie>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byComicID(comicID: String): Flow<ApiResult<out List<MarvelSerie>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byCreatorID(creatorID: String): Flow<ApiResult<out List<MarvelSerie>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byEventID(eventID: String): Flow<ApiResult<out List<MarvelSerie>>> {
        TODO("Not yet implemented")
    }

    override suspend fun bySeriesID(seriesID: String): Flow<ApiResult<out List<MarvelSerie>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byStoryID(storyID: String): Flow<ApiResult<out List<MarvelSerie>>> {
        TODO("Not yet implemented")
    }

}