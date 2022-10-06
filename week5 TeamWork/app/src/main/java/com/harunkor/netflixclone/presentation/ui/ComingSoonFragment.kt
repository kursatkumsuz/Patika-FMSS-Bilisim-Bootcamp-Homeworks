package com.harunkor.netflixclone.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.harunkor.netflixclone.R
import com.harunkor.netflixclone.databinding.FragmentComingSoonBinding
import com.harunkor.netflixclone.presentation.comingsoon.ComingSoonViewModel
import com.harunkor.netflixclone.presentation.comingsoon.adapter.ComingSoonAdapter
import com.harunkor.netflixclone.presentation.comingsoon.adapter.ComingSoonNotificationAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ComingSoonFragment : Fragment() {
    private lateinit var binding: FragmentComingSoonBinding
    private val comingSoonViewModel: ComingSoonViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_coming_soon, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    private fun init() {
        comingSoonData()
    }

    private fun comingSoonData() {
       comingSoonViewModel.getComingSoon().observe(viewLifecycleOwner) { comingSoonData ->
            val comingSoonAdapter = ComingSoonAdapter(comingSoonData)
            val gridLayoutManager = GridLayoutManager(context, 1)
            binding.comingSoonRecyclerview.layoutManager = gridLayoutManager
            binding.comingSoonRecyclerview.adapter = comingSoonAdapter
        }
        comingSoonViewModel.getComingSoon().observe(viewLifecycleOwner) { comingSoonData ->
            val comingSoonAdapter = ComingSoonNotificationAdapter(comingSoonData)
            val gridLayoutManager = GridLayoutManager(context, 1)
            binding.comingSoonNotification.layoutManager = gridLayoutManager
            binding.comingSoonNotification.adapter = comingSoonAdapter
        }
    }
}