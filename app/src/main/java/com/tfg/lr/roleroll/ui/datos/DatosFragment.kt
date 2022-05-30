package com.tfg.lr.roleroll.ui.datos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tfg.lr.roleroll.alfombra.Personaje
import com.tfg.lr.roleroll.databinding.FragmentDatosBinding
import com.tfg.lr.roleroll.ui.habilidades.HabilidadesFragment

class DatosFragment : Fragment() {

    private lateinit var pj:Personaje

    private var _binding: FragmentDatosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var raza: String? = null
    private var razaPosicion: Int = 0
    private var clase: String? = null
    private var clasePosicion: Int = 0
    private var tamanno: String? = null
    private var tamannoPosicion: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(DatosViewModel::class.java)

        _binding = FragmentDatosBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        rellenarFragment(activity.getPj())

        setSpinners(binding)

        return root
    }

    private fun rellenarFragment() {
        binding.etxtNombre.setText(pj.nombre)
        binding.spinnerRaza.setSelection(getIndex(binding.spinnerRaza, raza))
        binding.spinnerClase.setSelection(getIndex(binding.spinnerClase, clase))
        binding.etxtAC.setText(pj.ac)
        binding.etxtAB.setText(pj.ab)
        binding.spinnerTamanno.setSelection(getIndex(binding.spinnerTamanno, tamanno))
        binding.etxtHabilidadesRaza.setText(pj.habilidadesRaza)
        binding.etxtHabilidadesClase.setText(pj.habilidadesClase)
        binding.etxtDotes.setText(pj.dotes)
        binding.etxtInventario.setText(pj.inventario)
        binding.etxtLenguajes.setText(pj.lenguajes)
        binding.etxtOtros.setText(pj.otros)
    }

    private fun rellenarPj() {
        pj.nombre = binding.etxtNombre.text.toString()
        pj.raza = raza
        pj.clase = clase
        pj.ac = binding.etxtAC.text.toString().toInt()
        pj.ab = binding.etxtAB.text.toString().toInt()
        pj.tamanno = tamanno
        pj.habilidadesRaza = binding.etxtHabilidadesRaza.text.toString()
        pj.habilidadesClase = binding.etxtHabilidadesClase.text.toString()
        pj.dotes = binding.etxtDotes.text.toString()
        pj.inventario = binding.etxtInventario.text.toString()
        pj.lenguajes = binding.etxtLenguajes.text.toString()
        pj.otros = binding.etxtOtros .text.toString()

    }

    private fun getIndex(spinner: Spinner, cosa: String?): Int {
        var num: Int = 0

        for (i in 0..spinner.getCount()) {
            if (spinner.getItemAtPosition(i).toString().equals(cosa)) {
                    num = i
                }
        }

        return num
    }

    private fun setSpinners(binding: FragmentDatosBinding) {
        setSpinnerRaza(binding)
        setSpinnerClase(binding)
        setSpinnerTamanno(binding)
    }

    private fun setSpinnerRaza(binding: FragmentDatosBinding) {
        // Create an ArrayAdapter using the string array and a default spinner layout
        binding.spinnerRaza.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                raza = adapterView?.getItemAtPosition(position).toString()
                razaPosicion = position
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }

    private fun setSpinnerClase(binding: FragmentDatosBinding) {
        binding.spinnerClase.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                clase = adapterView?.getItemAtPosition(position).toString()
                clasePosicion = position
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }

    private fun setSpinnerTamanno(binding: FragmentDatosBinding) {
        binding.spinnerTamanno.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tamanno = adapterView?.getItemAtPosition(position).toString()
                tamannoPosicion = position
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