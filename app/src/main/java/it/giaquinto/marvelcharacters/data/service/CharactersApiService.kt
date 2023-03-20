package it.giaquinto.marvelcharacters.data.service

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.config.DevelopersMarvelRetrofitConfiguration
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResponse
import it.giaquinto.marvelcharacters.data.model.result.CharacterResult
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharactersApiService {
    @GET("/v1/public/characters")
    suspend fun characters(
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<CharacterResult>>

    @GET("/v1/public/characters/{characterId}")
    suspend fun searchCharacterByCharacterID(
        @Path("characterId") characterId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<CharacterResult>>

    @GET("/v1/public/comics/{comicId}/characters")
    suspend fun searchCharactersByComicID(
        @Path("comicId") comicId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<CharacterResult>>

    @GET("/v1/public/events/{eventId}/characters")
    suspend fun searchCharactersByEventID(
        @Path("eventId") eventId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<CharacterResult>>

    @GET("/v1/public/series/{seriesId}/characters")
    suspend fun searchCharactersBySeriesID(
        @Path("seriesId") seriesId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<CharacterResult>>

    @GET("/v1/public/stories/{storyId}/characters")
    suspend fun searchCharactersByStoryID(
        @Path("storyId") storyId: String,
        @Query("apikey") apikey: String = DevelopersMarvelRetrofitConfiguration.PUBLIC_KEY,
        @Query("ts") timeStamp: String = DevelopersMarvelRetrofitConfiguration.timeStamp.toString(),
        @Query("hash") hash: String = DevelopersMarvelRetrofitConfiguration.apiHash(),
        @Query("offset") offset: String
    ): ApiResult<MarvelRemoteResponse<CharacterResult>>


}