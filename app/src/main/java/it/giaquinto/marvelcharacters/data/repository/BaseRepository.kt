package it.giaquinto.marvelcharacters.data.repository

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.model.exception.UnsupportedRequestException
import it.giaquinto.marvelcharacters.data.model.result.MarvelCharacter
import it.giaquinto.marvelcharacters.data.model.result.MarvelResult
import kotlinx.coroutines.flow.Flow

interface BaseRepository<DATA : MarvelResult> {
    suspend fun all(): Flow<ApiResult<List<MarvelCharacter>>>

    @Throws(UnsupportedRequestException::class)
    suspend fun byCharacterID(characterID: String): Flow<ApiResult<out List<DATA>>>

    @Throws(UnsupportedRequestException::class)
    suspend fun byComicID(comicID: String): Flow<ApiResult<out List<DATA>>>

    @Throws(UnsupportedRequestException::class)
    suspend fun byCreatorID(creatorID: String): Flow<ApiResult<out List<DATA>>>

    @Throws(UnsupportedRequestException::class)
    suspend fun byEventID(eventID: String): Flow<ApiResult<out List<DATA>>>

    @Throws(UnsupportedRequestException::class)
    suspend fun bySeriesID(seriesID: String): Flow<ApiResult<out List<DATA>>>

    @Throws(UnsupportedRequestException::class)
    suspend fun byStoryID(storyID: String): Flow<ApiResult<out List<DATA>>>
}