package it.giaquinto.marvelcharacters.data.db

import androidx.room.Dao
import it.giaquinto.marvelcharacters.data.model.result.MarvelResult
import kotlinx.coroutines.flow.Flow

@Dao
interface BaseDao<T : MarvelResult> {

    suspend fun update(data: T)


    suspend fun insert(data: T)


    fun get(): Flow<List<T>>
}