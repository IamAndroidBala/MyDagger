package com.android.bala.dagger.model.photos

import com.android.bala.dagger.model.post.Post
import com.google.gson.Gson
import okhttp3.Response
import org.json.JSONArray

data class PhotosResult (private  val response: Response) {

    var allPhotos : List<Photos>? = null

    init {

        val gson = Gson()

        allPhotos = response.body()?.string()?.let {
            JSONArray(it)
                    .let { array ->
                        (0 until array.length()).map {
                            array.getJSONObject(it)
                        }.map {
                            gson.fromJson(it.toString(), Photos::class.java)
                        }
                    }
        }

    }

}