package com.tfg.lr.roleroll.controladores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tfg.lr.roleroll.CardAdapter
import com.tfg.lr.roleroll.PjClickListener
import com.tfg.lr.roleroll.alfombra.Personaje
import com.tfg.lr.roleroll.alfombra.listaPjs
import com.tfg.lr.roleroll.databinding.ActivityListaPersonajesBinding

class ListaPersonajes : AppCompatActivity(), PjClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityListaPersonajesBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setRecyclerView(binding, this)

        setOnclicListeners(binding)


    }
    private fun setOnclicListeners(binding: ActivityListaPersonajesBinding) {
        binding.bttnCrearPj.setOnClickListener {
            val intent = Intent(this, FichaPersonaje::class.java)
            startActivity(intent)
        }

    }

    private fun setRecyclerView(
        binding: ActivityListaPersonajesBinding,
        mainActivity: ListaPersonajes
    ) {
        val adapter = CardAdapter(listaPjs, mainActivity)

        binding.rvLista.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding.rvLista.adapter = adapter

    }

    override fun cardOnClickListener(pj: Personaje) {
        val intent = Intent(this, FichaPersonaje::class.java)
        intent.putExtra("idPj", pj.id)
        startActivity(intent)

    }

}