package com.example.composealltechniques.meditationUI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.composealltechniques.R
import com.example.composealltechniques.meditationUI.components.BottomMenu
import com.example.composealltechniques.meditationUI.components.ChipSection
import com.example.composealltechniques.meditationUI.components.CurrentMeditation
import com.example.composealltechniques.meditationUI.components.FeatureSection
import com.example.composealltechniques.meditationUI.components.GreetingSection
import com.example.composealltechniques.ui.theme.Beige1
import com.example.composealltechniques.ui.theme.Beige2
import com.example.composealltechniques.ui.theme.Beige3
import com.example.composealltechniques.ui.theme.BlueViolet1
import com.example.composealltechniques.ui.theme.BlueViolet2
import com.example.composealltechniques.ui.theme.BlueViolet3
import com.example.composealltechniques.ui.theme.DeepBlue
import com.example.composealltechniques.ui.theme.LightGreen1
import com.example.composealltechniques.ui.theme.LightGreen2
import com.example.composealltechniques.ui.theme.LightGreen3
import com.example.composealltechniques.ui.theme.OrangeYellow1
import com.example.composealltechniques.ui.theme.OrangeYellow2
import com.example.composealltechniques.ui.theme.OrangeYellow3


val features = listOf(
    Feature(
        title = "Sleep Meditation",
        R.drawable.ic_headphone,
        BlueViolet1,
        BlueViolet2,
        BlueViolet3
    ),
    Feature(
        title = "Tips for sleeping",
        R.drawable.ic_videocam,
        LightGreen1,
        LightGreen2,
        LightGreen3
    ),
    Feature(
        title = "Night Island",
        R.drawable.ic_headphone,
        OrangeYellow1,
        OrangeYellow2,
        OrangeYellow3
    ),
    Feature(
        title = "Calming Sounds",
        R.drawable.ic_headphone,
        Beige1,
        Beige2,
        Beige3
    )
)

val bottomMenuItems = listOf(
    BottomMenuContent("Home", R.drawable.ic_home),
    BottomMenuContent("Meditate", R.drawable.ic_bubble),
    BottomMenuContent("Sleep", R.drawable.ic_moon),
    BottomMenuContent("Music", R.drawable.ic_music),
    BottomMenuContent("Profile", R.drawable.ic_profile)
)

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        Column {
            GreetingSection()
            ChipSection(chips = listOf("Sweet Sleep", "Insomnia", "Depression"))
            CurrentMeditation()
            FeatureSection(features = features)
        }
        BottomMenu(
            items = bottomMenuItems,
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}













