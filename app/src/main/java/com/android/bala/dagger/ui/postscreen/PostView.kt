package com.android.bala.dagger.ui.postscreen

import com.android.bala.dagger.model.post.Post

interface PostView {

    fun displayLoading()

    fun dismissLoading()

    fun displayResult(result : List<Post>)

    fun displayError(error : String?)

}