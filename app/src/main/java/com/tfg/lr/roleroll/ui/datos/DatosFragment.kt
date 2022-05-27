package com.tfg.lr.roleroll.ui.datos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tfg.lr.roleroll.alfombra.Personaje
import com.tfg.lr.roleroll.databinding.FragmentNotificationsBinding

class DatosFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var raza: String? = null
    private var clase: String? = null
    private var tamanno: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(DatosViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        rellenarFragment(activity.getPj())

        setSpinners(binding)

        return root
    }

    private fun rellenarFragment(pj: Personaje) {



    }

    private fun setSpinners(binding: FragmentNotificationsBinding) {
        setSpinnerRaza(binding)
        setSpinnerClase(binding)
        setSpinnerTamanno(binding)
    }

    private fun setSpinnerRaza(binding: FragmentNotificationsBinding) {
        // Create an ArrayAdapter using the string array and a default spinner layout
        binding.spinnerRaza.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                raza = adapterView?.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }

    private fun setSpinnerClase(binding: FragmentNotificationsBinding) {
        binding.spinnerClase.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                clase = adapterView?.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }

    private fun setSpinnerTamanno(binding: FragmentNotificationsBinding) {
        binding.spinnerTamanno.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tamanno = adapterView?.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}