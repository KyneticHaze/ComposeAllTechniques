package com.example.composealltechniques.composetech

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.DurationBasedAnimationSpec
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateValue
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Animation() {

    var sizeState by remember {
        mutableStateOf(200.dp)
    }
    val size by animateDpAsState(
        targetValue = sizeState,
        label = "size",
        animationSpec = tween(
            400
        )
    )

    val infiniteTransition = rememberInfiniteTransition("Color Infinite")

    val color by infiniteTransition.animateColor(
        initialValue = Color.Yellow,
        targetValue = Color.Blue,
        animationSpec = infiniteRepeatable(
            tween(2000),
            repeatMode = RepeatMode.Reverse
        ), label = "Color Infinite Repeatable"
    )



    Box(
        modifier = Modifier
            .size(size)
            .background(color),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = { sizeState += 50.dp }) {
            Text("Increase Size")
        }
    }
}