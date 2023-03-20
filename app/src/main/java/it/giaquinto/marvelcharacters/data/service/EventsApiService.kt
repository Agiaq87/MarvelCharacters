package it.giaquinto.marvelcharacters.data.service

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.config.DevelopersMarvelRetrofitConfiguration
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResponse
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.EventResult
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface EventsApiService {

    @GET("/v1/public/events")
    suspend fun events(
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<EventResult>>

    @GET("/v1/public/events/{eventId}")
    suspend fun searchEventByEventID(
        @Path("eventId") eventId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<EventResult>>

    @GET("/v1/public/characters/{characterId}/events")
    suspend fun searchEventsByCharacterID(
        @Path("characterId") characterId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<EventResult>>

    @GET("/v1/public/comics/{comicId}/events")
    suspend fun searchEventsByComicID(
        @Path("comicId") comicId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<EventResult>>

    @GET("/v1/public/creators/{creatorId}/events")
    suspend fun searchEventsByCreatorID(
        @Path("creatorId") creatorId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<EventResult>>

    @GET("/v1/public/series/{seriesId}/events")
    suspend fun searchEventsBySeriesID(
        @Path("seriesId") seriesId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<EventResult>>

    @GET("/v1/public/stories/{storyId}/events")
    suspend fun searchEventsByStoryID(
        @Path("storyId") storyId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<EventResult>>
}