package it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support

import com.google.gson.annotations.SerializedName

data class Events(
    @SerializedName("available")
    val available: String,
    @SerializedName("collectionURI")
    val collectionURI: String,
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("returned")
    val returned: String
)
