package com.tfg.lr.roleroll.controladores

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.tfg.lr.roleroll.R
import com.tfg.lr.roleroll.alfombra.Personaje
import com.tfg.lr.roleroll.alfombra.listaPjs
import com.tfg.lr.roleroll.databinding.ActivityFichaPersonajeBinding

class FichaPersonaje : AppCompatActivity() {

    private var pj: Personaje? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityFichaPersonajeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val idPj = intent.getIntExtra("idPj", -1)
        pj = pjFromId(idPj)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_ficha_personaje)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_pdh_salvaciones,
                R.id.navigation_habilidades,
                R.id.navigation_notifications
            )
        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    private fun getPj(): Personaje? {
        return pj
    }

    private fun pjFromId(idPj: Int): Personaje? {

        for (pj in listaPjs) {
            if (pj.id == idPj)
                return pj

        }
        return null
    }
}