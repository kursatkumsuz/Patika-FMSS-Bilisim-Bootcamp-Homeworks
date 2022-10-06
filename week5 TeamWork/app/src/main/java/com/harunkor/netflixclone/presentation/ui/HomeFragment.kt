package com.harunkor.netflixclone.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.harunkor.netflixclone.R
import com.harunkor.netflixclone.databinding.FragmentHomeBinding
import com.harunkor.netflixclone.presentation.mostpopulermovies.MostPopulerMoviesViewModel
import com.harunkor.netflixclone.presentation.mostpopulermovies.adapter.MostPopularMoviesAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val mostPopularMoviesViewModel: MostPopulerMoviesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    private fun init() {
        getMostPopulerMovies()
    }

    private fun getMostPopulerMovies() {
        mostPopularMoviesViewModel.getMostPopulerMovies()
            .observe(viewLifecycleOwner) { mostPopularMovies ->
                val mostPopularMoviesAdapter = MostPopularMoviesAdapter(mostPopularMovies)
                val linearLayoutManager =
                    LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                binding.mostPopularMoviesRecyclerview.layoutManager = linearLayoutManager
                binding.mostPopularMoviesRecyclerview.adapter = mostPopularMoviesAdapter

            }

    }


}