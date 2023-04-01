package it.giaquinto.marvelcharacters.data.db

import androidx.room.*
import it.giaquinto.marvelcharacters.data.model.result.implementation.local.CharacterEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CharacterDao : BaseDao<CharacterEntity> {

    @Update(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun update(data: CharacterEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    override suspend fun insert(data: CharacterEntity)

    @Query("SELECT * FROM characters")
    override fun get(): Flow<List<CharacterEntity>>
}