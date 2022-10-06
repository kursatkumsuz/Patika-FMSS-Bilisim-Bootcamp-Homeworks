package com.harunkor.netflixclone.domain.usecase

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.harunkor.netflixclone.domain.model.mostpopulermovies.MostPopularMoviesModel
import com.harunkor.netflixclone.domain.repository.MostPopulerMoviesRepository
import com.harunkor.netflixclone.utils.Constants.Companion.API_KEY
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MostPopulerMoviesUseCase @Inject constructor(private val mostPopulerMoviesRepository: MostPopulerMoviesRepository) {

    private var _mostPopulerMovies = MutableLiveData<MostPopularMoviesModel>()
    val mostPopulerMovies: LiveData<MostPopularMoviesModel> = _mostPopulerMovies

    fun getMostPopulerMovies(){
        mostPopulerMoviesRepository.getMostPopulerMovies(API_KEY).enqueue(object: Callback<MostPopularMoviesModel>{
            override fun onResponse(
                call: Call<MostPopularMoviesModel>,
                response: Response<MostPopularMoviesModel>
            ) {
                _mostPopulerMovies.value = response.body()
            }

            override fun onFailure(call: Call<MostPopularMoviesModel>, t: Throwable) {
              Log.v("ERROR",t.message.toString())
            }


        })

    }


}