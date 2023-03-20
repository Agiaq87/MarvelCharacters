package it.giaquinto.marvelcharacters.data.model.result.cross


import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.MarvelLocalResult

data class Thumbnail(
    @SerializedName("extension")
    val extension: String,
    @SerializedName("path")
    val path: String
) : MarvelLocalResult<ThumbnailEntity> {
    override fun toDao(): ThumbnailEntity =
        ThumbnailEntity(
            extension = extension, path = path
        )
}