package com.example.composealltechniques

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.composealltechniques.composeui.MyCircularProgressBar
import com.example.composealltechniques.meditationUI.HomeScreen
import com.example.composealltechniques.ui.theme.ComposeAllTechniquesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAllTechniquesTheme {

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

                HomeScreen()
            }
        }
    }
}

