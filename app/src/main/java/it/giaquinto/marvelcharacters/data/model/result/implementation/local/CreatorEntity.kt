package it.giaquinto.marvelcharacters.data.model.result.implementation.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import it.giaquinto.marvelcharacters.data.model.result.MarvelCreator

@Entity(tableName = "creators")
data class CreatorEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    override val firstName: String,
    override val middleName: String,
    override val lastName: String,
    override val suffix: String,
    override val fullName: String,
    val modified: String,
    val resourceURI: String,
) : MarvelCreator