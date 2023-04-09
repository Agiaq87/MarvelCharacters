package it.giaquinto.marvelcharacters.domain.manager.data.tracker

import android.os.Bundle
import androidx.core.os.bundleOf
import it.giaquinto.marvelcharacters.data.api.ApiResult
import it.giaquinto.marvelcharacters.data.model.result.MarvelResult
import it.giaquinto.marvelcharacters.data.repository.BaseRepository

sealed class EventDataTrack(
    val name: String,
    val params: Bundle
) {
    class FetchNetwork<EXT_MARVEL_RESULT: MarvelResult, EXT_MARVEL_REPOSITORY: BaseRepository<EXT_MARVEL_RESULT>>(
        repository: EXT_MARVEL_REPOSITORY, status: ApiResult<out List<Any>>
    ): EventDataTrack(
        name = "FETCH_NETWORK",
        bundleOf(
            repository.getUniqueName() to
            when (status) {
                is ApiResult.Loading -> "LOADING"
                is ApiResult.Error -> "ERROR"
                is ApiResult.Success -> "SUCCESS"
            }
        )
    )
}