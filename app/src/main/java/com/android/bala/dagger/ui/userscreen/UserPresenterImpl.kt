package com.android.bala.dagger.ui.userscreen

import com.android.bala.dagger.ui.albumscreen.AlbumView

interface UserPresenterImpl {

    fun setPage(userView : UserView)

    fun setLoading()

}