package it.giaquinto.marvelcharacters.data.service

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.config.DevelopersMarvelRetrofitConfiguration
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResponse
import it.giaquinto.marvelcharacters.data.model.result.SerieResult
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SeriesApiService {

    @GET("/v1/public/series")
    suspend fun series(
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<SerieResult>>

    @GET("/v1/public/series/{seriesId}")
    suspend fun searchSeriesBySeriesID(
        @Path("seriesId") seriesId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<SerieResult>>

    @GET("/v1/public/characters/{characterId}/series")
    suspend fun searchSeriesByCharacterID(
        @Path("characterId") characterId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<SerieResult>>

    @GET("/v1/public/creators/{creatorId}/series")
    suspend fun searchSeriesByCreatorID(
        @Path("creatorId") creatorId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<SerieResult>>

    @GET("/v1/public/events/{eventId}/series")
    suspend fun searchSeriesByEventID(
        @Path("eventId") eventId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<SerieResult>>

    @GET("/v1/public/stories/{storyId}/series")
    suspend fun searchSeriesByStoryID(
        @Path("storyId") storyId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<SerieResult>>
}