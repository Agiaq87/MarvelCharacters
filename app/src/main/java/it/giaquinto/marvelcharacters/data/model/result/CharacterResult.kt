package it.giaquinto.marvelcharacters.data.model.result

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.MarvelLocalResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResultType
import it.giaquinto.marvelcharacters.data.model.result.cross.*

class CharacterResult(
    id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    modified: String,
    resourceURI: String,
    @SerializedName("urls")
    val urls: List<Url>,
    thumbnail: Thumbnail,
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
), MarvelLocalResult<CharacterEntity> {
    override val typeOf: MarvelRemoteResultType
        get() = MarvelRemoteResultType.CHARACTER

    override fun toDao(): CharacterEntity =
        CharacterEntity(
            id,
            name,
            description,
            modified,
            resourceURI
        )
}

