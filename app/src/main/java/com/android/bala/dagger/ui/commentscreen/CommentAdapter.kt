package com.android.bala.dagger.ui.commentscreen

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.bala.dagger.R
import com.android.bala.dagger.model.comment.Comment
import com.android.bala.dagger.utils.AppLog
import kotlinx.android.synthetic.main.item_comment.view.*

class CommentAdapter  (var thisList : ArrayList<Comment>, var activity: Activity) : RecyclerView.Adapter<CommentAdapter.ViewHolder>() {

    override fun onBindViewHolder(itemView: ViewHolder, position: Int) {
        itemView.bindItems(thisList[position])
    }

    override fun getItemCount() = thisList.size

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comment, parent, false)
        return ViewHolder(view)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(comment: Comment) {

            itemView.tvComment.text = comment.body

        }

    }

    fun addComment(newList : List<Comment>){
        thisList.addAll(newList)
        notifyDataSetChanged()
    }

}