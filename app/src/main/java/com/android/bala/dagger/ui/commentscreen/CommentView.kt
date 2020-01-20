package com.android.bala.dagger.ui.commentscreen

import com.android.bala.dagger.model.comment.Comment

interface CommentView {

    fun displayLoading()

    fun dismissLoading()

    fun displayResult(result : List<Comment>)

    fun displayError(error : String?)

}