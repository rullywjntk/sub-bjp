package com.rully.moovie.view.detail

import androidx.lifecycle.ViewModel
import com.rully.moovie.data.FilmEntity
import com.rully.moovie.utils.DataDummy

class DetailViewModel: ViewModel() {

    private lateinit var id: String

    fun selected(id: String) {
        this.id = id
    }

    fun getDetailMovie() : FilmEntity {
        lateinit var movie : FilmEntity
        val movieEntity = DataDummy.generateDummyMovie()
        for (movies in movieEntity) {
            if (movies.id == id) {
                movie = movies
            }
        }

        return movie
    }

    fun getDetailTvShow() : FilmEntity {
        lateinit var tvShow : FilmEntity
        val tvShowData = DataDummy.generateDummyTvShow()
        for (tvShows in tvShowData) {
            if (tvShows.id == id) {
                tvShow = tvShows
            }
        }
        return tvShow
    }

}