package it.giaquinto.marvelcharacters.ui.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import it.giaquinto.marvelcharacters.data.model.result.MarvelCharacter
import it.giaquinto.marvelcharacters.data.model.result.MarvelComic
import it.giaquinto.marvelcharacters.data.model.result.MarvelEvent
import it.giaquinto.marvelcharacters.data.model.result.MarvelResult
import it.giaquinto.marvelcharacters.ui.constant.*
import it.giaquinto.marvelcharacters.ui.model.ListType
import it.giaquinto.marvelcharacters.ui.theme.*
import it.giaquinto.marvelcharacters.ui.view.composable.DefaultBackground


@Composable
fun DefaultSearchBar(
    text: String,
    onTextChange: (String) -> Unit,
    onSearchedClicked: () -> Unit,
    onCloseClicked: () -> Unit
) {
    Surface(
        modifier = Modifier
            .padding(
                ThirtyPadding,
                ThirtyPadding
            )
            .clip(
                shape = SearchBarRoundedCorner
            )
    ) {
        Box(
            modifier = Modifier

        ) {
            TextField(
                value = text,
                onValueChange = {
                    onTextChange(it)
                },
                placeholder = {
                    Text(
                        text = "",
                        textAlign = TextAlign.Start,
                        color = OnPrimaryDefaultColor,
                        modifier = Modifier
                            .padding(
                                NoPadding
                            ),
                        style = MaterialTheme.typography.body2
                    )
                }
            )
        }
        IconButton(
            onClick = { onSearchedClicked() }
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Cerca qui",
                tint = OnPrimaryDefaultColor
            )
        }
    }
}

@Composable
fun MarvelCardCharacter(
    character: MarvelCharacter
) {
    Card(
        shape = CardRoundedCorner,
        elevation = MinimumElevation,
        contentColor = BackgroundDefaultRedItem,
        modifier = Modifier
            .padding(EightPadding)
            .wrapContentSize()
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        NoPadding,
                        TwentyPadding,
                        NoPadding,
                        TenPadding
                    ),
                horizontalArrangement = Arrangement.Center
            ) {
                AsyncImage(
                    model = character.resourceURI,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(ImageSize)
                        .clip(CircleShape)
                )
            }
            Text(
                text = character.name,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth(),
                style = MaterialTheme.typography.h4,
                color = OnPrimaryDefaultColor
            )
            Text(
                text = character.description,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(
                        FifTeenPadding,
                        FivePadding,
                        FifTeenPadding,
                        TwentyPadding
                    )
                    .wrapContentSize(),
                style = MaterialTheme.typography.body2,
                color = OnPrimaryDefaultColor,
                maxLines = 2,

                )
        }
    }
}

@Composable
fun MarvelCardComic(
    comic: MarvelComic
) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    NoPadding,
                    TwentyPadding,
                    NoPadding,
                    TenPadding
                ),
            horizontalArrangement = Arrangement.Center
        ) {
            AsyncImage(
                model = Icons.Default.AccountBox,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(ImageSize)
                    .clip(CircleShape)
            )
        }
        Text(
            text = comic.title,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth(),
            style = MaterialTheme.typography.h4,
            color = OnPrimaryDefaultColor
        )
        Text(
            text = comic.description,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(
                    FifTeenPadding,
                    FivePadding,
                    FifTeenPadding,
                    TwentyPadding
                )
                .wrapContentSize(),
            style = MaterialTheme.typography.body2,
            color = OnPrimaryDefaultColor,
            maxLines = 2
        )
    }
}

@Composable
fun <T : MarvelResult> ListScreen(
    clazz: T,
    data: List<T>,
    listType: ListType,
    requireSearchBar: Boolean
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        if (requireSearchBar)
            DefaultSearchBar("", {}, {}, {})

        when (listType) {
            ListType.GRID -> {
                GridList(clazz = clazz, data = data)
            }
            ListType.LIST -> {

            }
        }
    }
}

@Composable
fun <T : MarvelResult> GridList(
    clazz: T,
    data: List<T>
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
    ) {
        when (clazz) {
            is MarvelCharacter -> {
                items(data.size) {
                    MarvelCardCharacter(character = data[it] as MarvelCharacter)
                }
            }
            is MarvelEvent -> {

            }
        }
    }
}

@Composable
fun <T : MarvelResult> SimpleList(
    clazz: T,
    data: List<T>
) {
    LazyColumn {
        when (clazz) {
            is MarvelComic -> {
                items(data.size) {
                    MarvelCardComic(comic = data[it] as MarvelComic)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListPreview() {
    MarvelCharactersTheme {
        DefaultBackground {
            MarvelCardComic(
                comic = object : MarvelComic {
                    override val digitalId: Int
                        get() = defaultTestDigitalId
                    override val title: String
                        get() = defaultTestTitle
                    override val issueNumber: Double
                        get() = defaultTestIssueNumber
                    override val variantDescription: String
                        get() = defaultTestVariantDescription
                    override val description: String
                        get() = defaultTestDescription
                    override val modified: String
                        get() = defaultTestModified
                    override val isbn: String
                        get() = defaultTestIsbn
                    override val upc: String
                        get() = defaultTestUpc
                    override val diamondCode: String
                        get() = defaultTestDiamondCode
                    override val ean: String
                        get() = defaultTestEan
                    override val issn: String
                        get() = defaultTestIssn
                    override val format: String
                        get() = defaultTestFormat
                    override val pageCount: Int
                        get() = defaultTestPageCount
                }
            )
        }
    }
}