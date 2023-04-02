package it.giaquinto.marvelcharacters.data.model.result

interface MarvelThumbnail {
    val extension: String
    val path: String

    fun toResourceUri(): String
}