package it.giaquinto.marvelcharacters.data.model.result.implementation.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import it.giaquinto.marvelcharacters.data.model.result.MarvelThumbnail

@Entity(tableName = "thumbnails")
data class ThumbnailEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    override val extension: String,
    override val path: String
) : MarvelThumbnail {
    override fun toResourceUri(): String =
        path
}