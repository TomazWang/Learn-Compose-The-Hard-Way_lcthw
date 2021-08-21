package com.tomazwang.lcthw.screen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.tomazwang.lcthw.data.model.MusicGenre
import com.tomazwang.lcthw.data.repo.SpotiFavRepo

/**
 * Created by TomazWang on 2021/08/22.
 *
 *
 * @author Tomaz Wang
 * @since 2021/08/22
 **/

class SpotiSearchScreenViewModel : ViewModel() {
    
    private val favRepo = SpotiFavRepo()
    
    private val _currentSelected = MutableLiveData(MusicGenre.EmptyGenre)
    
    
    val currentSelected: LiveData<MusicGenre>
        get() = _currentSelected
    
    val _isFav = MutableLiveData(false)
    
    val isFav
        get() = _isFav
    
    
    fun select(genre: MusicGenre) {
        _currentSelected.value = genre
        _isFav.value = favRepo.isFav(genre.id)
    }
    
    fun toggleFav(id: Int) {
        favRepo.toggleFav(id)
        _isFav.value = favRepo.isFav(id)
    }
}


data class MusicGenreSpotiSearchScreenState(
    val currentSelected: MusicGenre,
    val isFav: Boolean
)