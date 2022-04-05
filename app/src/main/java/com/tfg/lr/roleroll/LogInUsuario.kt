package com.tfg.lr.roleroll

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth

class LogInUsuario : AppCompatActivity(), View.OnClickListener {

    private lateinit var etxtLogInEmail: EditText
    private lateinit var etxtLogInContrasenna: EditText

    private lateinit var bttnLogIn: Button
    private lateinit var bttnIrARegistro: Button

    private lateinit var auth: FirebaseAuth

    private lateinit var email: String
    private lateinit var contrasenna: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_usuario)

        etxtLogInEmail = findViewById(R.id.etxtLogInEmail)
        etxtLogInContrasenna = findViewById(R.id.etxtLogInContrasenna)
        bttnLogIn = findViewById(R.id.bttnLogIn)
        bttnIrARegistro = findViewById(R.id.bttnIrARegistro)

        bttnLogIn.setOnClickListener(this)
        bttnIrARegistro.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        TODO("Not yet implemented")
        when (view?.id) {
            R.id.bttnLogIn-> {
                logear();
            }

            R.id.bttnIrARegistro-> {
                startActivity(Intent(this, LogInUsuario::class.java))
                finish()
            }
        }
    }

    private fun logear() {
        TODO("Not yet implemented")
        email = etxtLogInEmail.text.toString()
        contrasenna = etxtLogInContrasenna.text.toString()

        if (checkEmpty(email, contrasenna)) {
            auth.signInWithEmailAndPassword(email,contrasenna)
                .addOnCompleteListener(this){ task->
                    startActivity(Intent(this, LogInUsuario::class.java))
                }
        }
    }


    private fun checkEmpty(email: String, contrasenna: String): Boolean {
        return email.isNotEmpty() && contrasenna.isNotEmpty()
    }


}