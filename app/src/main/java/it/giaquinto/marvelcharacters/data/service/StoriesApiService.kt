package it.giaquinto.marvelcharacters.data.service

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResponse
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.StoryResult
import retrofit2.http.GET
import retrofit2.http.Path

interface StoriesApiService {

    @GET("/v1/public/stories")
    suspend fun stories(): ApiResult<MarvelRemoteResponse<StoryResult>>

    @GET("/v1/public/stories/{storyId}")
    suspend fun searchStoriesByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<StoryResult>>

    @GET("/v1/public/stories/{storyId}/characters")
    suspend fun searchCharactersByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<StoryResult>>

    @GET("/v1/public/stories/{storyId}/comics")
    suspend fun searchComicsByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<StoryResult>>

    @GET("/v1/public/stories/{storyId}/creators")
    suspend fun searchCreatorsByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<StoryResult>>

    @GET("/v1/public/stories/{storyId}/events")
    suspend fun searchEventsByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<StoryResult>>

    @GET("/v1/public/stories/{storyId}/series")
    suspend fun searchSeriesByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<StoryResult>>

}