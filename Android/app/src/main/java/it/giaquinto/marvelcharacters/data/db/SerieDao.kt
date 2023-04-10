package it.giaquinto.marvelcharacters.data.db

import androidx.room.*
import it.giaquinto.marvelcharacters.data.model.result.implementation.local.SerieEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SerieDao : BaseDao<SerieEntity> {
    @Update(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun update(data: SerieEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(data: SerieEntity)

    @Query("SELECT * FROM series")
    override fun get(): Flow<List<SerieEntity>>
}