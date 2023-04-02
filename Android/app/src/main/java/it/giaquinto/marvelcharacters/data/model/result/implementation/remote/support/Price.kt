package it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support


import com.google.gson.annotations.SerializedName

data class Price(
    @SerializedName("price")
    val price: String,
    @SerializedName("type")
    val type: String
)