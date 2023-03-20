package it.giaquinto.marvelcharacters.data.model.result

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.MarvelRemoteResult
import it.giaquinto.marvelcharacters.data.model.result.cross.Thumbnail


abstract class BaseResult(
    @SerializedName("id")
    open val id: Int,
    @SerializedName("modified")
    open val modified: String,
    @SerializedName("resourceURI")
    open val resourceURI: String,
    @SerializedName("thumbnail")
    open val thumbnail: Thumbnail
) : MarvelRemoteResult