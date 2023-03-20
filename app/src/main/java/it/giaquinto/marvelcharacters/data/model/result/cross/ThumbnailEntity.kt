package it.giaquinto.marvelcharacters.data.model.result.cross

import androidx.room.Entity
import androidx.room.PrimaryKey
import it.giaquinto.marvelcharacters.data.model.result.MarvelLocalEntity

@Entity(tableName = "thumbnails")
data class ThumbnailEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val extension: String,
    val path: String
) : MarvelLocalEntity
