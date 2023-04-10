package it.giaquinto.marvelcharacters.data.model.result

import it.giaquinto.marvelcharacters.data.model.result.implementation.local.*
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.*

fun CharacterResult.asEntity(): CharacterEntity =
    CharacterEntity(
        id, name, description, modified, resourceURI
    )

fun ComicResult.asEntity(): ComicEntity =
    ComicEntity(
        id,
        digitalId,
        title,
        issueNumber,
        variantDescription,
        description,
        modified,
        isbn,
        upc,
        diamondCode,
        ean,
        issn,
        format,
        pageCount
    )

fun CreatorResult.asEntity(): CreatorEntity =
    CreatorEntity(
        id, firstName, middleName, lastName, suffix, fullName, modified, resourceURI
    )

fun EventResult.asEntity(): EventEntity =
    EventEntity(
        id, title, description, resourceURI, modified, start, end
    )

fun SerieResult.asEntity(): SerieEntity =
    SerieEntity(
        id, title, description, resourceURI, startYear, endYear, rating, modified
    )

fun StoryResult.asEntity(): StoryEntity =
    StoryEntity(
        id, title, description, resourceURI, type, modified
    )