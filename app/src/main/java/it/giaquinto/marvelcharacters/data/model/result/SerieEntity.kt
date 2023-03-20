package it.giaquinto.marvelcharacters.data.model.result

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "series")
data class SerieEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val title: String,
    val description: String,
    val resourceURI: String,
    val startYear: Int,
    val endYear: Int,
    val rating: String,
    val modified: String,
) : MarvelLocalEntity
