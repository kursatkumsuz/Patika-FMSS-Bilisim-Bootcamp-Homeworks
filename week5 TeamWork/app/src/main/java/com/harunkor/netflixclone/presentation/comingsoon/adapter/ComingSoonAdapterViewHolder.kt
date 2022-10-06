package com.harunkor.netflixclone.presentation.comingsoon.adapter

import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.recyclerview.widget.RecyclerView
import com.harunkor.netflixclone.databinding.ComingSoonNotificationItemBinding
import com.harunkor.netflixclone.databinding.RecyclerviewComingSoonItemBinding
import com.harunkor.netflixclone.domain.model.comingsoon.ComingSoonItem

class ComingSoonAdapterViewHolder(private val comingSoonBinding: ViewDataBinding) :
    RecyclerView.ViewHolder(comingSoonBinding.root) {

    fun comingSoonBind(comingSoonItem: ComingSoonItem) {
        comingSoonBinding as RecyclerviewComingSoonItemBinding
        comingSoonBinding.setVariable(BR.comingSoonItem, comingSoonItem)
    }


}