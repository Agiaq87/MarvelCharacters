package it.giaquinto.marvelcharacters.data.service

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResponse
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.SerieResult
import retrofit2.http.GET
import retrofit2.http.Path

interface SeriesApiService {

    @GET("series")
    suspend fun series(): List<MarvelRemoteResponse<SerieResult>>

    @GET("series/{seriesId}")
    suspend fun searchSeriesBySeriesID(
        @Path("seriesId") seriesId: String
    ): ApiResult<MarvelRemoteResponse<SerieResult>>

    @GET("characters/{characterId}/series")
    suspend fun searchSeriesByCharacterID(
        @Path("characterId") characterId: String
    ): ApiResult<MarvelRemoteResponse<SerieResult>>

    @GET("creators/{creatorId}/series")
    suspend fun searchSeriesByCreatorID(
        @Path("creatorId") creatorId: String
    ): ApiResult<MarvelRemoteResponse<SerieResult>>

    @GET("events/{eventId}/series")
    suspend fun searchSeriesByEventID(
        @Path("eventId") eventId: String
    ): ApiResult<MarvelRemoteResponse<SerieResult>>

    @GET("stories/{storyId}/series")
    suspend fun searchSeriesByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<SerieResult>>
}