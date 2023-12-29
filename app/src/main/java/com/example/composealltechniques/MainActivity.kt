package com.example.composealltechniques

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedTextField
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
import com.example.composealltechniques.ui.theme.ComposeAllTechniquesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAllTechniquesTheme {

                /*
                // State Lesson -> StateLessonComponent()
                // Modifier -> ModifierMembers()
                // Image Card -> ImageComponent()

                /*val constraints = ConstraintSet {
                    val greenBox = createRefFor(ConstraintIds.greenBoxId)
                    val redBox = createRefFor(ConstraintIds.redboxId)

                    constrain(greenBox) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        width = Dimension.value(100.dp)
                        height = Dimension.value(100.dp)
                    }
                    constrain(redBox) {
                        top.linkTo(parent.top)
                        start.linkTo(greenBox.end)
                        end.linkTo(parent.end)
                        width = Dimension.value(100.dp)
                        height = Dimension.value(100.dp)
                    }
                    createHorizontalChain(greenBox, redBox, chainStyle = ChainStyle.Packed)
                }

                ConstraintLayout(
                    // Constraint Layout -> Çokça iç içe giren column row kullanmaya bir alternatiftir.
                    constraints,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Box(
                        modifier = Modifier
                            .background(Color.Green)
                            .layoutId(ConstraintIds.greenBoxId)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color.Red)
                            .layoutId(ConstraintIds.redboxId)
                    )
                }*/

                // Animation -> Animation()

                // Circular Progress Bar
                /*Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        MyCircularProgressBar(percentage = 0.8f, number = 100)
                    }
                    */

                // HomeScreen() - Meditation App Home Screen
                */

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
                        modifier = Modifier.rotate(rotate).size(200.dp)
                    )
                    Button(onClick = {
                        isRotated = !isRotated
                    }) {
                        Text(text = "Rotate Fan")
                    }
                }

            }
        }
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