package com.kursatkumsuz.patikaweek3odev2.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kursatkumsuz.patikaweek3odev2.R
import com.kursatkumsuz.patikaweek3odev2.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {


    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navigate -> ForgotPasswordFragment
        binding.loginButton.setOnClickListener {
            findNavController().navigate(R.id.forgetPasswordFragment)
        }
    }

}