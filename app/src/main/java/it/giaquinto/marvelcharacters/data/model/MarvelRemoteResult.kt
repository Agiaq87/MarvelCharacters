package it.giaquinto.marvelcharacters.data.model

import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResultType

interface MarvelRemoteResult {
    val typeOf: MarvelRemoteResultType
}