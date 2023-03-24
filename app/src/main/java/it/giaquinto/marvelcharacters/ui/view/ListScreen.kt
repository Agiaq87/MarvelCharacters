package it.giaquinto.marvelcharacters.ui.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import it.giaquinto.marvelcharacters.data.model.result.MarvelCharacter
import it.giaquinto.marvelcharacters.data.model.result.MarvelResult
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
                LargePadding,
                LargePadding
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
fun MarvelCard(
    character: MarvelCharacter
) {
    Card(
        shape = CardRoundedCorner,
        elevation = MinimumElevation,
        contentColor = BackgroundDefaultRedItem,
        modifier = Modifier
            .padding(LowPadding)
            .wrapContentSize()
    ) {
        Column {
            AsyncImage(
                model = character.resourceURI,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(ImageSize)
                    .clip(CircleShape)
            )
            Text(
                text = character.name,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(LowMediumPadding)
                    .fillMaxWidth(),
                style = MaterialTheme.typography.h4,
                color = OnPrimaryDefaultColor
            )
            Text(
                text = character.description,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(LowMediumPadding)
                    .wrapContentSize(),
                style = MaterialTheme.typography.body2,
                color = OnPrimaryDefaultColor,
                maxLines = 2,

                )
        }
    }
}

@Composable
fun <T : MarvelResult> ListScreen(
    data: List<T>,
    listType: ListType,
    requireSearchBar: Boolean
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        DefaultSearchBar("", {}, {}, {})
        when (listType) {
            ListType.GRID -> {

            }
            ListType.LIST -> {

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListPreview() {
    MarvelCharactersTheme {
        DefaultBackground {

        }
    }
}