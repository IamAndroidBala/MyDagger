package com.android.bala.dagger.ui.userscreen

import com.android.bala.dagger.model.album.Album
import com.android.bala.dagger.model.user.User

interface UserView {

    fun displayLoading()

    fun dismissLoading()

    fun displayResult(result : List<User>)

    fun displayError(error : String?)

}