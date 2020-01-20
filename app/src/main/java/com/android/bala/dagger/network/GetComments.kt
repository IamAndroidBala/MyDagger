package com.android.bala.dagger.network

class GetComments (private val apiBuilder: ApiBuilder) {

    fun getData() = apiBuilder.getComments()

}