package com.rully.moovie.data


data class FilmEntity(
    var id: String,
    var title: String,
    var release_date: String,
    var poster: Int,
    var overview: String
)
