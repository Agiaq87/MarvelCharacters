package it.giaquinto.marvelcharacters.data.service

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResponse
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.CharacterResult
import retrofit2.http.GET
import retrofit2.http.Path

interface CharactersApiService {
    @GET("/v1/public/characters")
    suspend fun characters(): ApiResult<MarvelRemoteResponse<CharacterResult>>

    @GET("/v1/public/characters/{characterId}")
    suspend fun searchCharacterByCharacterID(
        @Path("characterId") characterId: String
    ): ApiResult<MarvelRemoteResponse<CharacterResult>>

    @GET("/v1/public/comics/{comicId}/characters")
    suspend fun searchCharactersByComicID(
        @Path("comicId") comicId: String
    ): ApiResult<MarvelRemoteResponse<CharacterResult>>

    @GET("/v1/public/events/{eventId}/characters")
    suspend fun searchCharactersByEventID(
        @Path("eventId") eventId: String
    ): ApiResult<MarvelRemoteResponse<CharacterResult>>

    @GET("/v1/public/series/{seriesId}/characters")
    suspend fun searchCharactersBySeriesID(
        @Path("seriesId") seriesId: String
    ): ApiResult<MarvelRemoteResponse<CharacterResult>>

    @GET("/v1/public/stories/{storyId}/characters")
    suspend fun searchCharactersByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<CharacterResult>>


}