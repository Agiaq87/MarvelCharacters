package it.giaquinto.marvelcharacters.data.repository.implementation

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.db.CreatorDao
import it.giaquinto.marvelcharacters.data.model.result.MarvelCreator
import it.giaquinto.marvelcharacters.data.repository.CreatorRepository
import it.giaquinto.marvelcharacters.data.service.CreatorsApiService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CreatorsRepositoryImplementation @Inject constructor(
    private val creatorsApiService: CreatorsApiService,
    private val creatorDao: CreatorDao
) : CreatorRepository {
    override fun all(): Flow<ApiResult<List<MarvelCreator>>> {
        TODO("Not yet implemented")
    }

    override fun byCharacterID(characterID: String): Flow<ApiResult<List<MarvelCreator>>> {
        TODO("Not yet implemented")
    }

    override fun byCreatorID(creatorID: String): Flow<ApiResult<List<MarvelCreator>>> {
        TODO("Not yet implemented")
    }

    override fun byComicID(comicID: String): Flow<ApiResult<List<MarvelCreator>>> {
        TODO("Not yet implemented")
    }

    override fun byEventID(eventID: String): Flow<ApiResult<List<MarvelCreator>>> {
        TODO("Not yet implemented")
    }

    override fun bySeriesID(seriesID: String): Flow<ApiResult<List<MarvelCreator>>> {
        TODO("Not yet implemented")
    }

    override fun byStoryID(storyID: String): Flow<ApiResult<List<MarvelCreator>>> {
        TODO("Not yet implemented")
    }
}