package com.tfg.lr.roleroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner

class CrearPersonaje : AppCompatActivity() {

    private lateinit var etxtNombrePj: EditText

    private lateinit var spinnerRazaPj: Spinner
    private lateinit var spinnerClasePj: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_personaje)

        spinnerRazaPj = findViewById(R.id.spinnerRazaPj)
        spinnerClasePj = findViewById(R.id.spinnerClasePj)

        ArrayAdapter.createFromResource(
            this,
            R.array.Raza,
            android.R.layout.simple_spinner_item).also { adapter->

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            spinnerRazaPj.adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.Clase,
            android.R.layout.simple_spinner_item).also { adapter->

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            spinnerClasePj.adapter = adapter
        }

    }
}