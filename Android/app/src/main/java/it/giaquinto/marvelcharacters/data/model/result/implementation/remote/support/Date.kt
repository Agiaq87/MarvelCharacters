package it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support


import com.google.gson.annotations.SerializedName

data class Date(
    @SerializedName("date")
    val date: String,
    @SerializedName("type")
    val type: String
)