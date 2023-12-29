package com.example.composealltechniques.Meditation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.example.composealltechniques.common.ConstraintIds

@Composable
fun MeditationApp() {

// State Lesson -> StateLessonComponent()
// Modifier -> ModifierMembers()
// Image Card -> ImageComponent()

    val constraints = ConstraintSet {
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
    }
}