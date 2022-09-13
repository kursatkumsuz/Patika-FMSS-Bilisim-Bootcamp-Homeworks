package com.kursatkumsuz.patikaweek3odev1

import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.kursatkumsuz.patikaweek3odev1.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private var numb = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            increaseButton.setOnClickListener {
                numb++
                displayText()
                startAnim()
            }
            decreaseButton.setOnClickListener {
                numb--
                displayText()
                startAnim()
            }
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        //if it's not null, gets number variable
        savedInstanceState?.let {
            numb = it.getInt("number", 0)
            displayText()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        //saves numb variable
        outState.putInt("number", numb)
    }

    /**
     * sets value of [numb] to TextView
     * converts [numb] into string
     */
    private fun displayText() {
        binding.numbText.text = numb.toString()
    }

    /**
     * initializes an animation for TextView
     * starts animation of the TextView
     */
    private fun startAnim() {
        val bounceAnim = AnimationUtils.loadAnimation(context, R.anim.bounce_anim)
        binding.numbText.startAnimation(bounceAnim)
    }
}