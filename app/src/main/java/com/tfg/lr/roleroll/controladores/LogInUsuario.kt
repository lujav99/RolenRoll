package com.tfg.lr.roleroll.controladores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.tfg.lr.roleroll.R
import com.tfg.lr.roleroll.alfombra.Reutilizables

enum class ProviderType {
    BASIC,
    GOOGLE
}

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

        etxtLogInEmail.setText("luisramosasensio@yahoo.es")
        etxtLogInContrasenna.setText("luigi2002")

        // Guardar datos
        //val prefs = getSharedPreferences()


        bttnLogIn.setOnClickListener {
            logear();
        }
        bttnIrARegistro.setOnClickListener{
            startActivity(Intent(application, RegistroUsuario::class.java))
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
                        startActivity(Intent(this, ListaPersonajes::class.java))
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