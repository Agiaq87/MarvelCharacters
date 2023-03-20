package it.giaquinto.marvelcharacters.data.service

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResponse
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.CreatorResult
import retrofit2.http.GET
import retrofit2.http.Path

interface CreatorsApiService {

    @GET("/v1/public/creators")
    suspend fun searchCreators(): ApiResult<MarvelRemoteResponse<CreatorResult>>

    @GET("/v1/public/creators/{creatorId}")
    suspend fun searchCreatorsByCreatorID(
        @Path("creatorId") creatorId: String
    ): ApiResult<MarvelRemoteResponse<CreatorResult>>

    @GET("/v1/public/comics/{comicId}/creators")
    suspend fun searchCreatorsByComicID(
        @Path("comicId") comicId: String
    ): ApiResult<MarvelRemoteResponse<CreatorResult>>

    @GET("/v1/public/events/{eventId}/creators")
    suspend fun searchCreatorsByEventID(
        @Path("eventId") eventId: String
    ): ApiResult<MarvelRemoteResponse<CreatorResult>>

    @GET("/v1/public/series/{seriesId}/creators")
    suspend fun searchCreatorsBySeriesID(
        @Path("seriesId") seriesId: String
    ): ApiResult<MarvelRemoteResponse<CreatorResult>>

    @GET("/v1/public/stories/{storyId}/creators")
    suspend fun searchCreatorsByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<CreatorResult>>
}