package com.tfg.lr.roleroll

import androidx.recyclerview.widget.RecyclerView
import com.tfg.lr.roleroll.alfombra.Personaje
import com.tfg.lr.roleroll.databinding.CardPjBinding

class CardViewHolder(
    private val binding: CardPjBinding,
    private val clickListener: PjClickListener
) :RecyclerView.ViewHolder(binding.root) {

    fun bindPj(pj: Personaje) {

        binding.txtvNombrePj.text = pj.nombre
        binding.txtvRazaPj.text = pj.raza
        binding.txtvClasePj.text = pj.clase
        binding.txtvNivelPj.text = pj.nivel.toString()

        binding.cardView.setOnClickListener {
            clickListener.cardOnClickListener(pj)
        }

    }
}