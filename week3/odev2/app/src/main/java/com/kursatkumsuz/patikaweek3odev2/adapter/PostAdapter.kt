package com.kursatkumsuz.patikaweek3odev2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kursatkumsuz.patikaweek3odev2.databinding.ListItemBinding
import com.kursatkumsuz.patikaweek3odev2.model.PostModel

class PostAdapter(val postList: ArrayList<PostModel>) :
    RecyclerView.Adapter<PostAdapter.ViewHolder>() {
    class ViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.titleText.text = postList[position].title
        holder.binding.imageView.setImageResource(postList[position].image)
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}