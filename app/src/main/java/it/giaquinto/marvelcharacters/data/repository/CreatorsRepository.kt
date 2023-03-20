package it.giaquinto.marvelcharacters.data.repository

import it.giaquinto.marvelcharacters.data.db.CreatorDao
import it.giaquinto.marvelcharacters.data.service.CreatorsApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CreatorsRepository @Inject constructor(
    private val creatorsApiService: CreatorsApiService,
    private val creatorDao: CreatorDao
) {
}