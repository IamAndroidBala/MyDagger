package com.android.bala.dagger.ui.albumscreen

import com.android.bala.dagger.model.album.AlbumResult
import com.android.bala.dagger.network.GetAlbums
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject


class AlbumPresenter @Inject constructor(private val albums : GetAlbums) : AlbumPresenterImpl {

    private lateinit var albumView : AlbumView

    override fun setLoading() {

        albumView.displayLoading()

        albums.getData().enqueue(object : Callback {

            override fun onResponse(call: Call, response: Response) {

                albumView.dismissLoading()

                if (response.isSuccessful) {
                    response.let {
                        AlbumResult(it).allResult?.let {
                            albumView.displayResult(it)
                        } ?: run {
                            albumView.displayError(response.message())
                        }
                    }
                } else {
                    albumView.displayError(response.message())
                }

            }

            override fun onFailure(call: Call, e: IOException) {
                albumView.displayError(e.message)
            }

        })

    }

    override fun setPage(alBumView: AlbumView) {
        this.albumView = alBumView
    }

}