package it.giaquinto.marvelcharacters.data.service

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.config.DevelopersMarvelRetrofitConfiguration
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResponse
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.ComicResult
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ComicsApiService {

    @GET("/v1/public/comics")
    suspend fun searchComics(
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<ComicResult>>

    @GET("/v1/public/comics/{comicId}")
    suspend fun searchComicsByComicID(
        @Path("comicId") comicId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<ComicResult>>

    @GET("/v1/public/characters/{characterId}/comics")
    suspend fun searchComicsByCharacterID(
        @Path("characterId") characterId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<ComicResult>>

    @GET("/v1/public/creators/{creatorId}/comics")
    suspend fun searchComicsByCreatorID(
        @Path("creatorId") creatorId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<ComicResult>>

    @GET("/v1/public/events/{eventId}/comics")
    suspend fun searchComicsByEventID(
        @Path("eventId") eventId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<ComicResult>>

    @GET("/v1/public/series/{seriesId}/comics")
    suspend fun searchComicsBySeriesID(
        @Path("seriesId") seriesId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<ComicResult>>

    @GET("/v1/public/stories/{storyId}/comics")
    suspend fun searchComicsByStoryID(
        @Path("storyId") storyId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<ComicResult>>
}