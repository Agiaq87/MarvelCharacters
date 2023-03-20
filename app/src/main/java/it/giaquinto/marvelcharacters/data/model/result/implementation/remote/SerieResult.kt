package it.giaquinto.marvelcharacters.data.model.result.implementation.remote

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.result.MarvelSerie
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support.*

class SerieResult(
    id: Int,
    @SerializedName("title")
    override val title: String,
    @SerializedName("description")
    override val description: String,
    resourceURI: String,
    @SerializedName("urls")
    val urls: List<Url>,
    @SerializedName("startYear")
    override val startYear: Int,
    @SerializedName("endYear")
    override val endYear: Int,
    @SerializedName("rating")
    override val rating: String,
    modified: String,
    thumbnail: ThumbnailResult,
    @SerializedName("comics")
    val comics: Comics,
    @SerializedName("stories")
    val stories: Stories,
    @SerializedName("events")
    val events: Events,
    @SerializedName("characters")
    val characters: Characters,
    @SerializedName("creators")
    val creators: Creators,
    @SerializedName("next")
    val next: Item,
    @SerializedName("previous")
    val previous: Item
) : BaseResult(
    id,
    modified,
    resourceURI,
    thumbnail
), MarvelSerie