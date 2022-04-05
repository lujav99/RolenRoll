package com.tfg.lr.roleroll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class RegistroUsuario : AppCompatActivity(), View.OnClickListener {

    private lateinit var etxtRegisEmail: EditText
    private lateinit var etxtRegisContrasenna1: EditText
    private lateinit var etxtRegisContrasenna2: EditText

    private lateinit var bttnRegistrar: Button
    private lateinit var bttnIrALogIn: Button

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_usuario)

        etxtRegisEmail = findViewById(R.id.etxtRegisEmail)
        etxtRegisContrasenna1 = findViewById(R.id.etxtRegisContrasenna1)
        etxtRegisContrasenna2 = findViewById(R.id.etxtRegisContrasenna2)
        bttnRegistrar = findViewById(R.id.bttnRegistrar)
        bttnIrALogIn = findViewById(R.id.bttnIrALogIn)

        bttnRegistrar.setOnClickListener(this)
        bttnIrALogIn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        TODO("Not yet implemented")
        when (view?.id) {
            R.id.bttnRegistrar-> {
                registrar()
            }

            R.id.bttnIrALogIn-> {
                startActivity(Intent(this, LogInUsuario::class.java))
                finish()
            }
        }
    }

    private fun registrar() {
        var email = etxtRegisEmail.text.toString()
        var contrasenna1 = etxtRegisContrasenna1.text.toString()
        var contrasenna2 = etxtRegisContrasenna2.text.toString()

        if (contrasenna1.equals(contrasenna2) && chechEmpty(email, contrasenna1, contrasenna2)) {
            auth.createUserWithEmailAndPassword(email,contrasenna1)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                    } else {
                        hacerToast("Algo salió mal")
                    }

                }
        }
    }

    private fun chechEmpty(email: String, contrasenna1: String, contrasenna2: String): Boolean {
        return email.isNotEmpty() && contrasenna1.isNotEmpty() && contrasenna2.isNotEmpty()
    }

    private fun hacerToast(mensaje: String) {
        Toast.makeText(applicationContext, mensaje, Toast.LENGTH_SHORT).show()
    }
}
