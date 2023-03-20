package it.giaquinto.marvelcharacters.data.model.result.cross

import com.google.gson.annotations.SerializedName

data class Series(
    @SerializedName("available")
    val available: String,
    @SerializedName("collectionURI")
    val collectionURI: String,
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("returned")
    val returned: String
)
