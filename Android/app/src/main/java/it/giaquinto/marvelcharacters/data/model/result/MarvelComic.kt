package it.giaquinto.marvelcharacters.data.model.result

interface MarvelComic : MarvelResult {
    val digitalId: Int
    val title: String
    val issueNumber: Double
    val variantDescription: String
    val description: String
    val modified: String
    val isbn: String
    val upc: String
    val diamondCode: String
    val ean: String
    val issn: String
    val format: String
    val pageCount: Int
}