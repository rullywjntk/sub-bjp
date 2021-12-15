package com.rully.moovie.view.movie

import androidx.lifecycle.ViewModel
import com.rully.moovie.data.FilmEntity
import com.rully.moovie.utils.DataDummy

class MovieViewModel: ViewModel() {


    fun getMovie() : List<FilmEntity> = DataDummy.generateDummyMovie()

}