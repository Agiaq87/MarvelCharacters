package it.giaquinto.marvelcharacters.data.repository.implementation

import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.db.StoryDao
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
    override fun all(): Flow<ApiResult<List<MarvelStory>>> {
        TODO("Not yet implemented")
    }

    override fun byCharacterID(characterID: String): Flow<ApiResult<List<MarvelStory>>> {
        TODO("Not yet implemented")
    }

    override fun byComicID(comicID: String): Flow<ApiResult<List<MarvelStory>>> {
        TODO("Not yet implemented")
    }

    override fun byCreatorID(creatorID: String): Flow<ApiResult<List<MarvelStory>>> {
        TODO("Not yet implemented")
    }

    override fun byEventID(eventID: String): Flow<ApiResult<List<MarvelStory>>> {
        TODO("Not yet implemented")
    }

    override fun bySeriesID(seriesID: String): Flow<ApiResult<List<MarvelStory>>> {
        TODO("Not yet implemented")
    }

    override fun byStoryID(storyID: String): Flow<ApiResult<List<MarvelStory>>> {
        TODO("Not yet implemented")
    }
}