package com.tfg.lr.roleroll.alfombra

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.google.firebase.firestore.FirebaseFirestore

class Reutilizables {

    companion object {
        // cosa de clase con metodos estaticos

        val db = FirebaseFirestore.getInstance()

        fun hacerToast( applicationContext: Context, mensaje: String) {
            Toast.makeText(applicationContext, mensaje, Toast.LENGTH_SHORT).show()
        }

    }
}