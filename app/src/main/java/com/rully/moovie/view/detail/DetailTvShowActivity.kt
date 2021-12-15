package com.rully.moovie.view.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.rully.moovie.R
import com.rully.moovie.data.FilmEntity
import com.rully.moovie.databinding.ActivityDetailTvShowBinding

class DetailTvShowActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailTvShowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTvShowBinding.inflate(layoutInflater)
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
            val filmId = extras.getString(EXTRA_TV_SHOW)
            if (filmId != null) {
                viewModel.selected(filmId)
                populateMovie(viewModel.getDetailTvShow())
            }

        }

    }

    private fun populateMovie(movie: FilmEntity?) {
        binding.apply {
            tvTitle.text = movie?.title
            tvReleaseDate.text = movie?.release_date
            tvDesc.text = movie?.overview
            Glide.with(this@DetailTvShowActivity)
                .load(movie?.poster)
                .into(ivPoster)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    companion object {
        const val EXTRA_TV_SHOW = "extra_tv_show"
    }
}