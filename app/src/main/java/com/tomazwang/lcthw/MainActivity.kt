package com.tomazwang.lcthw

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tomazwang.lcthw.ui.theme.LearnComposeTheHardWayTheme
import com.tomazwang.lcthw.ui.theme.SpotiColor
import com.tomazwang.lcthw.views.screen.SpotiSearchScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = SpotiColor.Black, modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
                SpotiSearchScreen()
            }
        }
    }
}
