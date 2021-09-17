package com.example.intech

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class NewsDataAdapter(private val listNews: ArrayList<News>) : RecyclerView.Adapter<NewsDataAdapter.NewsViewHolder>() {

    private lateinit var onNewsClickCallback: OnNewsClickCallback

    interface OnNewsClickCallback {
        fun onNewsClicked(data: News)
    }

    fun setOnNewsClickCallback(onItemClickCallback: OnNewsClickCallback) {
        this.onNewsClickCallback = onItemClickCallback
    }

    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_news_title)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_news_description)
        var tvDateAuthor: TextView = itemView.findViewById(R.id.tv_news_date_author)
        var imgPicture: ImageView = itemView.findViewById(R.id.img_news_picture)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = listNews[position]

        Glide.with(holder.itemView.context)
            .load(news.picture)
            .apply(RequestOptions().override(90, 90))
            .into(holder.imgPicture)

        holder.tvTitle.text = news.title
        holder.tvDescription.text = news.description
        holder.tvDateAuthor.text = news.date_author

        holder.itemView.setOnClickListener { onNewsClickCallback.onNewsClicked(listNews[holder.absoluteAdapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listNews.size
    }
}