package com.harunkor.netflixclone.presentation.mostpopulermovies.adapter

import android.widget.Toast
import androidx.core.content.contentValuesOf
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.recyclerview.widget.RecyclerView
import com.harunkor.netflixclone.databinding.DefaultItemRowBinding
import com.harunkor.netflixclone.domain.model.mostpopulermovies.MostPopularMoviesItem

class MostPopularMoviesAdapterViewHolder(private var mostPopularMoviesBinding: ViewDataBinding) :
    RecyclerView.ViewHolder(mostPopularMoviesBinding.root) {

    fun MostPopulerMoviewAdapterBind(mostPopularMoviesItem: MostPopularMoviesItem) {

        mostPopularMoviesBinding as DefaultItemRowBinding
        mostPopularMoviesBinding.setVariable(BR.mostPopulerMoviesItem, mostPopularMoviesItem)

        (mostPopularMoviesBinding as DefaultItemRowBinding).root.setOnClickListener {
            Toast.makeText(itemView.context, mostPopularMoviesItem.title, Toast.LENGTH_SHORT).show()
        }
    }
}