package it.giaquinto.marvelcharacters.data.model.result.implementation.remote.support

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "thumbnails")
data class ThumbnailEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val extension: String,
    val path: String
)