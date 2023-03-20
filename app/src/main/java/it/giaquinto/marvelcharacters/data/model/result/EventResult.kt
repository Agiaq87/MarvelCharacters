package it.giaquinto.marvelcharacters.data.model.result

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.MarvelLocalResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResultType
import it.giaquinto.marvelcharacters.data.model.result.cross.*

class EventResult(
    id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    resourceURI: String,
    @SerializedName("urls")
    val urls: List<Url>,
    modified: String,
    @SerializedName("start")
    val start: String,
    @SerializedName("end")
    val end: String,
    thumbnail: Thumbnail,
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
), MarvelLocalResult<EventEntity> {
    override val typeOf: MarvelRemoteResultType
        get() = MarvelRemoteResultType.EVENT

    override fun toDao(): EventEntity =
        EventEntity(
            id,
            title,
            description,
            resourceURI,
            modified,
            start,
            end,
            thumbnail
        )
}