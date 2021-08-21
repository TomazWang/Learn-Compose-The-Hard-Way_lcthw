package com.tomazwang.lcthw

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.tomazwang.lcthw.ui.theme.SpotiColor
import com.tomazwang.lcthw.screen.SpotiSearchScreen

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
