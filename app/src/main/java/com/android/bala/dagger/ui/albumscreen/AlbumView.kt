package com.android.bala.dagger.ui.albumscreen

import com.android.bala.dagger.model.album.Album

interface AlbumView {

    fun displayLoading()

    fun dismissLoading()

    fun displayResult(result : List<Album>)

    fun displayError(error : String?)

}