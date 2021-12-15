package com.rully.moovie.view.tvshow

import junit.framework.Assert
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest {
    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTvShow() {
        val tvShow = viewModel.getTvShow()
        Assert.assertNotNull(tvShow)
        Assert.assertEquals(10, tvShow.size)
    }
}