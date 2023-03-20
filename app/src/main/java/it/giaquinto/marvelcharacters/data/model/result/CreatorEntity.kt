package it.giaquinto.marvelcharacters.data.model.result

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "creator")
data class CreatorEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val firstName: String,
    val middleName: String,
    val lastName: String,
    val suffix: String,
    val fullName: String,
    val modified: String,
    val resourceURI: String,
) : MarvelLocalEntity