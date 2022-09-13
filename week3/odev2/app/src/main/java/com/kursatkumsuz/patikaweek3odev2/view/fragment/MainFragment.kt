package com.kursatkumsuz.patikaweek3odev2.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kursatkumsuz.patikaweek3odev2.R
import com.kursatkumsuz.patikaweek3odev2.adapter.PostAdapter
import com.kursatkumsuz.patikaweek3odev2.constants.PostConstants
import com.kursatkumsuz.patikaweek3odev2.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: PostAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
    }

    /**
     * sets an adapter for RecyclerView
     * sets LayoutManager for RecyclerView
     */
    private fun initRecyclerView() {
        adapter = PostAdapter(PostConstants.getPost())

        binding.apply {
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = adapter
        }
    }
}