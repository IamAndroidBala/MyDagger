package com.android.bala.dagger.ui.postscreen

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.android.bala.dagger.R
import com.android.bala.dagger.model.post.Post
import com.android.bala.dagger.ui.commentscreen.CommentsActivity
import kotlinx.android.synthetic.main.item_post.view.*

class PostAdapter (var thisList : ArrayList<Post>, var activity: FragmentActivity) : RecyclerView.Adapter<PostAdapter.ViewHolder>() {

    override fun onBindViewHolder(itemView: ViewHolder, position: Int) {
        itemView.bindItems(thisList[position])
    }

    override fun getItemCount() = thisList.size

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return ViewHolder(view)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(post: Post) {

            itemView.tvPostHeading.text = post.title
            itemView.tvPostBody.text    = post.body

            itemView.setOnClickListener {
                activity.startActivity(Intent(activity, CommentsActivity::class.java).apply { putExtra("Post", post) })
            }
        }

    }

    fun addPost(newList : List<Post>){
       thisList.addAll(newList)
        notifyDataSetChanged()
    }

}