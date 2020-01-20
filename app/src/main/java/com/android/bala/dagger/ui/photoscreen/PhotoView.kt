package com.android.bala.dagger.ui.photoscreen

import com.android.bala.dagger.model.photos.Photos

interface PhotoView {

    fun displayLoading()

    fun dismissLoading()

    fun displayResult(result : List<Photos>)

    fun displayError(error : String?)

}