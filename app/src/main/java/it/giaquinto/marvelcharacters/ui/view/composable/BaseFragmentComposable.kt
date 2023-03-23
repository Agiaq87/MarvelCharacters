package it.giaquinto.marvelcharacters.ui.view.composable

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
import it.giaquinto.marvelcharacters.ui.theme.*


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
    url: String,
    name: String,
    description: String
) {
    Card(
        shape = CardRoundedCorner,
        elevation = MinimumElevation,
        contentColor = BackgroundDefaultRedItem,
        modifier = Modifier
            .padding(LowPadding)
    ) {
        Column {
            AsyncImage(
                model = url,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(ImageSize)
                    .clip(CircleShape)
            )
            Text(
                text = name,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(LowMediumPadding)
                    .fillMaxWidth(),
                style = MaterialTheme.typography.h4,
                color = OnPrimaryDefaultColor
            )
            Text(
                text = description,
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


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MarvelCharactersTheme {
        DefaultBackground {
            MarvelCard(
                "https://cdn.marvel.com/u/prod/marvel/images/mu/web/2021/icon-mu-shield.png",
                "LOGO",
                "Lorem ipsum dolor sit amet, consectet… adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum ipsdum"
            )
        }
    }
}
