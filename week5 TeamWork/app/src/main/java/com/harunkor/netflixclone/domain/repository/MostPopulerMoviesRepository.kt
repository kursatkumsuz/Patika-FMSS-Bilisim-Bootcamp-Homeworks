package com.harunkor.netflixclone.domain.repository

import com.harunkor.netflixclone.domain.model.mostpopulermovies.MostPopularMoviesModel
import retrofit2.Call

interface MostPopulerMoviesRepository {

    fun getMostPopulerMovies(apiKey: String): Call<MostPopularMoviesModel>

}