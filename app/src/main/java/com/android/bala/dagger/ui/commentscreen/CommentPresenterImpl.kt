package com.android.bala.dagger.ui.commentscreen

import com.android.bala.dagger.ui.postscreen.PostView

interface CommentPresenterImpl {

    fun setPage(commentView: CommentView)

    fun setLoading()

}