package com.harunkor.netflixclone.presentation.mostpopulermovies.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.harunkor.netflixclone.R
import com.harunkor.netflixclone.domain.model.mostpopulermovies.MostPopularMoviesModel

class MostPopularMoviesAdapter(
    private val mostPopularMoviesModel: MostPopularMoviesModel
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val mostPopularMoviesBinding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context), R.layout.default_item_row, parent, false
        )
        return MostPopularMoviesAdapterViewHolder(mostPopularMoviesBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MostPopularMoviesAdapterViewHolder).MostPopulerMoviewAdapterBind(
            mostPopularMoviesModel.items[position])
    }

    override fun getItemCount(): Int {
        return mostPopularMoviesModel.items.size
    }
}