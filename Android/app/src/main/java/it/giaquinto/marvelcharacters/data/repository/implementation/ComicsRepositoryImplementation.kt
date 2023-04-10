package it.giaquinto.marvelcharacters.data.repository.implementation

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.db.ComicDao
import it.giaquinto.marvelcharacters.data.model.result.MarvelComic
import it.giaquinto.marvelcharacters.data.model.result.asEntity
import it.giaquinto.marvelcharacters.data.repository.ComicRepository
import it.giaquinto.marvelcharacters.data.service.ComicsApiService
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ComicsRepositoryImplementation @Inject constructor(
    private val comicsApiService: ComicsApiService,
    private val comicsDao: ComicDao
) : ComicRepository {
    override suspend fun all() = flow {
        emit(ApiResult.Loading())

        comicsApiService.comics().also { marvelRemoteResponse ->
            coroutineScope {
                marvelRemoteResponse.data.results.forEach {
                    comicsDao.insert(it.asEntity())
                }
            }
            emit(
                ApiResult.Success(
                    marvelRemoteResponse.data.results.map { it.asEntity() },
                    marvelRemoteResponse.code,
                    marvelRemoteResponse.etag
                )
            )
        }

    }.catch { e ->
        emit(ApiResult.Error(e.message ?: "ERROR", 0))
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