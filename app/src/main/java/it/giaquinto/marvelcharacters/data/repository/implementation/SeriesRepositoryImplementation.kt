package it.giaquinto.marvelcharacters.data.repository.implementation

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.db.SerieDao
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
    override fun all(): Flow<ApiResult<List<MarvelSerie>>> {
        TODO("Not yet implemented")
    }

    override fun bySeriesID(seriesID: String): Flow<ApiResult<List<MarvelSerie>>> {
        TODO("Not yet implemented")
    }

    override fun byCharacterID(characterID: String): Flow<ApiResult<List<MarvelSerie>>> {
        TODO("Not yet implemented")
    }

    override fun byComicID(comicID: String): Flow<ApiResult<List<MarvelSerie>>> {
        TODO("Not yet implemented")
    }

    override fun byCreatorID(creatorID: String): Flow<ApiResult<List<MarvelSerie>>> {
        TODO("Not yet implemented")
    }

    override fun byEventID(eventID: String): Flow<ApiResult<List<MarvelSerie>>> {
        TODO("Not yet implemented")
    }

    override fun byStoryID(storyID: String): Flow<ApiResult<List<MarvelSerie>>> {
        TODO("Not yet implemented")
    }
}