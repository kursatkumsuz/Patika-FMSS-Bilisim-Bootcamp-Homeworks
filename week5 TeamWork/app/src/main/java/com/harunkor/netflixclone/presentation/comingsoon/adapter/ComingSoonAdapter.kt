package com.harunkor.netflixclone.presentation.comingsoon.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.harunkor.netflixclone.R
import com.harunkor.netflixclone.domain.model.comingsoon.ComingSoonModel


class ComingSoonAdapter(
    private val comingSoonModel: ComingSoonModel,
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val comingSoonBinding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context),
            R.layout.recyclerview_coming_soon_item,
            parent,
            false
        )

        return ComingSoonAdapterViewHolder(comingSoonBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ComingSoonAdapterViewHolder).comingSoonBind(comingSoonModel.items[position])

    }

    override fun getItemCount(): Int {
        return comingSoonModel.items.size
    }


}