package it.giaquinto.marvelcharacters.data.model.result.implementation.remote

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.result.MarvelCharacter
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support.*

class CharacterResult(
    id: Int,
    @SerializedName("name")
    override val name: String,
    @SerializedName("description")
    override val description: String,
    modified: String,
    resourceURI: String,
    @SerializedName("urls")
    val urls: List<Url>,
    thumbnail: ThumbnailResult,
    @SerializedName("comics")
    val comics: Comics,
    @SerializedName("stories")
    val stories: Stories,
    @SerializedName("events")
    val events: Events,
    @SerializedName("series")
    val series: Series
) : BaseResult(
    id,
    modified,
    resourceURI,
    thumbnail
), MarvelCharacter
