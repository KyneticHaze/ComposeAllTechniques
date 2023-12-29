package com.example.composealltechniques.ComposeTry.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun ModifierMembers() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.error
    ) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            FillMaxW(modifier = Modifier
                .background(Color.Yellow)
                .size(100.dp, 100.dp)
                .border(5.dp, Color.Black)
            )
            
            Spacer(modifier = Modifier.height(10.dp))

            FillMaxW(modifier = Modifier
                .background(Color.Green)
                .size(100.dp, 100.dp)
                .clip(RoundedCornerShape(10.dp))
                .border(5.dp, Color.Blue)
            )
        }
    }
}

@Composable
fun FillMaxW(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Text(text = "This is a box!", style = TextStyle(
            color = MaterialTheme.colorScheme.primary,
            textDecoration = TextDecoration.Underline
        ), modifier = Modifier.padding(10.dp))
    }
}