package it.giaquinto.marvelcharacters.data.service

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResponse
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.CreatorResult
import retrofit2.http.GET
import retrofit2.http.Path

interface CreatorsApiService {

    @GET("creators")
    suspend fun searchCreators(): ApiResult<MarvelRemoteResponse<CreatorResult>>

    @GET("creators/{creatorId}")
    suspend fun searchCreatorsByCreatorID(
        @Path("creatorId") creatorId: String
    ): ApiResult<MarvelRemoteResponse<CreatorResult>>

    @GET("comics/{comicId}/creators")
    suspend fun searchCreatorsByComicID(
        @Path("comicId") comicId: String
    ): ApiResult<MarvelRemoteResponse<CreatorResult>>

    @GET("events/{eventId}/creators")
    suspend fun searchCreatorsByEventID(
        @Path("eventId") eventId: String
    ): ApiResult<MarvelRemoteResponse<CreatorResult>>

    @GET("series/{seriesId}/creators")
    suspend fun searchCreatorsBySeriesID(
        @Path("seriesId") seriesId: String
    ): ApiResult<MarvelRemoteResponse<CreatorResult>>

    @GET("stories/{storyId}/creators")
    suspend fun searchCreatorsByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<CreatorResult>>
}