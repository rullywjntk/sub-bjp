package com.rully.moovie.view.detail

import com.rully.moovie.utils.DataDummy
import junit.framework.Assert
import org.junit.Before
import org.junit.Test

class DetailViewModelTest {
    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val dummyTvShow = DataDummy.generateDummyTvShow()[0]
    private val id = dummyMovie.id

    @Before
    fun setUp() {
        viewModel = DetailViewModel()
        viewModel.selected(id)
    }

    @Test
    fun getDetailMovie() {
        viewModel.selected(dummyMovie.id)
        val movie = viewModel.getDetailMovie()
        Assert.assertNotNull(movie)
        Assert.assertEquals(dummyMovie.id, movie.id)
        Assert.assertEquals(dummyMovie.title, movie.title)
        Assert.assertEquals(dummyMovie.poster, movie.poster)
        Assert.assertEquals(dummyMovie.release_date, movie.release_date)
        Assert.assertEquals(dummyMovie.overview, movie.overview)
    }

    @Test
    fun getDetailTvShow() {
        viewModel.selected(dummyTvShow.id)
        val tvShow = viewModel.getDetailTvShow()
        Assert.assertNotNull(tvShow)
        Assert.assertEquals(dummyTvShow.id, tvShow.id)
        Assert.assertEquals(dummyTvShow.title, tvShow.title)
        Assert.assertEquals(dummyTvShow.poster, tvShow.poster)
        Assert.assertEquals(dummyTvShow.release_date, tvShow.release_date)
        Assert.assertEquals(dummyTvShow.overview, tvShow.overview)
    }

}