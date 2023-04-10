package it.giaquinto.marvelcharacters.data.db

import androidx.room.*
import it.giaquinto.marvelcharacters.data.model.result.implementation.local.ComicEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ComicDao : BaseDao<ComicEntity> {
    @Update(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun update(data: ComicEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(data: ComicEntity)

    @Query("SELECT * FROM comics")
    override fun get(): Flow<List<ComicEntity>>
}