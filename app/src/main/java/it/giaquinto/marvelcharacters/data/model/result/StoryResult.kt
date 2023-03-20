package it.giaquinto.marvelcharacters.data.model.result

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.MarvelLocalResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResultType
import it.giaquinto.marvelcharacters.data.model.result.cross.*

class StoryResult(
    id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    resourceURI: String,
    @SerializedName("type")
    val type: String,
    modified: String,
    thumbnail: Thumbnail,
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
), MarvelLocalResult<StoryEntity> {
    override val typeOf: MarvelRemoteResultType
        get() = MarvelRemoteResultType.STORY

    override fun toDao(): StoryEntity =
        StoryEntity(
            id,
            title,
            description,
            resourceURI,
            type,
            modified,
            thumbnail
        )

}