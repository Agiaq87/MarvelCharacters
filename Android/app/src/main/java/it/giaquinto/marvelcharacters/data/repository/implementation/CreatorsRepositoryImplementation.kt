package it.giaquinto.marvelcharacters.data.repository.implementation

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.db.CreatorDao
import it.giaquinto.marvelcharacters.data.model.result.MarvelCharacter
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
    override suspend fun all(): Flow<ApiResult<out List<MarvelCharacter>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byCharacterID(characterID: String): Flow<ApiResult<out List<MarvelCreator>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byComicID(comicID: String): Flow<ApiResult<out List<MarvelCreator>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byCreatorID(creatorID: String): Flow<ApiResult<out List<MarvelCreator>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byEventID(eventID: String): Flow<ApiResult<out List<MarvelCreator>>> {
        TODO("Not yet implemented")
    }

    override suspend fun bySeriesID(seriesID: String): Flow<ApiResult<out List<MarvelCreator>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byStoryID(storyID: String): Flow<ApiResult<out List<MarvelCreator>>> {
        TODO("Not yet implemented")
    }

}