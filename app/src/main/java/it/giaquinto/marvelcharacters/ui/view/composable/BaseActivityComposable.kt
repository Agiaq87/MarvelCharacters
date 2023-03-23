package it.giaquinto.marvelcharacters.ui.view.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomAppBar
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.style.TextAlign
import it.giaquinto.marvelcharacters.ui.theme.*

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun AppBar() {
    MarvelCharactersTheme {
        Box(
            modifier = Modifier
                .background(
                    color = BackgroundGradientRedHigh
                )
        ) {
            TopAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(AppBarHeight)
                    .clip(
                        shape = AppBarRoundedCorner
                    ),
                elevation = DefaultElevation,
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Title()
                }
            }
        }

    }
}

@Composable
fun Title() {
    MarvelCharactersTheme {
        Text(
            text = "MARVEL",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    NoPadding,
                    MediumPadding,
                    NoPadding,
                    MediumPadding
                ),
            style = MaterialTheme.typography.h1,
            color = OnPrimaryDefaultColor
        )
    }
}


@Composable
fun AppFooter(
    onPreferredClicked: () -> Unit,
    onHomeClicked: () -> Unit,
    onSettingsClicked: () -> Unit
) {
    BottomAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(FooterHeight)
            .clip(
                AppFooterRoundedCorner
            ),
        backgroundColor = BackgroundDefaultRed,
        elevation = DefaultElevation,
        contentPadding = PaddingValues(
            ExtremePadding,
            NoPadding
        )
    ) {

    }
}

@Composable
fun DefaultBackground(
    passedContent: @Composable() (ColumnScope.() -> Unit)
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        BackgroundGradientRedHigh,
                        BackgroundGradientRedMiddle,
                        BackgroundGradientRedLow
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier.padding(
                LargePadding,
                LargePadding,
                LargePadding,
                NoPadding
            ),
            content = passedContent
        )
    }
}


/*@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MarvelCharactersTheme {
        Scaffold(
            topBar = {
                AppBar()
            },
            bottomBar = {
                AppFooter(
                    {},
                    {},
                    {}
                )
            }
        ) {
            DefaultBackground {
                Text("Ciao")
            }
        }
    }
}*/
