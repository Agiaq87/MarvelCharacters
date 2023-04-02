package it.giaquinto.marvelcharacters.data.model.result

interface MarvelStory : MarvelResult {
    val title: String
    val description: String
    val resourceURI: String
    val type: String
    val modified: String
}