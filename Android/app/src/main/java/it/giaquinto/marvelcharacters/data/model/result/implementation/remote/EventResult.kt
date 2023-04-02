package it.giaquinto.marvelcharacters.data.model.result.implementation.remote

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.result.MarvelEvent
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support.*

class EventResult(
    id: Int,
    @SerializedName("title")
    override val title: String,
    @SerializedName("description")
    override val description: String,
    resourceURI: String,
    @SerializedName("urls")
    val urls: List<Url>,
    modified: String,
    @SerializedName("start")
    override val start: String,
    @SerializedName("end")
    override val end: String,
    thumbnail: ThumbnailResult,
    @SerializedName("comics")
    val comics: Comics,
    @SerializedName("stories")
    val stories: Stories,
    @SerializedName("series")
    val series: Series,
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
), MarvelEvent