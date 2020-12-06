package com.example.grancentreapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerAdapter(val movies: List<movies>) : RecyclerView.Adapter<RecyclerAdapter.ImageViewHolder>() {

    private lateinit var view1: View

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        view1 = LayoutInflater.from(parent.context).inflate(R.layout.movie_layout, parent, false)
        return ImageViewHolder(view1)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.tvDesc.text = movies[position].desc
        holder.tvTitle.text = movies[position].titulo
        Glide.with(view1).load(movies[position].url).into(holder.imgMovie)
    }

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView
        var tvDesc: TextView
        var imgMovie: ImageView

        init {
            tvTitle = itemView.findViewById(R.id.title)
            tvDesc = itemView.findViewById(R.id.desc)
            imgMovie = itemView.findViewById(R.id.imgMovie)
        }
    }


}
