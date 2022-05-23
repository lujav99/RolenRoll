package com.tfg.lr.roleroll

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class Reutilizables {

    companion object {
        // cosa de clase con metodos estaticos
        fun hacerToast( applicationContext: Context, mensaje: String) {
            Toast.makeText(applicationContext, mensaje, Toast.LENGTH_SHORT).show()
        }
    }
}