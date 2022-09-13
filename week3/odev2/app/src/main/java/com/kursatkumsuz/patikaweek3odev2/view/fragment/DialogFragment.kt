package com.kursatkumsuz.patikaweek3odev2.view.fragment


import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.kursatkumsuz.patikaweek3odev2.R

class DialogFragment : DialogFragment() {

    /**
     * Creates an AlertDialog
     * @return Dialog
     */
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage("Are you sure to go Main Screen?")
                .setPositiveButton("Yes") { dialog, id ->
                    findNavController().apply {
                        // Navigate -> main_graph
                        navigate(R.id.action_dialogFragment_to_main_graph)
                        backQueue.clear()
                    }
                }
                .setNegativeButton("No") { dialog, id -> }
            builder.create()
        } ?: throw IllegalStateException("activity can not null")
    }
}