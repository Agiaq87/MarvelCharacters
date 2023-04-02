package it.giaquinto.marvelcharacters.data.model.result.implementation.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import it.giaquinto.marvelcharacters.data.model.result.MarvelComic

@Entity(tableName = "comics")
data class ComicEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    override val digitalId: Int,
    override val title: String,
    override val issueNumber: Double,
    override val variantDescription: String,
    override val description: String,
    override val modified: String,
    override val isbn: String,
    override val upc: String,
    override val diamondCode: String,
    override val ean: String,
    override val issn: String,
    override val format: String,
    override val pageCount: Int
) : MarvelComic