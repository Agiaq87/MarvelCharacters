package it.giaquinto.marvelcharacters.data.service

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResponse
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.EventResult
import retrofit2.http.GET
import retrofit2.http.Path

interface EventsApiService {

    @GET("/v1/public/events")
    suspend fun events(): ApiResult<MarvelRemoteResponse<EventResult>>

    @GET("/v1/public/events/{eventId}")
    suspend fun searchEventByEventID(
        @Path("eventId") eventId: String
    ): ApiResult<MarvelRemoteResponse<EventResult>>

    @GET("/v1/public/characters/{characterId}/events")
    suspend fun searchEventsByCharacterID(
        @Path("characterId") characterId: String
    ): ApiResult<MarvelRemoteResponse<EventResult>>

    @GET("/v1/public/comics/{comicId}/events")
    suspend fun searchEventsByComicID(
        @Path("comicId") comicId: String
    ): ApiResult<MarvelRemoteResponse<EventResult>>

    @GET("/v1/public/creators/{creatorId}/events")
    suspend fun searchEventsByCreatorID(
        @Path("creatorId") creatorId: String
    ): ApiResult<MarvelRemoteResponse<EventResult>>

    @GET("/v1/public/series/{seriesId}/events")
    suspend fun searchEventsBySeriesID(
        @Path("seriesId") seriesId: String
    ): ApiResult<MarvelRemoteResponse<EventResult>>

    @GET("/v1/public/stories/{storyId}/events")
    suspend fun searchEventsByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<EventResult>>
}