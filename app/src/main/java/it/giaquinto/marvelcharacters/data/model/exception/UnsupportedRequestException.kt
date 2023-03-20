package it.giaquinto.marvelcharacters.data.model.exception

class UnsupportedRequestException : Exception() {
    override val message: String
        get() = "Unsupported operation for data"
}
