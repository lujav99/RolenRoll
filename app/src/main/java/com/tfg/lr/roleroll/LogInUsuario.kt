package com.tfg.lr.roleroll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth

class LogInUsuario : AppCompatActivity() {

    private lateinit var etxtLogInEmail: EditText
    private lateinit var etxtLogInContrasenna: EditText

    private lateinit var bttnLogIn: Button
    private lateinit var bttnIrARegistro: Button

    private lateinit var email: String
    private lateinit var contrasenna: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_usuario)

        etxtLogInEmail = findViewById(R.id.etxtLogInEmail)
        etxtLogInContrasenna = findViewById(R.id.etxtLogInContrasenna)
        bttnLogIn = findViewById(R.id.bttnLogIn)
        bttnIrARegistro = findViewById(R.id.bttnIrARegistro)

        bttnLogIn.setOnClickListener {
            logear();
        }
        bttnIrARegistro.setOnClickListener{
            startActivity(Intent(applicationContext, RegistroUsuario::class.java))
            finish()
        }

    }



    private fun logear() {

        email = etxtLogInEmail.text.toString()
        contrasenna = etxtLogInContrasenna.text.toString()

        if (checkEmpty(email, contrasenna)) {
            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, contrasenna)
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        startActivity(Intent(this, VerPersonaje::class.java))
                        finish()
                    } else {
                        Reutilizables.hacerToast(this, "MAL")
                    }
                }
//            autentificador.signInWithEmailAndPassword(email,contrasenna)
//                .addOnCompleteListener(this){ task->
//                    startActivity(Intent(applicationContext, VerPersonaje::class.java))
//                }
        } else {
            Reutilizables.hacerToast(this, "Rellena todos los campos")
        }
    }


    private fun checkEmpty(email: String, contrasenna: String): Boolean {
        return email.isNotEmpty() && contrasenna.isNotEmpty()
    }

}