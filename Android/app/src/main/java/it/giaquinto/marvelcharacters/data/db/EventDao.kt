package it.giaquinto.marvelcharacters.data.db

import androidx.room.*
import it.giaquinto.marvelcharacters.data.model.result.implementation.local.EventEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface EventDao : BaseDao<EventEntity> {
    @Update(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun update(data: EventEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(data: EventEntity)

    @Query("SELECT * FROM events")
    override fun get(): Flow<List<EventEntity>>
}