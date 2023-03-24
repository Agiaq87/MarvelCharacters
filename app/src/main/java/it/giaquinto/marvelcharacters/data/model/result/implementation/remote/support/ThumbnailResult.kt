package it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support


import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.result.MarvelThumbnail

data class ThumbnailResult(
    @SerializedName("extension")
    override val extension: String,
    @SerializedName("path")
    override val path: String
) : MarvelThumbnail {
    override fun toResourceUri(): String =
        path
}