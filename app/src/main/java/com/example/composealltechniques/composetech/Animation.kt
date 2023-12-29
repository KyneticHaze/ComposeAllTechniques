package com.example.composealltechniques.composetech

import androidx.compose.animation.animateColor
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composealltechniques.R

@Composable
fun AnimationSection() {
    AnimationItem1()
    AnimationItem2()
}

@Composable
fun AnimationItem1() {

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

@Composable
fun AnimationItem2() {

    var isHuge by remember { mutableStateOf(false) }
    var isNeedChangeToColor by remember { mutableStateOf(false) }

    val startColor = Color.Red
    val endColor = Color.Cyan

    val dp by animateDpAsState(
        targetValue = if (isHuge) 300.dp else 100.dp,
        animationSpec = tween(400, 400),
        label = "Dp huge"
    )
    val color by animateColorAsState(
        targetValue = if (isNeedChangeToColor) endColor else startColor,
        label = ""
    )

    var isRotated by remember {
        mutableStateOf(false)
    }

    val rotate by animateFloatAsState(
        targetValue = if (isRotated) 360f else 0f,
        animationSpec = tween(durationMillis = 2000),
        label = ""
    )

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        /*
        BoxSize(dp = dp, color = color)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            isHuge = !isHuge
        }) {
            Text(text = "Change to Box Dp")
        }
        Button(onClick = {
            isNeedChangeToColor = !isNeedChangeToColor
        }) {
            Text(text = "Rainbow!")
        } */
        Image(
            painter = painterResource(id = R.drawable.fan),
            contentDescription = "",
            modifier = Modifier
                .rotate(rotate)
                .size(200.dp)
        )
        Button(onClick = {
            isRotated = !isRotated
        }) {
            Text(text = "Rotate Fan")
        }
    }

    @Composable
    fun BoxSize(
        dp: Dp,
        color: Color
    ) {
        Box(
            modifier = Modifier
                .size(dp)
                .background(color)
        )
    }
}