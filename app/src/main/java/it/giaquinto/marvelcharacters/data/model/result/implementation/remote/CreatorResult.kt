package it.giaquinto.marvelcharacters.data.model.result.implementation.remote

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.result.MarvelCreator
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support.*

class CreatorResult(
    id: Int,
    @SerializedName("firstName")
    override val firstName: String,
    @SerializedName("middleName")
    override val middleName: String,
    @SerializedName("lastName")
    override val lastName: String,
    @SerializedName("suffix")
    override val suffix: String,
    @SerializedName("fullName")
    override val fullName: String,
    modified: String,
    resourceURI: String,
    @SerializedName("urls")
    val urls: List<Url>,
    thumbnail: ThumbnailResult,
    @SerializedName("series")
    val series: Series,
    @SerializedName("stories")
    val stories: Stories,
    @SerializedName("comics")
    val comics: Comics,
    @SerializedName("events")
    val events: Events
) : BaseResult(
    id,
    modified,
    resourceURI,
    thumbnail
), MarvelCreator