package it.giaquinto.marvelcharacters.data.api

sealed class ApiResult<out T>(
    val status: ApiStatus,
    val data: T?,
    val message: String?,
    statusCode: Int?
) {
    class Success<out R>(_data: R?, _message: String?, _statusCode: Int?) : ApiResult<R>(
        status = ApiStatus.SUCCESS,
        data = _data,
        message = _message,
        statusCode = _statusCode
    )

    class Error(_message: String, _statusCode: Int?) : ApiResult<Nothing>(
        status = ApiStatus.ERROR,
        data = null,
        message = _message,
        statusCode = _statusCode
    )

    object Loading : ApiResult<Nothing>(
        status = ApiStatus.LOADING,
        data = null,
        message = null,
        statusCode = null
    )
}
