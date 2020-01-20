package com.android.bala.dagger.network

class GetPhotos (private val apiBuilder: ApiBuilder) {

    fun getData() = apiBuilder.getPhotos()

}