package it.giaquinto.marvelcharacters.data.model.remote

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.MarvelRemoteResult

data class Data<T : MarvelRemoteResult>(
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("total")
    val total: Int,
    @SerializedName("count")
    val count: Int,
    @SerializedName("results")
    val results: List<T>
) {

}