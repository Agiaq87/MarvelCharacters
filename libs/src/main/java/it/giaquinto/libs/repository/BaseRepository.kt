package it.giaquinto.marvelcharacters.data.repository

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.model.exception.UnsupportedRequestException
import it.giaquinto.marvelcharacters.data.model.result.MarvelResult
import kotlinx.coroutines.flow.Flow

interface BaseRepository<DATA : MarvelResult> {
    fun all(): Flow<ApiResult<List<DATA>>>

    @Throws(UnsupportedRequestException::class)
    fun byCharacterID(characterID: String): Flow<ApiResult<List<DATA>>>

    @Throws(UnsupportedRequestException::class)
    fun byComicID(comicID: String): Flow<ApiResult<List<DATA>>>

    @Throws(UnsupportedRequestException::class)
    fun byCreatorID(creatorID: String): Flow<ApiResult<List<DATA>>>

    @Throws(UnsupportedRequestException::class)
    fun byEventID(eventID: String): Flow<ApiResult<List<DATA>>>

    @Throws(UnsupportedRequestException::class)
    fun bySeriesID(seriesID: String): Flow<ApiResult<List<DATA>>>

    @Throws(UnsupportedRequestException::class)
    fun byStoryID(storyID: String): Flow<ApiResult<List<DATA>>>
}