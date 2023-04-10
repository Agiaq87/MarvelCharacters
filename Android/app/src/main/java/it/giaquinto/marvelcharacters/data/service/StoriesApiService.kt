package it.giaquinto.marvelcharacters.data.service

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResponse
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.StoryResult
import retrofit2.http.GET
import retrofit2.http.Path

interface StoriesApiService {

    @GET("stories")
    suspend fun stories(): MarvelRemoteResponse<StoryResult>

    @GET("stories/{storyId}")
    suspend fun searchStoriesByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<StoryResult>>

    @GET("stories/{storyId}/characters")
    suspend fun searchCharactersByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<StoryResult>>

    @GET("stories/{storyId}/comics")
    suspend fun searchComicsByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<StoryResult>>

    @GET("stories/{storyId}/creators")
    suspend fun searchCreatorsByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<StoryResult>>

    @GET("stories/{storyId}/events")
    suspend fun searchEventsByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<StoryResult>>

    @GET("stories/{storyId}/series")
    suspend fun searchSeriesByStoryID(
        @Path("storyId") storyId: String
    ): ApiResult<MarvelRemoteResponse<StoryResult>>

}