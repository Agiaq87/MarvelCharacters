package it.giaquinto.marvelcharacters.data.model.result.implementation.remote

import com.google.gson.annotations.SerializedName
import it.giaquinto.marvelcharacters.data.model.result.MarvelComic
import it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support.*

class ComicResult(
    id: Int,
    @SerializedName("digitalId")
    override val digitalId: Int,
    @SerializedName("title")
    override val title: String,
    @SerializedName("issueNumber")
    override val issueNumber: Double,
    @SerializedName("variantDescription")
    override val variantDescription: String,
    @SerializedName("description")
    override val description: String,
    modified: String,
    @SerializedName("isbn")
    override val isbn: String,
    @SerializedName("upc")
    override val upc: String,
    @SerializedName("diamondCode")
    override val diamondCode: String,
    @SerializedName("ean")
    override val ean: String,
    @SerializedName("issn")
    override val issn: String,
    @SerializedName("format")
    override val format: String,
    @SerializedName("pageCount")
    override val pageCount: Int,
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
    thumbnail: ThumbnailResult,
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
), MarvelComic