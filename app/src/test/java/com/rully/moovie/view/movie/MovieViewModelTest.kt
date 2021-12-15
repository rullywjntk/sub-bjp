package com.rully.moovie.view.movie

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import org.junit.Before as Before1

class MovieViewModelTest {
    private lateinit var viewModel: MovieViewModel

    @Before1
    fun setUp() {
        viewModel = MovieViewModel()
    }

    @Test
    fun getMovie() {
        val movie = viewModel.getMovie()
        assertNotNull(movie)
        assertEquals(10, movie.size)
    }
}