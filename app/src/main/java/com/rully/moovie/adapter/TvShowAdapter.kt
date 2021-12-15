package com.rully.moovie.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rully.moovie.data.FilmEntity
import com.rully.moovie.databinding.ItemsMovieBinding
import com.rully.moovie.view.detail.DetailTvShowActivity

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.ViewHolder>() {

    private var listTvShow = ArrayList<FilmEntity>()

    fun setMovies(movies: List<FilmEntity>?) {
        if (movies == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(movies)
    }

    class ViewHolder(private val binding: ItemsMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: FilmEntity) {
            with(binding) {
                tvTitle.text = tvShow.title
                tvDuration.text = tvShow.release_date
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTvShowActivity::class.java)
                    intent.putExtra(DetailTvShowActivity.EXTRA_TV_SHOW, tvShow.id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(tvShow.poster)
                    .centerCrop()
                    .into(iVNewUpload)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemsMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listTvShow[position])
    }

    override fun getItemCount(): Int = listTvShow.size
}