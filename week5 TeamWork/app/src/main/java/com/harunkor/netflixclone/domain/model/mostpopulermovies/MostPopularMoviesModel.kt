package com.harunkor.netflixclone.domain.model.mostpopulermovies

data class MostPopularMoviesModel(
    val errorMessage: String,
    val items: List<MostPopularMoviesItem>
)