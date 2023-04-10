package it.giaquinto.marvelcharacters.data.api

import it.giaquinto.marvelcharacters.domain.utils.ETag

sealed class ApiResult<T>(
    val httpCode: Int?,
    val eTag: ETag? // IF ETAG IS NULL ON SUCCESS, IT MEANS DATA IS PROVIDED FROM DB
) {
    class Success<T>(
        val data: T,
        httpCode: Int,
        eTag: ETag
    ) : ApiResult<T>(
        httpCode = httpCode,
        eTag = eTag
    )

    class Error<T>(
        val message: String,
        httpCode: Int
    ) : ApiResult<T>(
        httpCode = httpCode,
        eTag = null
    )

    class Loading<T> : ApiResult<T>(
        httpCode = null,
        eTag = null
    )
}
