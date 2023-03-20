package it.giaquinto.marvelcharacters.data.service

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResponse
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.ComicResult
import retrofit2.http.GET
import retrofit2.http.Path

interface ComicsApiService {

    @GET("/v1/public/comics")
    suspend fun searchComics(): ApiResult<MarvelRemoteResponse<ComicResult>>

    @GET("/v1/public/comics/{comicId}")
    suspend fun searchComicsByComicID(
        @Path("comicId") comicId: String
    ): ApiResult<MarvelRemoteResponse<ComicResult>>

    @GET("/v1/public/characters/{characterId}/comics")
    suspend fun searchComicsByCharacterID(
        @Path("characterId") characterId: String
    ): ApiResult<MarvelRemoteResponse<ComicResult>>

    @GET("/v1/public/creators/{creatorId}/comics")
    suspend fun searchComicsByCreatorID(
        @Path("creatorId") creatorId: String
    ): ApiResult<MarvelRemoteResponse<ComicResult>>

    @GET("/v1/public/events/{eventId}/comics")
    suspend fun searchComicsByEventID(
        @Path("eventId") eventId: String
    ): ApiResult<MarvelRemoteResponse<ComicResult>>

    @GET("/v1/public/series/{seriesId}/comics")
    suspend fun searchComicsBySeriesID(
        @Path("seriesId") seriesId: String
    ): ApiResult<MarvelRemoteResponse<ComicResult>>

    @GET("/v1/public/stories/{storyId}/comics")
    suspend fun searchComicsByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<ComicResult>>
}