package com.harunkor.netflixclone.presentation.mostpopulermovies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.harunkor.netflixclone.domain.model.mostpopulermovies.MostPopularMoviesModel
import com.harunkor.netflixclone.domain.usecase.MostPopulerMoviesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MostPopulerMoviesViewModel @Inject constructor(
    private val mostPopulerMoviesUseCase: MostPopulerMoviesUseCase
):ViewModel() {

    fun getMostPopulerMovies(): LiveData<MostPopularMoviesModel> {
        mostPopulerMoviesUseCase.apply {
            getMostPopulerMovies()
            return mostPopulerMovies
        }
    }

}