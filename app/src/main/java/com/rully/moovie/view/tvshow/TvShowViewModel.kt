package com.rully.moovie.view.tvshow

import androidx.lifecycle.ViewModel
import com.rully.moovie.data.FilmEntity
import com.rully.moovie.utils.DataDummy

class TvShowViewModel: ViewModel() {

    fun getTvShow() : List<FilmEntity> = DataDummy.generateDummyTvShow()

}