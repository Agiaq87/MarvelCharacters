package it.giaquinto.marvelcharacters.data.model.result

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "comics")
data class ComicEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val digitalId: Int,
    val title: String,
    val issueNumber: Double,
    val variantDescription: String,
    val description: String,
    val modified: String,
    val isbn: String,
    val upc: String,
    val diamondCode: String,
    val ean: String,
    val issn: String,
    val format: String,
    val pageCount: Int
) : MarvelLocalEntity