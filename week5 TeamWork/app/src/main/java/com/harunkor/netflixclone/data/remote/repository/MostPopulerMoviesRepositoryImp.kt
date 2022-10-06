package com.harunkor.netflixclone.data.remote.repository

import com.harunkor.netflixclone.data.remote.ApiService
import com.harunkor.netflixclone.domain.model.mostpopulermovies.MostPopularMoviesModel
import com.harunkor.netflixclone.domain.repository.MostPopulerMoviesRepository
import retrofit2.Call

class MostPopulerMoviesRepositoryImp(private val apiService: ApiService): MostPopulerMoviesRepository {

    override fun getMostPopulerMovies(apiKey: String): Call<MostPopularMoviesModel> {
        return apiService.getMostPopulerMovies(apiKey)
    }
}