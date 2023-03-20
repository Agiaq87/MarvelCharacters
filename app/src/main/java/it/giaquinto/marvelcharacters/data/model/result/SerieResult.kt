package it.giaquinto.marvelcharacters.data.model.result

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.MarvelLocalResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResultType
import it.giaquinto.marvelcharacters.data.model.result.cross.*

class SerieResult(
    id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    resourceURI: String,
    @SerializedName("urls")
    val urls: List<Url>,
    @SerializedName("startYear")
    val startYear: Int,
    @SerializedName("endYear")
    val endYear: Int,
    @SerializedName("rating")
    val rating: String,
    modified: String,
    thumbnail: Thumbnail,
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
), MarvelLocalResult<SerieEntity> {
    override val typeOf: MarvelRemoteResultType
        get() = MarvelRemoteResultType.SERIE

    override fun toDao(): SerieEntity =
        SerieEntity(
            id,
            title,
            description,
            resourceURI,
            startYear,
            endYear,
            rating,
            modified,
            thumbnail
        )
}