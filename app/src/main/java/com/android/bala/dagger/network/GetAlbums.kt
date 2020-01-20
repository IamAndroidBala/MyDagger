package com.android.bala.dagger.network

class GetAlbums (private val apiBuilder: ApiBuilder) {

    fun getData() = apiBuilder.getAlbums()

}