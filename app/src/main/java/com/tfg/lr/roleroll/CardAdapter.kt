package com.tfg.lr.roleroll

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tfg.lr.roleroll.alfombra.Personaje
import com.tfg.lr.roleroll.controladores.ListaPersonajes
import com.tfg.lr.roleroll.databinding.CardPjBinding

class CardAdapter(
    private val pjs: List<Personaje>,
    private val clickListener: ListaPersonajes
) : RecyclerView.Adapter<CardViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CardPjBinding.inflate(inflater, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindPj(pjs[position])
    }

    override fun getItemCount(): Int = pjs.size


}