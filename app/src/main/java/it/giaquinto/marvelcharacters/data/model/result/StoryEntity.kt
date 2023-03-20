package it.giaquinto.marvelcharacters.data.model.result

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stories")
data class StoryEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val title: String,
    val description: String,
    val resourceURI: String,
    val type: String,
    val modified: String,
) : MarvelLocalEntity
