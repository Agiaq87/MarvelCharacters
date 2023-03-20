package it.giaquinto.marvelcharacters.data.model.result

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.MarvelLocalResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResultType
import it.giaquinto.marvelcharacters.data.model.result.cross.*

class CreatorResult(
    id: Int,
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("middleName")
    val middleName: String,
    @SerializedName("lastName")
    val lastName: String,
    @SerializedName("suffix")
    val suffix: String,
    @SerializedName("fullName")
    val fullName: String,
    modified: String,
    resourceURI: String,
    @SerializedName("urls")
    val urls: List<Url>,
    thumbnail: Thumbnail,
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
), MarvelLocalResult<CreatorEntity> {
    override val typeOf: MarvelRemoteResultType
        get() = MarvelRemoteResultType.CREATOR

    override fun toDao(): CreatorEntity =
        CreatorEntity(
            id,
            firstName,
            middleName,
            lastName,
            suffix,
            fullName,
            modified,
            resourceURI
        )
}