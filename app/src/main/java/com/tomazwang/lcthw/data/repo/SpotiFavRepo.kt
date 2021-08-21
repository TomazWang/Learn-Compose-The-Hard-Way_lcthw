package com.tomazwang.lcthw.data.repo

/**
 * Created by TomazWang on 2021/08/21.
 *
 *
 * @author Tomaz Wang
 * @since 2021/08/21
 **/

class SpotiFavRepo {
    
    companion object {
        private val favMap = mutableMapOf<Int, Boolean>()
    }
    
    fun isFav(id: Int) = favMap[id] == true
    
    fun toggleFav(id: Int) {
        favMap[id] = !isFav(id)
    }
}