package it.giaquinto.marvelcharacters.data.db

import androidx.room.*
import it.giaquinto.marvelcharacters.data.model.result.implementation.local.StoryEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface StoryDao : BaseDao<StoryEntity> {

    @Update(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun update(data: StoryEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(data: StoryEntity)

    @Query("SELECT * FROM stories")
    override fun get(): Flow<List<StoryEntity>>
}