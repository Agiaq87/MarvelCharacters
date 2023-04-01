package it.giaquinto.marvelcharacters.data.service

import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResponse
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.CharacterResult
import retrofit2.http.GET
import retrofit2.http.Path

interface CharactersApiService {
    @GET("characters")
    suspend fun characters(): List<MarvelRemoteResponse<CharacterResult>>

    @GET("characters/{characterId}")
    suspend fun searchCharacterByCharacterID(
        @Path("characterId") characterId: String
    ): MarvelRemoteResponse<CharacterResult>

    @GET("comics/{comicId}/characters")
    suspend fun searchCharactersByComicID(
        @Path("comicId") comicId: String
    ): MarvelRemoteResponse<CharacterResult>

    @GET("events/{eventId}/characters")
    suspend fun searchCharactersByEventID(
        @Path("eventId") eventId: String
    ): MarvelRemoteResponse<CharacterResult>

    @GET("series/{seriesId}/characters")
    suspend fun searchCharactersBySeriesID(
        @Path("seriesId") seriesId: String
    ): MarvelRemoteResponse<CharacterResult>

    @GET("stories/{storyId}/characters")
    suspend fun searchCharactersByStoryID(
        @Path("storyId") storyId: String
    ): MarvelRemoteResponse<CharacterResult>


}