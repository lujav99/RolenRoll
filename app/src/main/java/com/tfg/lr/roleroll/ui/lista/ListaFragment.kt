package com.tfg.lr.roleroll.ui.lista

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tfg.lr.roleroll.CardAdapter
import com.tfg.lr.roleroll.PjClickListener
import com.tfg.lr.roleroll.alfombra.Personaje
import com.tfg.lr.roleroll.alfombra.listaPjs
import com.tfg.lr.roleroll.controladores.FichaPersonaje
import com.tfg.lr.roleroll.databinding.FragmentListaBinding

class ListaFragment : Fragment(), PjClickListener {

    private var _binding: FragmentListaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(ListaViewModel::class.java)

        _binding = FragmentListaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        setRecyclerView(binding, this)

        setOnclicListeners(binding)



        return root
    }

    override fun cardOnClickListener(pj: Personaje) {
        val intent = Intent(context, FichaPersonaje::class.java)
        intent.putExtra("idPj", pj.id)
        startActivity(intent)

    }

    private fun setOnclicListeners(binding: FragmentListaBinding) {


    }

    private fun setRecyclerView(binding: FragmentListaBinding, mainActivity: ListaFragment) {
        val adapter = CardAdapter(listaPjs, mainActivity)

        binding.rvLista.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.rvLista.adapter = adapter

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}