package it.giaquinto.marvelcharacters.data.model.result.implementation.remote

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.result.MarvelStory
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support.*

class StoryResult(
    id: Int,
    @SerializedName("title")
    override val title: String,
    @SerializedName("description")
    override val description: String,
    resourceURI: String,
    @SerializedName("type")
    override val type: String,
    modified: String,
    thumbnail: ThumbnailResult,
    @SerializedName("comics")
    val comics: Comics,
    @SerializedName("series")
    val series: Series,
    @SerializedName("events")
    val events: Events,
    @SerializedName("characters")
    val characters: Characters,
    @SerializedName("creators")
    val creators: Creators,
    @SerializedName("originalissue")
    val originalIssue: Item
) : BaseResult(
    id,
    modified,
    resourceURI,
    thumbnail
), MarvelStory