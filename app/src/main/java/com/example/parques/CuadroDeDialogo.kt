package com.example.parques

import android.R
import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class CuadroDeDialogo : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity.let {
            val title = "Confirmacion"
            val content = "¿Está seguro de guardar los datos? "
            val builder: AlertDialog.Builder = AlertDialog.Builder(requireActivity())
            builder.setTitle(title).setMessage(content)
                .setPositiveButton(R.string.ok) { dialog, which ->
                    Toast.makeText(
                        requireActivity().applicationContext,
                        "Se han guardado los datos",
                        Toast.LENGTH_LONG
                    ).show()
                }
                .setNegativeButton(R.string.cancel) { dialog, which ->
                    Toast.makeText(
                        requireActivity().applicationContext,
                        "Se ha cancelado el guardado de datos",
                        Toast.LENGTH_LONG
                    ).show()
                }
            //Devuelve un AlertDialog
            //tal y como lo hemos definido en el builder
            return builder.create()
        } ?: throw IllegalStateException("El fragmento no está asociado a ninguna actividad")
    }
}