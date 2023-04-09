package it.giaquinto.marvelcharacters.data.repository.implementation

import android.util.Log
import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.db.CreatorDao
import it.giaquinto.marvelcharacters.data.model.result.MarvelCharacter
import it.giaquinto.marvelcharacters.data.model.result.MarvelCreator
import it.giaquinto.marvelcharacters.data.repository.CreatorRepository
import it.giaquinto.marvelcharacters.data.service.CreatorsApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CreatorsRepositoryImplementation @Inject constructor(
    private val creatorsApiService: CreatorsApiService,
    private val creatorDao: CreatorDao
) : CreatorRepository {
    override suspend fun all(): Flow<ApiResult<out List<MarvelCreator>>> = flow {
        emit(ApiResult.Loading())
        val response = creatorsApiService.creators()

        response.forEach {
            Log.e("Flow", it.toString())
        }

        emit(ApiResult.Success(response as List<MarvelCreator>))
    }.catch { e ->
        emit(ApiResult.Error(e.message ?: "ERROR"))
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

    override fun getUniqueName(): String = "CreatorRepository"

}