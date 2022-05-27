package com.tfg.lr.roleroll.ui.habilidades

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tfg.lr.roleroll.databinding.FragmentHabilidadesBinding
import java.lang.Exception

class HabilidadesFragment : Fragment() {

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


        tablaDeHabilidades(binding)

        return root
    }

    private fun tablaDeHabilidades(binding: FragmentHabilidadesBinding) {
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
                controlDeVaciosYParseadorInt(binding.etxtConcentracionPenalizador.getText().toString())
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
                controlDeVaciosYParseadorInt(binding.etxtDisfrazarsePenalizador.getText().toString())
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
                controlDeVaciosYParseadorInt(binding.etxtFalsificacionPenalizador.getText().toString())
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
                controlDeVaciosYParseadorInt(binding.etxtSupervivenciaPenalizador.getText().toString())
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
        var num :Int = 0
        try {
            num = Integer.parseInt(cadena)
        } catch (e: Exception) {
            num = 10
        } finally {
            return num
        }
    }

    private fun hacerTotal(num1: Int, num2: Int, num3: Int, num4: Int): Int {
        return num1 + num2 + num3 + num4
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}