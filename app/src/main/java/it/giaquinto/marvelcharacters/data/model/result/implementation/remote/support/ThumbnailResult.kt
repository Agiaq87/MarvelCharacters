package it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support


import com.google.gson.annotations.SerializedName

data class ThumbnailResult(
    @SerializedName("extension")
    val extension: String,
    @SerializedName("path")
    val path: String
)