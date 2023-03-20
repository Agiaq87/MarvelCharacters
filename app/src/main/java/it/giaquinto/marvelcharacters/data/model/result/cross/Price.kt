package it.giaquinto.marvelcharacters.data.model.result.cross


import com.google.gson.annotations.SerializedName

data class Price(
    @SerializedName("price")
    val price: String,
    @SerializedName("type")
    val type: String
)