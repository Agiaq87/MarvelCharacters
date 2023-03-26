package it.giaquinto.marvelcharacters.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import it.giaquinto.marvelcharacters.data.model.result.implementation.local.*

@Database(
    entities = [
        CharacterEntity::class,
        ComicEntity::class,
        CreatorEntity::class,
        EventEntity::class,
        SerieEntity::class,
        StoryEntity::class
    ],
    version = 1
)
abstract class MarvelDatabase : RoomDatabase() {
    abstract fun characterDao(): CharacterDao
    abstract fun comicDao(): ComicDao
    abstract fun creatorDao(): CreatorDao
    abstract fun eventDao(): EventDao
    abstract fun serieDao(): SerieDao
    abstract fun storyDao(): StoryDao
}