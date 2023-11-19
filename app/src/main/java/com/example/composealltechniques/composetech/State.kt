package com.example.composealltechniques.composetech

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random


@Composable
fun StateLessonComponent() {
    Column(
        Modifier.fillMaxSize()
    ) {

        var color by remember {
            mutableStateOf(Color.Yellow)
        }

        ColorBox(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize(),
            updateColor = { color = it }
        )

        Box(
            modifier = Modifier
                .background(color)
                .weight(1f)
                .fillMaxSize()
        )

    }
}



@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
) {

    Box(modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        })
}
