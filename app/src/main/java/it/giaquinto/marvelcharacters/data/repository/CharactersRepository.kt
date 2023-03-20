package it.giaquinto.marvelcharacters.data.repository

import it.giaquinto.marvelcharacters.data.db.CharacterDao
import it.giaquinto.marvelcharacters.data.service.CharactersApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CharactersRepository @Inject constructor(
    private val charactersApiService: CharactersApiService,
    private val characterDao: CharacterDao
) {
}