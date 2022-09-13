package com.dag.odev2fmss.util

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.dag.odev2fmss.R

class CustomDialog : DialogFragment() {
    /**
     * Builds an AlertDialog
     */
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setView(requireActivity().layoutInflater.inflate(R.layout.layout_custom_dialog , null))
            .create()
}