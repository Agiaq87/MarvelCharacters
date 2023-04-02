package it.giaquinto.marvelcharacters.data.repository.implementation

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.db.EventDao
import it.giaquinto.marvelcharacters.data.model.result.MarvelCharacter
import it.giaquinto.marvelcharacters.data.model.result.MarvelEvent
import it.giaquinto.marvelcharacters.data.repository.EventRepository
import it.giaquinto.marvelcharacters.data.service.EventsApiService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EventsRepositoryImplementation @Inject constructor(
    private val eventsApiService: EventsApiService,
    private val eventDao: EventDao
) : EventRepository {
    override suspend fun all(): Flow<ApiResult<out List<MarvelCharacter>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byCharacterID(characterID: String): Flow<ApiResult<out List<MarvelEvent>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byComicID(comicID: String): Flow<ApiResult<out List<MarvelEvent>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byCreatorID(creatorID: String): Flow<ApiResult<out List<MarvelEvent>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byEventID(eventID: String): Flow<ApiResult<out List<MarvelEvent>>> {
        TODO("Not yet implemented")
    }

    override suspend fun bySeriesID(seriesID: String): Flow<ApiResult<out List<MarvelEvent>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byStoryID(storyID: String): Flow<ApiResult<out List<MarvelEvent>>> {
        TODO("Not yet implemented")
    }

}