package it.giaquinto.marvelcharacters.data.model.result.cross


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("extension")
    val extension: String,
    @SerializedName("path")
    val path: String
)