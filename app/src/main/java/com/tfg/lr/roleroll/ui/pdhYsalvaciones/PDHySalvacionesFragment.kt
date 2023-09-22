package com.tfg.lr.roleroll.ui.pdhYsalvaciones

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tfg.lr.roleroll.alfombra.Personaje
import com.tfg.lr.roleroll.databinding.FragmentPdhSalvacionesBinding
import com.tfg.lr.roleroll.ui.habilidades.HabilidadesFragment
import java.lang.Exception

class PDHySalvacionesFragment : Fragment() {

    companion object {
        var puntosEditables = false
    }

    private lateinit var pj: Personaje

    private var _binding: FragmentPdhSalvacionesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(PDHySalvacionesViewModel::class.java)

        _binding = FragmentPdhSalvacionesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        habilitarPuntos(HabilidadesFragment.puntosEditables)
        rellenarTablas()
        return root
    }

    private fun rellenarTablas() {
        tablaDePuntosDeHabilidad()
        tablaDeSalvaciones()
    }

    private fun tablaDePuntosDeHabilidad() {

        binding.txtvSTRTotal.setText(
            hacerTotalHabilidades(
                controlDeVaciosYParseadorInt(binding.txtvSTRBase.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSTRMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSTRTemp.getText().toString())
            ).toString()
        )
        binding.txtvSTRMod.setText(((controlDeVaciosYParseadorInt(binding.txtvSTRTotal.getText().toString())-10)/2).toString())

        binding.txtvDEXTotal.setText(
            hacerTotalHabilidades(
                controlDeVaciosYParseadorInt(binding.txtvDEXBase.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtDEXMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtDEXTemp.getText().toString())
            ).toString()
        )
        binding.txtvDEXMod.setText(((controlDeVaciosYParseadorInt(binding.txtvDEXTotal.getText().toString())-10)/2).toString())

        binding.txtvCONTotal.setText(
            hacerTotalHabilidades(
                controlDeVaciosYParseadorInt(binding.txtvCONBase.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtCONMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtCONTemp.getText().toString())
            ).toString()
        )
        binding.txtvCONMod.setText(((controlDeVaciosYParseadorInt(binding.txtvCONTotal.getText().toString())-10)/2).toString())

        binding.txtvINTTotal.setText(
            hacerTotalHabilidades(
                controlDeVaciosYParseadorInt(binding.txtvINTBase.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtINTMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtINTTemp.getText().toString())
            ).toString()
        )
        binding.txtvINTMod.setText(((controlDeVaciosYParseadorInt(binding.txtvINTTotal.getText().toString())-10)/2).toString())

        binding.txtvWISTotal.setText(
            hacerTotalHabilidades(
                controlDeVaciosYParseadorInt(binding.txtvWISBase.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtWISMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtWISTemp.getText().toString())
            ).toString()
        )
        binding.txtvWISMod.setText(((controlDeVaciosYParseadorInt(binding.txtvWISTotal.getText().toString())-10)/2).toString())

        binding.txtvCHATotal.setText(
            hacerTotalHabilidades(
                controlDeVaciosYParseadorInt(binding.txtvCHABase.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtCHAMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtCHATemp.getText().toString())
            ).toString()
        )
        binding.txtvCHAMod.setText(((controlDeVaciosYParseadorInt(binding.txtvCHATotal.getText().toString())-10)/2).toString())
    }

    private fun tablaDeSalvaciones() {

        binding.txtvFortitudeMod.setText(binding.txtvCONMod.getText().toString())
        binding.txtvFortitudeTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvFortitudeBase.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvFortitudeMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtFortitudeMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtFortitudeTemp.getText().toString())
            ).toString()
        )


        binding.txtvReflexMod.setText(binding.txtvDEXMod.getText().toString())
        binding.txtvReflexTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvReflexBase.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvReflexMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtReflexMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtReflexTemp.getText().toString())
            ).toString()
        )


        binding.txtvWillMod.setText(binding.txtvDEXMod.getText().toString())
        binding.txtvWillTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvWillBase.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvWillMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtWillMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtWillTemp.getText().toString())
            ).toString()
        )
    }

    private fun controlDeVaciosYParseadorInt(cadena: String): Int {
        var num :Int = 0
        try {
            num = Integer.parseInt(cadena)
        } catch (e: Exception) {
            num = 10
        } finally {
            return num
        }
    }

    private fun hacerTotalHabilidades(num2: Int, num3: Int, num4: Int): Int {
        return num2 + num3 + num4
    }

    private fun hacerTotal(num1: Int, num2: Int, num3: Int, num4: Int): Int {
        return num1 + num2 + num3 + num4
    }

    private fun habilitarPuntos(valor: Boolean) {
        binding.txtvSTRBase.isEnabled = valor
        binding.txtvDEXBase.isEnabled = valor
        binding.txtvCONBase.isEnabled = valor
        binding.txtvINTBase.isEnabled = valor
        binding.txtvWISBase.isEnabled = valor
        binding.txtvCHABase.isEnabled = valor

        binding.txtvFortitudeBase.isEnabled = valor
        binding.txtvReflexBase.isEnabled = valor
        binding.txtvWillBase.isEnabled = valor

    }

    private fun rellenarFragment() {
        binding.txtvSTRBase.setText(pj.baseSTR)
        binding.etxtSTRMisc.setText(pj.miscSTR)
        binding.txtvDEXBase.setText(pj.baseDEX)
        binding.etxtDEXMisc.setText(pj.miscDEX)
        binding.txtvCONBase.setText(pj.baseCON)
        binding.etxtCONMisc.setText(pj.miscCON)
        binding.txtvINTBase.setText(pj.baseINT)
        binding.etxtINTMisc.setText(pj.miscINT)
        binding.txtvWISBase.setText(pj.baseWIS)
        binding.etxtWISMisc.setText(pj.miscWIS)
        binding.txtvCHABase.setText(pj.baseCHA)
        binding.etxtCHAMisc.setText(pj.miscCHA)

        binding.txtvFortitudeBase.setText(pj.baseFortitude)
        binding.etxtFortitudeMisc.setText(pj.miscFortitude)
        binding.txtvReflexBase.setText(pj.baseReflex)
        binding.etxtReflexMisc.setText(pj.miscReflex)
        binding.txtvWillBase.setText(pj.baseWill)
        binding.etxtWillMisc.setText(pj.miscWill)

    }

    private fun rellenarPj() {
        pj.baseSTR = binding.txtvSTRBase.text.toString().toInt()
        pj.miscSTR = binding.etxtSTRMisc.text.toString().toInt()
        pj.baseDEX = binding.txtvDEXBase.text.toString().toInt()
        pj.miscDEX = binding.etxtDEXMisc.text.toString().toInt()
        pj.baseCON = binding.txtvCONBase.text.toString().toInt()
        pj.miscCON = binding.etxtCONMisc.text.toString().toInt()
        pj.baseINT = binding.txtvINTBase.text.toString().toInt()
        pj.miscINT = binding.etxtINTMisc.text.toString().toInt()
        pj.baseWIS = binding.txtvWISBase.text.toString().toInt()
        pj.miscWIS = binding.etxtWISMisc.text.toString().toInt()
        pj.baseCHA = binding.txtvCHABase.text.toString().toInt()
        pj.miscCHA = binding.etxtCHAMisc.text.toString().toInt()

        pj.baseFortitude = binding.txtvFortitudeBase.text.toString().toInt()
        pj.miscFortitude = binding.etxtFortitudeMisc.text.toString().toInt()
        pj.baseReflex = binding.txtvReflexBase.text.toString().toInt()
        pj.miscReflex = binding.etxtReflexMisc.text.toString().toInt()
        pj.baseWill = binding.txtvWillBase.text.toString().toInt()
        pj.miscWill = binding.etxtWillMisc.text.toString().toInt()

    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}