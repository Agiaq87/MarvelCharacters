package it.giaquinto.marvelcharacters.data.repository.implementation

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.db.StoryDao
import it.giaquinto.marvelcharacters.data.model.result.MarvelCharacter
import it.giaquinto.marvelcharacters.data.model.result.MarvelStory
import it.giaquinto.marvelcharacters.data.repository.StoryRepository
import it.giaquinto.marvelcharacters.data.service.StoriesApiService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StoriesRepositoryImplementation @Inject constructor(
    private val storiesApiService: StoriesApiService,
    private val storyDao: StoryDao
) : StoryRepository {
    override suspend fun all(): Flow<ApiResult<out List<MarvelCharacter>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byCharacterID(characterID: String): Flow<ApiResult<out List<MarvelStory>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byComicID(comicID: String): Flow<ApiResult<out List<MarvelStory>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byCreatorID(creatorID: String): Flow<ApiResult<out List<MarvelStory>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byEventID(eventID: String): Flow<ApiResult<out List<MarvelStory>>> {
        TODO("Not yet implemented")
    }

    override suspend fun bySeriesID(seriesID: String): Flow<ApiResult<out List<MarvelStory>>> {
        TODO("Not yet implemented")
    }

    override suspend fun byStoryID(storyID: String): Flow<ApiResult<out List<MarvelStory>>> {
        TODO("Not yet implemented")
    }

}