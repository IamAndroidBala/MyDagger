package com.android.bala.dagger.network

class GetPosts (private val apiBuilder: ApiBuilder) {

    fun getData() = apiBuilder.getPosts()

}