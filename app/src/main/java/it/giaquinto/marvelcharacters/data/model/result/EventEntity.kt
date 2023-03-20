package it.giaquinto.marvelcharacters.data.model.result

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "entities")
data class EventEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val title: String,
    val description: String,
    val resourceURI: String,
    val modified: String,
    val start: String,
    val end: String,
) : MarvelLocalEntity
