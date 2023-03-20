package it.giaquinto.marvelcharacters.data.model.result.implementation.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import it.giaquinto.marvelcharacters.data.model.result.MarvelEvent

@Entity(tableName = "entities")
data class EventEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    override val title: String,
    override val description: String,
    override val resourceURI: String,
    override val modified: String,
    override val start: String,
    override val end: String,
) : MarvelEvent {
    fun asEntity(): EventEntity =
        EventEntity(
            id, title, description, resourceURI, modified, start, end
        )
}