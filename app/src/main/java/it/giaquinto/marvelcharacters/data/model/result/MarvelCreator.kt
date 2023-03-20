package it.giaquinto.marvelcharacters.data.model.result

interface MarvelCreator : MarvelResult {
    val firstName: String
    val middleName: String
    val lastName: String
    val suffix: String
    val fullName: String
}