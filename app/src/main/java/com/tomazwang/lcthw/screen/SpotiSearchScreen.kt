package com.tomazwang.lcthw.screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.tomazwang.lcthw.data.model.MusicGenre
import com.tomazwang.lcthw.data.repo.SpotiSearchRepo
import com.tomazwang.lcthw.ui.theme.SpotiColor
import com.tomazwang.lcthw.views.component.SpotiGenreBlock
import com.tomazwang.lcthw.views.component.SpotiPlayerBar

/**
 * Created by TomazWang on 2021/08/18.
 *
 *
 * @author Tomaz Wang
 * @since 2021/08/18
 **/

private const val TAG = "SpotiSearchScreen"

@Composable
fun SpotiSearchScreen() {
    
    Log.d(TAG, "SpotiSearchScreen: init")
    
    val vm: SpotiSearchScreenViewModel = viewModel()
    
    val currentSelected by vm.currentSelected.observeAsState()
    val currentFav by vm.isFav.observeAsState()
    
    
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    
    ) {
        
        SearchPage(modifier = Modifier.weight(1f), onSelect = {
            vm.select(it)
        })
        SpotiPlayerBar(
            genre = currentSelected!!,
            isFav = currentFav!!,
            onFav = { vm.toggleFav(it.id) },
            modifier = Modifier
                .height(60.dp)
        )
    }
}


@Composable
private fun SearchPage(onSelect: (MusicGenre) -> Unit = {}, modifier: Modifier = Modifier) {
    val repo = SpotiSearchRepo()
    
    LazyColumn(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .then(modifier),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { Spacer(modifier = Modifier.height(32.dp)) }
        
        item {
            Text(
                text = "Search",
                color = Color.White,
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.Black
            )
        }
        
        
        item { SearchBox(hintText = "Artists, songs, or podcasts") }
        
        item {
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Your top genres", color = Color.White, fontWeight = FontWeight.Bold)
        }
        
        
        items(repo.getTopGenreList().chunked(2)) { twoItem ->
            val (first, second) = twoItem
            GenreRow(first = first, second = second, onSelect = onSelect)
        }
        
        item {
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Browse all", color = Color.White, fontWeight = FontWeight.Bold)
        }
        
        items(repo.getAllGenreList().chunked(2)) { twoItem ->
            val (first, second) = twoItem
            GenreRow(first = first, second = second, onSelect = onSelect)
        }
        
    }
}


@Composable
private fun GenreRow(first: MusicGenre, second: MusicGenre, onSelect: (MusicGenre) -> Unit) {
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 4.dp)
    ) {
        SpotiGenreBlock(
            title = first.title,
            coverImgRes = first.image,
            color = first.color,
            modifier = Modifier
                .weight(1f)
                .clickable { onSelect(first) }
        )
        Spacer(modifier = Modifier.width(12.dp))
        SpotiGenreBlock(
            title = second.title,
            coverImgRes = second.image,
            color = second.color,
            modifier = Modifier
                .weight(1f)
                .clickable { onSelect(second) }
        )
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