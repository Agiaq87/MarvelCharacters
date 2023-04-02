package it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support


import com.google.gson.annotations.SerializedName

data class Url(
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)