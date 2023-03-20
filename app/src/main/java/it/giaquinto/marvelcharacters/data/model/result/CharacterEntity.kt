package it.giaquinto.marvelcharacters.data.model.result

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "characters")
data class CharacterEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val name: String,
    val description: String,
    val modified: String,
    val resourceURI: String
) : MarvelLocalEntity