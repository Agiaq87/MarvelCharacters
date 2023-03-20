package it.giaquinto.marvelcharacters.data.model.result

interface MarvelEvent : MarvelResult {
    val title: String
    val description: String
    val resourceURI: String
    val modified: String
    val start: String
    val end: String
}