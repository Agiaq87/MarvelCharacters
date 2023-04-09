package it.giaquinto.marvelcharacters.data.repository.implementation

import android.util.Log
import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.db.ComicDao
import it.giaquinto.marvelcharacters.data.model.result.MarvelComic
import it.giaquinto.marvelcharacters.data.repository.ComicRepository
import it.giaquinto.marvelcharacters.data.service.ComicsApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ComicsRepositoryImplementation @Inject constructor(
    private val comicsApiService: ComicsApiService,
    private val characterDao: ComicDao
) : ComicRepository {
    override suspend fun all(): Flow<ApiResult<out List<MarvelComic>>> = flow {
        emit(ApiResult.Loading())
        val response = comicsApiService.comics()

        response.forEach {
            Log.e("Flow", it.toString())
        }

        emit(ApiResult.Success(response as List<MarvelComic>))
    }.catch { e ->
        emit(ApiResult.Error(e.message ?: "ERROR"))
    }

    override suspend fun byCharacterID(characterID: String): Flow<ApiResult<out List<MarvelComic>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byComicID(comicID: String): Flow<ApiResult<out List<MarvelComic>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byCreatorID(creatorID: String): Flow<ApiResult<out List<MarvelComic>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byEventID(eventID: String): Flow<ApiResult<out List<MarvelComic>>> {
        TODO("Not yet implemented")
    }

    override suspend fun bySeriesID(seriesID: String): Flow<ApiResult<out List<MarvelComic>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byStoryID(storyID: String): Flow<ApiResult<out List<MarvelComic>>> {
        TODO("Not yet implemented")
    }

    override fun getUniqueName(): String = "ComicRepository"
}