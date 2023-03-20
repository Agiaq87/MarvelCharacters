package it.giaquinto.marvelcharacters.data.repository.implementation

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.db.EventDao
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
    override fun all(): Flow<ApiResult<List<MarvelEvent>>> {
        TODO("Not yet implemented")
    }

    override fun byEventID(eventID: String): Flow<ApiResult<List<MarvelEvent>>> {
        TODO("Not yet implemented")
    }

    override fun byCharacterID(characterID: String): Flow<ApiResult<List<MarvelEvent>>> {
        TODO("Not yet implemented")
    }

    override fun byComicID(comicID: String): Flow<ApiResult<List<MarvelEvent>>> {
        TODO("Not yet implemented")
    }

    override fun byCreatorID(creatorID: String): Flow<ApiResult<List<MarvelEvent>>> {
        TODO("Not yet implemented")
    }

    override fun bySeriesID(seriesID: String): Flow<ApiResult<List<MarvelEvent>>> {
        TODO("Not yet implemented")
    }

    override fun byStoryID(storyID: String): Flow<ApiResult<List<MarvelEvent>>> {
        TODO("Not yet implemented")
    }
}