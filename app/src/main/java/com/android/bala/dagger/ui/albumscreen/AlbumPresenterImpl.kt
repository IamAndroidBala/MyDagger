package com.android.bala.dagger.ui.albumscreen

import com.android.bala.dagger.ui.postscreen.PostView

interface AlbumPresenterImpl {

    fun setPage(alBumView: AlbumView)

    fun setLoading()

}