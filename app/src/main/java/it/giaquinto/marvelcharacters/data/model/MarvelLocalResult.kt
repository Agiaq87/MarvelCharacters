package it.giaquinto.marvelcharacters.data.model

import it.giaquinto.marvelcharacters.data.model.result.MarvelLocalEntity

interface MarvelLocalResult<D : MarvelLocalEntity> {
    fun toDao(): D
}