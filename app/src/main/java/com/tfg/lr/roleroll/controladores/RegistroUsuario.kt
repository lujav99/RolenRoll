package com.tfg.lr.roleroll.controladores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.tfg.lr.roleroll.R
import com.tfg.lr.roleroll.alfombra.Reutilizables

class RegistroUsuario : AppCompatActivity() {

    private lateinit var etxtRegisEmail: EditText
    private lateinit var etxtRegisContrasenna1: EditText
    private lateinit var etxtRegisContrasenna2: EditText

    private lateinit var bttnRegistrar: Button
    private lateinit var bttnIrALogIn: Button

//    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_usuario)

        etxtRegisEmail = findViewById(R.id.etxtRegisEmail)
        etxtRegisContrasenna1 = findViewById(R.id.etxtRegisContrasenna1)
        etxtRegisContrasenna2 = findViewById(R.id.etxtRegisContrasenna2)
        bttnRegistrar = findViewById(R.id.bttnRegistrar)
        bttnIrALogIn = findViewById(R.id.bttnIrALogIn)

        bttnRegistrar.setOnClickListener {
            registrar()
        }
        bttnIrALogIn.setOnClickListener{
            startActivity(Intent(this, LogInUsuario::class.java))
            finish()
        }
    }

    private fun registrar() {
        var email = etxtRegisEmail.text.toString()
        var contrasenna1 = etxtRegisContrasenna1.text.toString()
        var contrasenna2 = etxtRegisContrasenna2.text.toString()

        if (contrasenna1.equals(contrasenna2) && chechEmpty(email, contrasenna1, contrasenna2)) {

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, contrasenna1)
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        startActivity(Intent(this, FichaPersonaje::class.java))
                        finish()
                    } else {
                        Reutilizables.hacerToast(this, "MAL")
                    }
                }


//            auth.createUserWithEmailAndPassword(email,contrasenna1)
//                .addOnCompleteListener(this) { task ->
//                    if (task.isSuccessful) {
//                        startActivity(Intent(this, MainActivity::class.java))
//                        finish()
//                    } else {
//                        Reutilizables.hacerToast(this, "Algo salió mal")
//                    }
//
//                }
        }else {
            if (contrasenna1.equals(contrasenna2)) {
                Reutilizables.hacerToast(this, "La contraseña debe ser la misma")
            } else {
                Reutilizables.hacerToast(this, "Rellena todos los campos")
            }
        }
    }

    private fun chechEmpty(email: String, contrasenna1: String, contrasenna2: String): Boolean {
        return email.isNotEmpty() && contrasenna1.isNotEmpty() && contrasenna2.isNotEmpty()
    }


}
