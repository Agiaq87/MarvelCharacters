package it.giaquinto.marvelcharacters.data.model.remote

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.result.MarvelResult

data class MarvelRemoteResponse<T : MarvelResult>(
    @SerializedName("code")
    val code: Int,
    @SerializedName("status")
    val status: String,
    @SerializedName("copyright")
    val copyright: String,
    @SerializedName("attributionText")
    val attributionText: String,
    @SerializedName("attributionHTML")
    val attributionHTML: String,
    @SerializedName("data")
    val `data`: Data<T>,
    @SerializedName("etag")
    val etag: String,
)
