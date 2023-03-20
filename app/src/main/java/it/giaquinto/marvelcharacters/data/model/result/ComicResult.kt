package it.giaquinto.marvelcharacters.data.model.result

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.MarvelLocalResult
import it.giaquinto.marvelcharacters.data.model.remote.MarvelRemoteResultType
import it.giaquinto.marvelcharacters.data.model.result.cross.*

class ComicResult(
    id: Int,
    @SerializedName("digitalId")
    val digitalId: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("issueNumber")
    val issueNumber: Double,
    @SerializedName("variantDescription")
    val variantDescription: String,
    @SerializedName("description")
    val description: String,
    modified: String,
    @SerializedName("isbn")
    val isbn: String,
    @SerializedName("upc")
    val upc: String,
    @SerializedName("diamondCode")
    val diamondCode: String,
    @SerializedName("ean")
    val ean: String,
    @SerializedName("issn")
    val issn: String,
    @SerializedName("format")
    val format: String,
    @SerializedName("pageCount")
    val pageCount: Int,
    @SerializedName("textObjects")
    val textObjects: List<TextObject>,
    resourceURI: String,
    @SerializedName("urls")
    val urls: List<Url>,
    @SerializedName("series")
    val series: Series,
    @SerializedName("variants")
    val variants: List<Item>,
    @SerializedName("collections")
    val collections: List<Item>,
    @SerializedName("collectedIssues")
    val collectedIssues: List<Item>,
    @SerializedName("dates")
    val dates: List<Date>,
    @SerializedName("prices")
    val prices: List<Price>,
    thumbnail: Thumbnail,
    @SerializedName("images")
    val images: List<Image>,
    @SerializedName("creators")
    val creators: Creators,
    @SerializedName("characters")
    val characters: Characters,
    @SerializedName("stories")
    val stories: Stories,
    @SerializedName("events")
    val events: Events
) : BaseResult(
    id,
    modified,
    resourceURI,
    thumbnail
), MarvelLocalResult<ComicEntity> {
    override val typeOf: MarvelRemoteResultType
        get() = MarvelRemoteResultType.COMIC

    override fun toDao(): ComicEntity =
        ComicEntity(
            id,
            digitalId,
            title,
            issueNumber,
            variantDescription,
            description,
            modified,
            isbn,
            upc,
            diamondCode,
            ean,
            issn,
            format,
            pageCount
        )
}