package it.giaquinto.marvelcharacters.data.model.result.implementation.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import it.giaquinto.marvelcharacters.data.model.result.MarvelSerie

@Entity(tableName = "series")
data class SerieEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    override val title: String,
    override val description: String,
    override val resourceURI: String,
    override val startYear: Int,
    override val endYear: Int,
    override val rating: String,
    override val modified: String,
) : MarvelSerie