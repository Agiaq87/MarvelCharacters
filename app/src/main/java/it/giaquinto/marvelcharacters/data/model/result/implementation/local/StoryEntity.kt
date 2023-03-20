package it.giaquinto.marvelcharacters.data.model.result.implementation.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import it.giaquinto.marvelcharacters.data.model.result.MarvelStory

@Entity(tableName = "stories")
data class StoryEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    override val title: String,
    override val description: String,
    override val resourceURI: String,
    override val type: String,
    override val modified: String,
) : MarvelStory {
    fun asEntity(): StoryEntity =
        StoryEntity(
            id, title, description, resourceURI, type, modified
        )
}