package com.tomazwang.lcthw.views.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tomazwang.lcthw.ui.theme.SpotiColor

/**
 * Created by TomazWang on 2021/08/18.
 *
 *
 * @author Tomaz Wang
 * @since 2021/08/18
 **/

@Composable
fun SpotiSearchScreen() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        
        Text(
            text = "Search",
            color = Color.White,
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Black
        )
        
        
        SearchBox(hintText = "Artists, songs, or podcasts")
        
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Your top generes", color = Color.White, fontWeight = FontWeight.Bold)
        
        Box { /* TODO  Blocks() */ }
        
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Browse all", color = Color.White, fontWeight = FontWeight.Bold)
        
        Box {  /* TODO  Blocks() */ }
    }
}


@Composable
private fun SearchBox(hintText: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .padding(vertical = 4.dp)
            .then(modifier)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(4.dp))
                .background(color = Color.White)
                .padding(8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "search_icon",
                tint = SpotiColor.LightGray
            )
            // TextField(value = text, onValueChange = { text = it })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = hintText, color = SpotiColor.LightGray)
        }
    }
}


@Preview(
    showBackground = true,
    name = "Spoti search screen",
    backgroundColor = 0xFF191414
)
@Composable
fun PreviewSpotiHomeScreen() {
    SpotiSearchScreen()
}
