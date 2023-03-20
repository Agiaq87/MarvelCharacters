package it.giaquinto.marvelcharacters.data.model.result

interface MarvelSerie : MarvelResult {
    val title: String
    val description: String
    val resourceURI: String
    val startYear: Int
    val endYear: Int
    val rating: String
    val modified: String
}