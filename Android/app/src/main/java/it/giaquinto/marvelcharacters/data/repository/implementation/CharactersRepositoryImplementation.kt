package it.giaquinto.marvelcharacters.data.repository.implementation

import android.util.Log
import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.db.CharacterDao
import it.giaquinto.marvelcharacters.data.model.result.MarvelCharacter
import it.giaquinto.marvelcharacters.data.repository.CharacterRepository
import it.giaquinto.marvelcharacters.data.service.CharactersApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CharactersRepositoryImplementation @Inject constructor(
    private val charactersApiService: CharactersApiService,
    private val characterDao: CharacterDao
) : CharacterRepository {

    override suspend fun all() = flow {
        emit(ApiResult.Loading())
        val response = charactersApiService.characters()

        response.forEach {
            Log.e("Flow", it.toString())
        }

        emit(ApiResult.Success<List<MarvelCharacter>>(response as List<MarvelCharacter>))
    }.catch { e ->
        emit(ApiResult.Error(e.message ?: "ERROR"))
    }


    override suspend fun byCharacterID(characterID: String): Flow<ApiResult<List<MarvelCharacter>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byComicID(comicID: String): Flow<ApiResult<List<MarvelCharacter>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byCreatorID(creatorID: String): Flow<ApiResult<List<MarvelCharacter>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byEventID(eventID: String): Flow<ApiResult<List<MarvelCharacter>>> {
        TODO("Not yet implemented")
    }

    override suspend fun bySeriesID(seriesID: String): Flow<ApiResult<List<MarvelCharacter>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byStoryID(storyID: String): Flow<ApiResult<List<MarvelCharacter>>> {
        TODO("Not yet implemented")
    }

    override fun getUniqueName(): String = "CharacterRepository"
}