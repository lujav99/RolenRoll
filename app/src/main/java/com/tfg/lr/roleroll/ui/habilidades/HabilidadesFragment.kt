package com.tfg.lr.roleroll.ui.habilidades

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tfg.lr.roleroll.alfombra.Personaje
import com.tfg.lr.roleroll.databinding.FragmentHabilidadesBinding
import java.lang.Exception

class HabilidadesFragment : Fragment() {

    companion object {
        var puntosEditables = false
    }

    private lateinit var pj: Personaje

    private var _binding: FragmentHabilidadesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var listaMods = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HabilidadesViewModel::class.java)

        _binding = FragmentHabilidadesBinding.inflate(inflater, container, false)
        val root: View = binding.root
        for (i in 0..5) {
            listaMods.add("0")
        }

        habilitarPuntos(puntosEditables)
        tablaDeHabilidades()

        return root
    }

    private fun tablaDeHabilidades() {
        // 44

        binding.txtvAcrobaciasMod.setText(listaMods[1])
        binding.txtvAcrobaciasTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvAcrobaciasPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvAcrobaciasMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtAcrobaciasMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtAcrobaciasPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvActuarMod.setText(listaMods[5])
        binding.txtvActuarTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvActuarPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvActuarMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtActuarMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtActuarPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvArtesaniaMod.setText(listaMods[3])
        binding.txtvArtesaniaTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvArtesaniaPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvArtesaniaMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtArtesaniaMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtArtesaniaPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvADLFMod.setText(listaMods[1])
        binding.txtvADLFTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvADLFPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvADLFMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtADLFMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtADLFPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvAIMod.setText(listaMods[4])
        binding.txtvAITotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvAIPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvAIMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtAIMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtAIPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvAvistarMod.setText(listaMods[4])
        binding.txtvAvistarTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvAvistarPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvAvistarMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtAvistarMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtAvistarPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvBuscarMod.setText(listaMods[3])
        binding.txtvBuscarTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvBuscarPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvBuscarMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtBuscarMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtBuscarPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvConcentracionMod.setText(listaMods[2])
        binding.txtvConcentracionTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvConcentracionPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvConcentracionMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtConcentracionMisc.getText().toString()),
                controlDeVaciosYParseadorInt(
                    binding.etxtConcentracionPenalizador.getText().toString()
                )
            ).toString()
        )

        binding.txtvCurarMod.setText(listaMods[4])
        binding.txtvCurarTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvCurarPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvCurarMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtCurarMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtCurarPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvDDMod.setText(listaMods[3])
        binding.txtvDDTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvDDPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvDDMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtDDMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtDDPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvDEMod.setText(listaMods[3])
        binding.txtvDETotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvDEPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvDEMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtDEMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtDEPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvDiplomaciaMod.setText(listaMods[5])
        binding.txtvDiplomaciaTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvDiplomaciaPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvDiplomaciaMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtDiplomaciaMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtDiplomaciaPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvDisfrazarseMod.setText(listaMods[5])
        binding.txtvDisfrazarseTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvDisfrazarsePuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvDisfrazarseMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtDisfrazarseMisc.getText().toString()),
                controlDeVaciosYParseadorInt(
                    binding.etxtDisfrazarsePenalizador.getText().toString()
                )
            ).toString()
        )

        binding.txtvEngannarMod.setText(listaMods[5])
        binding.txtvEngannarTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvEngannarPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvEngannarMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtEngannarMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtEngannarPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvEquilibrioMod.setText(listaMods[1])
        binding.txtvEquilibrioTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvEquilibrioPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvEquilibrioMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtEquilibrioMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtEquilibrioPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvEscalarMod.setText(elegirModDEXoSTR())
        binding.txtvEscalarTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvEscalarPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvEscalarMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtEscalarMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtEscalarPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvEscucharMod.setText(listaMods[4])
        binding.txtvEscucharTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvEscucharPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvEscucharMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtEscucharMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtEscucharPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvFalsificacionMod.setText(listaMods[3])
        binding.txtvFalsificacionTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvFalsificacionPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvFalsificacionMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtFalsificacionMisc.getText().toString()),
                controlDeVaciosYParseadorInt(
                    binding.etxtFalsificacionPenalizador.getText().toString()
                )
            ).toString()
        )

        binding.txtvHechiceriaMod.setText(listaMods[3])
        binding.txtvHechiceriaTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvHechiceriaPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvHechiceriaMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtHechiceriaMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtHechiceriaPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvIntimidarMod.setText(listaMods[5])
        binding.txtvIntimidarTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvIntimidarPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvIntimidarMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtIntimidarMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtIntimidarPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvJDMMod.setText(listaMods[1])
        binding.txtvJDMTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvJDMPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvJDMMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtJDMMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtJDMPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvMAMod.setText(listaMods[5])
        binding.txtvMATotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvMAPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvMAMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtMAMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtMAPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvMontarMod.setText(listaMods[1])
        binding.txtvMontarTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvMontarPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvMontarMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtMontarMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtMontarPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvMESMod.setText(listaMods[1])
        binding.txtvMESTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvMESPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvMESMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtMESMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtMESPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvNadarMod.setText(listaMods[0])
        binding.txtvNadarTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvNadarPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvNadarMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtNadarMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtNadarPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvOcultarMod.setText(listaMods[1])
        binding.txtvOcultarTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvOcultarPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvOcultarMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtOcultarMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtOcultarPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvProfesionMod.setText(listaMods[4])
        binding.txtvProfesionTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvProfesionPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvProfesionMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtProfesionMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtProfesionPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvRIMod.setText(listaMods[5])
        binding.txtvRITotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvRIPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvRIMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtRIMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtRIPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvSAMod.setText(listaMods[3])
        binding.txtvSATotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvSAPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvSAMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSAMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSAPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvSHMod.setText(listaMods[3])
        binding.txtvSHTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvSHPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvSHMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSHMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSHPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvSMMod.setText(listaMods[3])
        binding.txtvSMTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvSMPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvSMMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSMMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSMPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvSGMod.setText(listaMods[3])
        binding.txtvSGTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvSGPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvSGMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSGMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSGPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvSIMod.setText(listaMods[3])
        binding.txtvSITotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvSIPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvSIMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSIMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSIPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvSLMod.setText(listaMods[3])
        binding.txtvSLTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvSLPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvSLMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSLMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSLPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvSLPMod.setText(listaMods[3])
        binding.txtvSLPTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvSLPPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvSLPMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSLPMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSLPPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvSNaMod.setText(listaMods[3])
        binding.txtvSNaTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvSNaPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvSNaMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSNaMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSNaPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvSNoMod.setText(listaMods[3])
        binding.txtvSNoTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvSNoPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvSNoMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSNoMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSNoPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvSRMod.setText(listaMods[3])
        binding.txtvSRTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvSRPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvSRMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSRMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSRPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvSaltarMod.setText(elegirModDEXoSTR())
        binding.txtvSaltarTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvSaltarPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvSaltarMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSaltarMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSaltarPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvSupervivenciaMod.setText(listaMods[4])
        binding.txtvSupervivenciaTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvSupervivenciaPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvSupervivenciaMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtSupervivenciaMisc.getText().toString()),
                controlDeVaciosYParseadorInt(
                    binding.etxtSupervivenciaPenalizador.getText().toString()
                )
            ).toString()
        )

        binding.txtvTasarMod.setText(listaMods[3])
        binding.txtvTasarTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvTasarPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvTasarMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtTasarMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtTasarPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvUCMod.setText(listaMods[1])
        binding.txtvUCTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvUCPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvUCMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtUCMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtUCPenalizador.getText().toString())
            ).toString()
        )

        binding.txtvUOMMod.setText(listaMods[5])
        binding.txtvUOMTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(binding.txtvUOMPuntos.getText().toString()),
                controlDeVaciosYParseadorInt(binding.txtvUOMMod.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtUOMMisc.getText().toString()),
                controlDeVaciosYParseadorInt(binding.etxtUOMPenalizador.getText().toString())
            ).toString()
        )


    }

    private fun elegirModDEXoSTR(): String {

        var resultado: String

        return "0"


    }

    private fun controlDeVaciosYParseadorInt(cadena: String): Int {
        var num: Int = 0
        try {
            num = Integer.parseInt(cadena)
        } catch (e: Exception) {
            num = 10
        } finally {
            return num
        }
    }

    private fun habilitarPuntos(valor: Boolean) {
        binding.txtvAcrobaciasPuntos.isEnabled = valor
        binding.txtvActuarPuntos.isEnabled = valor
        binding.txtvArtesaniaPuntos.isEnabled = valor
        binding.txtvADLFPuntos.isEnabled = valor
        binding.txtvAIPuntos.isEnabled = valor
        binding.txtvAvistarPuntos.isEnabled = valor
        binding.txtvBuscarPuntos.isEnabled = valor
        binding.txtvConcentracionPuntos.isEnabled = valor
        binding.txtvCurarPuntos.isEnabled = valor
        binding.txtvDDPuntos.isEnabled = valor
        binding.txtvDEPuntos.isEnabled = valor
        binding.txtvDiplomaciaPuntos.isEnabled = valor
        binding.txtvDisfrazarsePuntos.isEnabled = valor
        binding.txtvEngannarPuntos.isEnabled = valor
        binding.txtvEquilibrioPuntos.isEnabled = valor
        binding.txtvEscalarPuntos.isEnabled = valor
        binding.txtvEscucharPuntos.isEnabled = valor
        binding.txtvFalsificacionPuntos.isEnabled = valor
        binding.txtvHechiceriaPuntos.isEnabled = valor
        binding.txtvIntimidarPuntos.isEnabled = valor
        binding.txtvJDMPuntos.isEnabled = valor
        binding.txtvMAPuntos.isEnabled = valor
        binding.txtvMontarPuntos.isEnabled = valor
        binding.txtvMESPuntos.isEnabled = valor
        binding.txtvNadarPuntos.isEnabled = valor
        binding.txtvOcultarPuntos.isEnabled = valor
        binding.txtvProfesionPuntos.isEnabled = valor
        binding.txtvRIPuntos.isEnabled = valor
        binding.txtvSAPuntos.isEnabled = valor
        binding.txtvSHPuntos.isEnabled = valor
        binding.txtvSMPuntos.isEnabled = valor
        binding.txtvSGPuntos.isEnabled = valor
        binding.txtvSIPuntos.isEnabled = valor
        binding.txtvSLPuntos.isEnabled = valor
        binding.txtvSLPPuntos.isEnabled = valor
        binding.txtvSNaPuntos.isEnabled = valor
        binding.txtvSNoPuntos.isEnabled = valor
        binding.txtvSRPuntos.isEnabled = valor
        binding.txtvSaltarPuntos.isEnabled = valor
        binding.txtvSupervivenciaPuntos.isEnabled = valor
        binding.txtvTasarPuntos.isEnabled = valor
        binding.txtvUCPuntos.isEnabled = valor
        binding.txtvUOMPuntos.isEnabled = valor


    }

    private fun hacerTotal(num1: Int, num2: Int, num3: Int, num4: Int): Int {
        return num1 + num2 + num3 + num4
    }

    private fun rellenarFragment() {
        binding.txtvAcrobaciasPuntos.setText(pj.puntosBaseAcrobacias)
        binding.etxtAcrobaciasMisc.setText(pj.miscAcrobacias)
        binding.etxtAcrobaciasPenalizador.setText(pj.penalizadorAcrobacias)
        binding.txtvActuarPuntos.setText(pj.puntosBaseActuar)
        binding.etxtActuarMisc.setText(pj.miscActuar)
        binding.etxtActuarPenalizador.setText(pj.penalizadorActuar)
        binding.txtvArtesaniaPuntos.setText(pj.puntosBaseArtesania)
        binding.etxtArtesaniaMisc.setText(pj.miscArtesania)
        binding.etxtArtesaniaPenalizador.setText(pj.penalizadorArtesania)
        binding.txtvADLFPuntos.setText(pj.puntosBaseADLF)
        binding.etxtADLFMisc.setText(pj.miscADLF)
        binding.etxtADLFPenalizador.setText(pj.penalizadorADLF)
        binding.txtvAIPuntos.setText(pj.puntosBaseAI)
        binding.etxtAIMisc.setText(pj.miscAI)
        binding.etxtAIPenalizador.setText(pj.penalizadorAI)
        binding.txtvAvistarPuntos.setText(pj.puntosBaseAvistar)
        binding.etxtAvistarMisc.setText(pj.miscAvistar)
        binding.etxtAvistarPenalizador.setText(pj.penalizadorAvistar)
        binding.txtvBuscarPuntos.setText(pj.puntosBaseBuscar)
        binding.etxtBuscarMisc.setText(pj.miscBuscar)
        binding.etxtBuscarPenalizador.setText(pj.penalizadorBuscar)
        binding.txtvConcentracionPuntos.setText(pj.puntosBaseConcentracion)
        binding.etxtConcentracionMisc.setText(pj.miscConcentracion)
        binding.etxtConcentracionPenalizador.setText(pj.penalizadorConcentracion)
        binding.txtvCurarPuntos.setText(pj.puntosBaseCurar)
        binding.etxtCurarMisc.setText(pj.miscCurar)
        binding.etxtCurarPenalizador.setText(pj.penalizadorCurar)
        binding.txtvDDPuntos.setText(pj.puntosBaseDD)
        binding.etxtDDMisc.setText(pj.miscDD)
        binding.etxtDDPenalizador.setText(pj.penalizadorDD)
        binding.txtvDEPuntos.setText(pj.puntosBaseDE)
        binding.etxtDEMisc.setText(pj.miscDE)
        binding.etxtDEPenalizador.setText(pj.penalizadorDE)
        binding.txtvDiplomaciaPuntos.setText(pj.puntosBaseDiplomacia)
        binding.etxtDiplomaciaMisc.setText(pj.miscDiplomacia)
        binding.etxtDiplomaciaPenalizador.setText(pj.penalizadorDiplomacia)
        binding.txtvDisfrazarsePuntos.setText(pj.puntosBaseDisfrazarse)
        binding.etxtDisfrazarseMisc.setText(pj.miscDisfrazarse)
        binding.etxtDisfrazarsePenalizador.setText(pj.penalizadorDisfrazarse)
        binding.txtvEngannarPuntos.setText(pj.puntosBaseEngannar)
        binding.etxtEngannarMisc.setText(pj.miscEngannar)
        binding.etxtEngannarPenalizador.setText(pj.penalizadorEngannar)
        binding.txtvEquilibrioPuntos.setText(pj.puntosBaseEquilibrio)
        binding.etxtEquilibrioMisc.setText(pj.miscEquilibrio)
        binding.etxtEquilibrioPenalizador.setText(pj.penalizadorEquilibrio)
        binding.txtvEscalarPuntos.setText(pj.puntosBaseEscalar)
        binding.etxtEscalarMisc.setText(pj.miscEscalar)
        binding.etxtEscalarPenalizador.setText(pj.penalizadorEscalar)
        binding.txtvEscucharPuntos.setText(pj.puntosBaseEscuchar)
        binding.etxtEscucharMisc.setText(pj.miscEscuchar)
        binding.etxtEscucharPenalizador.setText(pj.penalizadorEscuchar)
        binding.txtvFalsificacionPuntos.setText(pj.puntosBaseFalsificacion)
        binding.etxtFalsificacionMisc.setText(pj.miscFalsificacion)
        binding.etxtFalsificacionPenalizador.setText(pj.penalizadorFalsificacion)
        binding.txtvHechiceriaPuntos.setText(pj.puntosBaseHechiceria)
        binding.etxtHechiceriaMisc.setText(pj.miscHechiceria)
        binding.etxtHechiceriaPenalizador.setText(pj.penalizadorHechiceria)
        binding.txtvIntimidarPuntos.setText(pj.puntosBaseIntimidar)
        binding.etxtIntimidarMisc.setText(pj.miscIntimidar)
        binding.txtvJDMPuntos.setText(pj.puntosBaseJDM)
        binding.etxtJDMMisc.setText(pj.miscJDM)
        binding.etxtJDMPenalizador.setText(pj.penalizadorJDM)
        binding.txtvMAPuntos.setText(pj.puntosBaseMA)
        binding.etxtMAMisc.setText(pj.miscMA)
        binding.etxtMAPenalizador.setText(pj.penalizadorMA)
        binding.txtvMontarPuntos.setText(pj.puntosBaseMontar)
        binding.etxtMontarMisc.setText(pj.miscMontar)
        binding.etxtMontarPenalizador.setText(pj.penalizadorMontar)
        binding.txtvMESPuntos.setText(pj.puntosBaseMES)
        binding.etxtMESMisc.setText(pj.miscMES)
        binding.etxtMESPenalizador.setText(pj.penalizadorMES)
        binding.txtvNadarPuntos.setText(pj.puntosBaseNadar)
        binding.etxtNadarMisc.setText(pj.miscNadar)
        binding.etxtNadarPenalizador.setText(pj.penalizadorNadar)
        binding.txtvOcultarPuntos.setText(pj.puntosBaseOcultar)
        binding.etxtOcultarMisc.setText(pj.miscOcultar)
        binding.etxtOcultarPenalizador.setText(pj.penalizadorOcultar)
        binding.txtvProfesionPuntos.setText(pj.puntosBaseProfesion)
        binding.etxtProfesionMisc.setText(pj.miscProfesion)
        binding.etxtProfesionPenalizador.setText(pj.penalizadorProfesion)
        binding.txtvRIPuntos.setText(pj.puntosBaseRI)
        binding.etxtRIMisc.setText(pj.miscRI)
        binding.etxtRIPenalizador.setText(pj.penalizadorRI)
        binding.txtvSAPuntos.setText(pj.puntosBaseSA)
        binding.etxtSAMisc.setText(pj.miscSA)
        binding.etxtSAPenalizador.setText(pj.penalizadorSA)
        binding.txtvSHPuntos.setText(pj.puntosBaseSH)
        binding.etxtSHMisc.setText(pj.miscSHMisc)
        binding.etxtSHPenalizador.setText(pj.penalizadorSH)
        binding.txtvSMPuntos.setText(pj.puntosBaseSM)
        binding.etxtSMMisc.setText(pj.miscSM)
        binding.etxtSMPenalizador.setText(pj.penalizadorSM)
        binding.txtvSGPuntos.setText(pj.puntosBaseSG)
        binding.etxtSGMisc.setText(pj.miscSG)
        binding.etxtSGPenalizador.setText(pj.penalizadorSG)
        binding.txtvSIPuntos.setText(pj.puntosBaseSI)
        binding.etxtSIMisc.setText(pj.miscSI)
        binding.etxtSIPenalizador.setText(pj.penalizadorSI)
        binding.txtvSaltarPuntos.setText(pj.puntosBaseSaltar)
        binding.etxtSaltarMisc.setText(pj.miscSaltar)
        binding.etxtSaltarPenalizador.setText(pj.penalizadorSaltar)
        binding.txtvSupervivenciaPuntos.setText(pj.puntosBaseSupervivencia)
        binding.etxtSupervivenciaMisc.setText(pj.miscSupervivencia)
        binding.etxtSupervivenciaPenalizador.setText(pj.penalizadorSupervivencia)
        binding.txtvTasarPuntos.setText(pj.puntosBaseTasar)
        binding.etxtTasarMisc.setText(pj.miscTasar)
        binding.etxtTasarPenalizador.setText(pj.penalizadorTasar)
        binding.txtvUCPuntos.setText(pj.puntosBaseUC)
        binding.etxtUCMisc.setText(pj.miscUC)
        binding.etxtUCPenalizador.setText(pj.penalizadorUC)
        binding.txtvUOMPuntos.setText(pj.puntosBaseUOM)
        binding.etxtUOMMisc.setText(pj.miscUOM)
        binding.etxtUOMPenalizador.setText(pj.penalizadorUOM)


    }

    private fun rellenarPj() {
        pj.puntosBaseAcrobacias = binding.txtvAcrobaciasPuntos.text.toString().toInt()
        pj.miscAcrobacias = binding.etxtAcrobaciasMisc.text.toString().toInt()
        pj.penalizadorAcrobacias = binding.etxtAcrobaciasMisc.text.toString().toInt()
        pj.puntosBaseActuar = binding.txtvActuarPuntos.text.toString().toInt()
        pj.miscActuar = binding.etxtActuarMisc.text.toString().toInt()
        pj.penalizadorActuar = binding.etxtActuarPenalizador.text.toString().toInt()
        pj.puntosBaseArtesania = binding.txtvArtesaniaPuntos.text.toString().toInt()
        pj.penalizadorArtesania = binding.etxtArtesaniaMisc.text.toString().toInt()
        pj.puntosBaseADLF = binding.txtvADLFPuntos.text.toString().toInt()
        pj.miscADLF = binding.etxtADLFMisc.text.toString().toInt()
        pj.penalizadorADLF = binding.etxtADLFPenalizador.text.toString().toInt()
        pj.puntosBaseAI = binding.txtvAIPuntos.text.toString().toInt()
        pj.miscAI = binding.etxtAIMisc.text.toString().toInt()
        pj.penalizadorAI = binding.etxtAIPenalizador.text.toString().toInt()
        pj.puntosBaseAvistar = binding.txtvAvistarPuntos.text.toString().toInt()
        pj.miscAvistar = binding.etxtAvistarMisc.text.toString().toInt()
        pj.penalizadorAvistar = binding.etxtAvistarPenalizador.text.toString().toInt()
        pj.puntosBaseBuscar = binding.txtvBuscarPuntos.text.toString().toInt()
        pj.miscBuscar = binding.etxtBuscarMisc.text.toString().toInt()
        pj.penalizadorBuscar = binding.etxtBuscarPenalizador.text.toString().toInt()
        pj.puntosBaseConcentracion = binding.txtvConcentracionPuntos.text.toString().toInt()
        pj.miscConcentracion = binding.etxtConcentracionMisc.text.toString().toInt()
        pj.penalizadorConcentracion = binding.etxtConcentracionPenalizador.text.toString().toInt()
        pj.puntosBaseCurar = binding.txtvCurarPuntos.text.toString().toInt()
        pj.miscCurar = binding.etxtCurarMisc.text.toString().toInt()
        pj.penalizadorCurar = binding.etxtCurarPenalizador.text.toString().toInt()
        pj.puntosBaseDD = binding.txtvDDPuntos.text.toString().toInt()
        pj.miscDD = binding.etxtDDMisc.text.toString().toInt()
        pj.penalizadorDD = binding.etxtDDPenalizador.text.toString().toInt()
        pj.puntosBaseDE = binding.txtvDEPuntos.text.toString().toInt()
        pj.miscDE = binding.etxtDEMisc.text.toString().toInt()
        pj.penalizadorDE = binding.etxtDEPenalizador.text.toString().toInt()
        pj.puntosBaseDiplomacia = binding.txtvDiplomaciaPuntos.text.toString().toInt()
        pj.miscDiplomacia = binding.etxtDiplomaciaMisc.text.toString().toInt()
        pj.penalizadorDiplomacia = binding.etxtDiplomaciaPenalizador.text.toString().toInt()
        pj.puntosBaseDisfrazarse = binding.txtvDisfrazarsePuntos.text.toString().toInt()
        pj.miscDisfrazarse = binding.etxtDisfrazarseMisc.text.toString().toInt()
        pj.penalizadorDisfrazarse = binding.etxtDisfrazarsePenalizador.text.toString().toInt()
        pj.puntosBaseEngannar = binding.txtvEngannarPuntos.text.toString().toInt()
        pj.miscEngannar = binding.etxtEngannarMisc.text.toString().toInt()
        pj.penalizadorEngannar = binding.etxtEngannarPenalizador.text.toString().toInt()
        pj.puntosBaseEquilibrio = binding.txtvEquilibrioPuntos.text.toString().toInt()
        pj.miscEquilibrio = binding.etxtEquilibrioMisc.text.toString().toInt()
        pj.penalizadorEquilibrio = binding.etxtEquilibrioPenalizador.text.toString().toInt()
        pj.puntosBaseEscalar = binding.txtvEscalarPuntos.text.toString().toInt()
        pj.miscEscalar = binding.etxtEscalarMisc.text.toString().toInt()
        pj.penalizadorEscalar = binding.etxtEscalarPenalizador.text.toString().toInt()
        pj.puntosBaseEscuchar = binding.txtvEscucharPuntos.text.toString().toInt()
        pj.miscEscuchar = binding.etxtEscucharMisc.text.toString().toInt()
        pj.penalizadorEscuchar = binding.etxtEscucharPenalizador.text.toString().toInt()
        pj.puntosBaseFalsificacion = binding.txtvFalsificacionPuntos.text.toString().toInt()
        pj.miscFalsificacion = binding.etxtFalsificacionMisc.text.toString().toInt()
        pj.penalizadorFalsificacion = binding.etxtFalsificacionPenalizador.text.toString().toInt()
        pj.puntosBaseHechiceria = binding.txtvHechiceriaPuntos.text.toString().toInt()
        pj.miscHechiceria = binding.etxtHechiceriaMisc.text.toString().toInt()
        pj.penalizadorHechiceria = binding.etxtHechiceriaPenalizador.text.toString().toInt()
        pj.puntosBaseIntimidar = binding.txtvIntimidarPuntos.text.toString().toInt()
        pj.miscIntimidar = binding.etxtIntimidarMisc.text.toString().toInt()
        pj.puntosBaseJDM = binding.txtvJDMPuntos.text.toString().toInt()
        pj.miscJDM = binding.etxtJDMMisc.text.toString().toInt()
        pj.penalizadorJDM = binding.etxtJDMPenalizador.text.toString().toInt()
        pj.puntosBaseMA = binding.txtvMAPuntos.text.toString().toInt()
        pj.miscMA = binding.etxtMAMisc.text.toString().toInt()
        pj.penalizadorMA = binding.etxtMAPenalizador.text.toString().toInt()
        pj.puntosBaseMontar = binding.txtvMontarPuntos.text.toString().toInt()
        pj.miscMontar = binding.etxtMontarMisc.text.toString().toInt()
        pj.penalizadorMontar = binding.etxtMontarPenalizador.text.toString().toInt()
        pj.puntosBaseMES = binding.txtvMESPuntos.text.toString().toInt()
        pj.miscMES = binding.etxtMESMisc.text.toString().toInt()
        pj.penalizadorMES = binding.etxtMESPenalizador.text.toString().toInt()
        pj.puntosBaseNadar = binding.txtvNadarPuntos.text.toString().toInt()
        pj.miscNadar = binding.etxtNadarMisc.text.toString().toInt()
        pj.penalizadorNadar = binding.etxtNadarPenalizador.text.toString().toInt()
        pj.puntosBaseOcultar = binding.txtvOcultarPuntos.text.toString().toInt()
        pj.miscOcultar = binding.etxtOcultarMisc.text.toString().toInt()
        pj.penalizadorOcultar = binding.etxtOcultarPenalizador.text.toString().toInt()
        pj.puntosBaseProfesion = binding.txtvProfesionPuntos.text.toString().toInt()
        pj.miscProfesion = binding.etxtProfesionMisc.text.toString().toInt()
        pj.penalizadorProfesion = binding.etxtProfesionPenalizador.text.toString().toInt()
        pj.puntosBaseRI = binding.txtvRIPuntos.text.toString().toInt()
        pj.miscRI = binding.etxtRIMisc.text.toString().toInt()
        pj.penalizadorRI = binding.etxtRIPenalizador.text.toString().toInt()
        pj.puntosBaseSA = binding.txtvSAPuntos.text.toString().toInt()
        pj.miscSA = binding.etxtSAMisc.text.toString().toInt()
        pj.penalizadorSA = binding.etxtSAPenalizador.text.toString().toInt()
        pj.puntosBaseSH = binding.txtvSHPuntos.text.toString().toInt()
        pj.miscSHMisc = binding.etxtSHMisc.text.toString().toInt()
        pj.penalizadorSH = binding.etxtSHPenalizador.text.toString().toInt()
        pj.puntosBaseSM = binding.txtvSMPuntos.text.toString().toInt()
        pj.miscSM = binding.etxtSMMisc.text.toString().toInt()
        pj.penalizadorSM = binding.etxtSMPenalizador.text.toString().toInt()
        pj.puntosBaseSG = binding.txtvSGPuntos.text.toString().toInt()
        pj.miscSG = binding.etxtSGMisc.text.toString().toInt()
        pj.penalizadorSG = binding.etxtSGPenalizador.text.toString().toInt()
        pj.puntosBaseSI = binding.txtvSIPuntos.text.toString().toInt()
        pj.miscSI = binding.etxtSIMisc.text.toString().toInt()
        pj.penalizadorSI = binding.etxtSIPenalizador.text.toString().toInt()
        pj.puntosBaseSaltar = binding.txtvSaltarPuntos.text.toString().toInt()
        pj.miscSaltar = binding.etxtSaltarMisc.text.toString().toInt()
        pj.penalizadorSaltar = binding.etxtSaltarPenalizador.text.toString().toInt()
        pj.puntosBaseSupervivencia = binding.txtvSupervivenciaPuntos.text.toString().toInt()
        pj.miscSupervivencia = binding.etxtSupervivenciaMisc.text.toString().toInt()
        pj.penalizadorSupervivencia = binding.etxtSupervivenciaPenalizador.text.toString().toInt()
        pj.puntosBaseTasar = binding.txtvTasarPuntos.text.toString().toInt()
        pj.miscTasar = binding.etxtTasarMisc.text.toString().toInt()
        pj.penalizadorTasar = binding.etxtTasarPenalizador.text.toString().toInt()
        pj.puntosBaseUC = binding.txtvUCPuntos.text.toString().toInt()
        pj.miscUC = binding.etxtUCMisc.text.toString().toInt()
        pj.penalizadorUC = binding.etxtUCPenalizador.text.toString().toInt()
        pj.puntosBaseUOM = binding.txtvUOMPuntos.text.toString().toInt()
        pj.miscUOM = binding.etxtUOMMisc.text.toString().toInt()
        pj.penalizadorUOM = binding.etxtUOMPenalizador.text.toString().toInt()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}