package it.giaquinto.marvelcharacters.data.model.result.implementation.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import it.giaquinto.marvelcharacters.data.model.result.MarvelCharacter

@Entity(tableName = "characters")
data class CharacterEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    override val name: String,
    override val description: String,
    val modified: String,
    override val resourceURI: String
) : MarvelCharacter