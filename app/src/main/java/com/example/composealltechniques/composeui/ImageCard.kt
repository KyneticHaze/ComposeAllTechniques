package com.example.composealltechniques.composeui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composealltechniques.R

@Composable
fun ImageComponent() {
    val painter = painterResource(id = R.drawable.pictow)
    val description = stringResource(id = R.string.image_string_desc)
    val title = stringResource(id = R.string.image_string_title)

    Box(modifier = Modifier
        .fillMaxWidth(0.5f)
        .padding(16.dp)) {
        ImageCard(
            painter = painter,
            contentDescription = description,
            title = title
        )
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {

        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 300f
                        )
                    )
            ) {

            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp), contentAlignment = Alignment.BottomCenter
            ) {
                Text(
                    title,
                    style = TextStyle(color = Color.White, fontSize = 16.sp)
                )
            }
        }

    }

}