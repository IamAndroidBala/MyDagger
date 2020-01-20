package com.android.bala.dagger.network

class GetUsers (private val apiBuilder: ApiBuilder) {

    fun getData() = apiBuilder.getUser()

}