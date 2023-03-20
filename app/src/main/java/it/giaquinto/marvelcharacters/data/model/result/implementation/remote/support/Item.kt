package it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support

import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("resourceURI")
    val resourceURI: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("type")
    val type: String?,
    @SerializedName("role")
    val role: String?
)
