package com.rully.moovie.view.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.rully.moovie.R
import com.rully.moovie.data.FilmEntity
import com.rully.moovie.databinding.ActivityDetailBinding

class DetailMovieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = getString(R.string.detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.setNavigationOnClickListener { onBackPressed() }

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val filmId = extras.getString(EXTRA_MOVIE)
            if (filmId != null) {
                viewModel.selected(filmId)
                populateMovie(viewModel.getDetailMovie())
            }
        }
    }

    private fun populateMovie(movie: FilmEntity) {
        binding.apply {
            tvTitle.text = movie.title
            tvReleaseDate.text = movie.release_date
            tvDesc.text = movie.overview
            Glide.with(this@DetailMovieActivity)
                .load(movie.poster)
                .into(ivPoster)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }
}