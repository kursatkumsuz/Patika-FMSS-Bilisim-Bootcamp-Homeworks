package com.kursatkumsuz.patikaweek3odev2.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kursatkumsuz.patikaweek3odev2.R
import com.kursatkumsuz.patikaweek3odev2.databinding.FragmentForgetPasswordBinding


class ForgetPasswordFragment : Fragment() {

    private lateinit var binding: FragmentForgetPasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentForgetPasswordBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navigate -> DialogFragment
        binding.mainScreenButton.setOnClickListener {
            findNavController().navigate(R.id.action_forgetPasswordFragment_to_dialogFragment)
        }
    }
}