package com.android.bala.dagger.ui.photoscreen

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.bala.dagger.R
import com.android.bala.dagger.model.photos.Photos
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_photos.view.*
import java.lang.Exception

class PhotoAdapter (var thisList : ArrayList<Photos>, var activity: Activity) : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

    override fun onBindViewHolder(itemView: ViewHolder, position: Int) {
        itemView.bindItems(thisList[position])
    }

    override fun getItemCount() = thisList.size

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_photos, parent, false)
        return ViewHolder(view)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(photo: Photos) {

            Picasso
                    .get()
                    .load(photo.thumbnailUrl)
                    .placeholder(R.drawable.ic_image_24dp)
                    .error(R.drawable.ic_image_24dp)
                    .into(itemView.imgPhoto, object : Callback {
                        override fun onSuccess() {
                            itemView.progressBarPhotoLoading.visibility = View.GONE
                        }

                        override fun onError(e: Exception?) {

                        }
                    } )

        }

    }

    fun addPhotos(newList: List<Photos>) {
        thisList.addAll(newList)
        notifyDataSetChanged()
    }

}