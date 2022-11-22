package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.parques.databinding.ActivityEditParkBinding

class EditParkActivity : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEditParkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.guardar.setOnClickListener{
            val TAG="Informacion"

            Log.d(TAG, "El nombre es ${binding.nombre.text}")
            Log.d(TAG, "El descripcion es ${binding.descripcion.text}")
            Log.d(TAG, "El telefono es ${binding.telefono.text}")
            Log.d(TAG, "El sitioWeb es ${binding.webSite.text}")
            Log.d(TAG, "La apertura es ${binding.horaApertura.selectedItem}")
            Log.d(TAG, "El cierre es ${binding.horaCierre.selectedItem}")

            if (binding.deportes.isChecked) {
                Log.d(TAG, "Las actividades elegida es ${binding.deportes.text}")
            }
            if (binding.mascotas.isChecked) {
                Log.d(TAG, "Las actividades elegida es ${binding.mascotas.text}")
            }
            if (binding.parqueInfantil.isChecked) {
                Log.d(TAG, "Las actividades elegida es ${binding.parqueInfantil.text}")
            }
            if (binding.restaurante.isChecked) {
                Log.d(TAG, "Las actividades elegida es ${binding.restaurante.text}")
            }


        }
    }


}