package it.giaquinto.marvelcharacters.data.db

import androidx.room.*
import it.giaquinto.marvelcharacters.data.model.result.implementation.local.CreatorEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CreatorDao : BaseDao<CreatorEntity> {
    @Update(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun update(data: CreatorEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(data: CreatorEntity)

    @Query("SELECT * FROM creators")
    override fun get(): Flow<List<CreatorEntity>>
}