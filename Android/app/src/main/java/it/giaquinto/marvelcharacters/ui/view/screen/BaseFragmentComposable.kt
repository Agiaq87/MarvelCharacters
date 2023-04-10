package it.giaquinto.marvelcharacters.ui.view.screen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import it.giaquinto.marvelcharacters.ui.constant.alertErrorTitle
import it.giaquinto.marvelcharacters.ui.constant.alertNetworkError
import it.giaquinto.marvelcharacters.ui.theme.*


@Composable
fun NetworkErrorAlertDialog() {
    Box(
        modifier = Modifier
            .border(
                width = AlertDialogBorderWidth,
                color = BackgroundDefaultRedItem,
                shape = RectangleShape
            )
            .padding(
                TenPadding
            )
    ) {
        Column {
            Box(
                modifier = Modifier
                    .padding(TwentyPadding)
            ) {
                Text(
                    alertErrorTitle,
                    style = MaterialTheme.typography.h1,
                    textAlign = TextAlign.Center,
                    color = OnPrimaryDefaultColor,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
            Box(
                modifier = Modifier
                    .padding(FifTeenPadding)
            ) {
                Text(
                    alertNetworkError,
                    style = MaterialTheme.typography.h5,
                    textAlign = TextAlign.Justify,
                    color = OnPrimaryDefaultColor
                )
            }
        }
    }
}
