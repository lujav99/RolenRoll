package com.tfg.lr.roleroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class VerPersonaje : AppCompatActivity() {

    private val bd = FirebaseFirestore.getInstance()


    private lateinit var etxtNombrePj: EditText
    private lateinit var txtvRazaPj: TextView
    private lateinit var txtvClasePj: TextView

    /*
    *       PUNTOS DE HABILIDAD
    */

    // STR
    private lateinit var txtvSTRTotal:TextView
    private lateinit var txtvSTRMod:TextView
    private lateinit var txtvSTRBase:TextView

    private lateinit var etxtSTRMisc: EditText
    private lateinit var etxtSTRTemp: EditText

    // DEX
    private lateinit var txtvDEXTotal:TextView
    private lateinit var txtvDEXMod:TextView
    private lateinit var txtvDEXBase:TextView

    private lateinit var etxtDEXMisc: EditText
    private lateinit var etxtDEXTemp: EditText

    // CON
    private lateinit var txtvCONTotal:TextView
    private lateinit var txtvCONMod:TextView
    private lateinit var txtvCONBase:TextView

    private lateinit var etxtCONMisc: EditText
    private lateinit var etxtCONTemp: EditText

    // INT
    private lateinit var txtvINTTotal:TextView
    private lateinit var txtvINTMod:TextView
    private lateinit var txtvINTBase:TextView

    private lateinit var etxtINTMisc: EditText
    private lateinit var etxtINTTemp: EditText

    // WIS
    private lateinit var txtvWISTotal:TextView
    private lateinit var txtvWISMod:TextView
    private lateinit var txtvWISBase:TextView

    private lateinit var etxtWISMisc: EditText
    private lateinit var etxtWISTemp: EditText

    // CHA
    private lateinit var txtvCHATotal:TextView
    private lateinit var txtvCHAMod:TextView
    private lateinit var txtvCHABase:TextView

    private lateinit var etxtCHAMisc: EditText
    private lateinit var etxtCHATemp: EditText

    /*
    *       SALVACIONES
    */

    // FORTITUDE
    private lateinit var txtvFortitudeTotal:TextView
    private lateinit var txtvFortitudeMod:TextView
    private lateinit var txtvFortitudeBase:TextView

    private lateinit var etxtFortitudeMisc: EditText
    private lateinit var etxtFortitudeTemp: EditText

    // REFLEX
    private lateinit var txtvREFTotal:TextView
    private lateinit var txtvREFMod:TextView
    private lateinit var txtvREFBase:TextView

    private lateinit var etxtREFMisc: EditText
    private lateinit var etxtREFTemp: EditText

    // WILL
    private lateinit var txtvWillTotal:TextView
    private lateinit var txtvWillMod:TextView
    private lateinit var txtvWillBase:TextView

    private lateinit var etxtWillMisc: EditText
    private lateinit var etxtWillTemp: EditText

    /*
    *      HABILIDADES 43*6
    */

    // Acrobacias DEX
    private lateinit var txtvAcrobaciasTotal:TextView
    private lateinit var txtvAcrobaciasMod:TextView
    private lateinit var txtvAcrobaciasPuntos:TextView

    private lateinit var etxtAcrobaciasMisc: EditText
    private lateinit var etxtAcrobaciasPenalizador: EditText

    // Actuar CHA
    private lateinit var txtvActuarTotal:TextView
    private lateinit var txtvActuarMod:TextView
    private lateinit var txtvActuarPuntos:TextView

    private lateinit var etxtActuarMisc: EditText
    private lateinit var etxtActuarPenalizador: EditText

    // Artesanía INT
    private lateinit var txtvArtesaniaTotal:TextView
    private lateinit var txtvArtesaniaMod:TextView
    private lateinit var txtvArtesaniaPuntos:TextView

    private lateinit var etxtArtesaniaMisc: EditText
    private lateinit var etxtArtesaniaPenalizador: EditText

    // Artista de la fuga DEX
    private lateinit var txtvADLFTotal:TextView
    private lateinit var txtvADLFMod:TextView
    private lateinit var txtvADLFPuntos:TextView

    private lateinit var etxtADLFMisc: EditText
    private lateinit var etxtADLFPenalizador: EditText

    // Averiguar intenciones WIS
    private lateinit var txtvAITotal:TextView
    private lateinit var txtvAIMod:TextView
    private lateinit var txtvAIPuntos:TextView

    private lateinit var etxtAIMisc: EditText
    private lateinit var etxtAIPenalizador: EditText

    // Avistar WIS
    private lateinit var txtvAvistarTotal:TextView
    private lateinit var txtvAvistarMod:TextView
    private lateinit var txtvAvistarPuntos:TextView

    private lateinit var etxtAvistarMisc: EditText
    private lateinit var etxtAvistarPenalizador: EditText

    // Buscar INT
    private lateinit var txtvBuscarTotal:TextView
    private lateinit var txtvBuscarMod:TextView
    private lateinit var txtvBuscarPuntos:TextView

    private lateinit var etxtBuscarMisc: EditText
    private lateinit var etxtBuscarPenalizador: EditText

    // Concentracion CON
    private lateinit var txtvConcentracionTotal:TextView
    private lateinit var txtvConcentracionMod:TextView
    private lateinit var txtvConcentracionPuntos:TextView

    private lateinit var etxtConcentracionMisc: EditText
    private lateinit var etxtConcentracionPenalizador: EditText

    // Curar WIS
    private lateinit var txtvCurarTotal:TextView
    private lateinit var txtvCurarMod:TextView
    private lateinit var txtvCurarPuntos:TextView

    private lateinit var etxtCurarMisc: EditText
    private lateinit var etxtCurarPenalizador: EditText

    // Desactivar dispositivo INT
    private lateinit var txtvDDTotal:TextView
    private lateinit var txtvDDMod:TextView
    private lateinit var txtvDDPuntos:TextView

    private lateinit var etxtDDMisc: EditText
    private lateinit var etxtDDPenalizador: EditText

    // Descifrar Escritura INT
    private lateinit var txtvDETotal:TextView
    private lateinit var txtvDEMod:TextView
    private lateinit var txtvDEPuntos:TextView

    private lateinit var etxtDEMisc: EditText
    private lateinit var etxtDEPenalizador: EditText

    // Diplomacia CHA
    private lateinit var txtvDiplomaciaTotal:TextView
    private lateinit var txtvDiplomaciaMod:TextView
    private lateinit var txtvDiplomaciaPuntos:TextView

    private lateinit var etxtDiplomaciaMisc: EditText
    private lateinit var etxtDiplomaciaPenalizador: EditText

    // Disfrazarse CHA
    private lateinit var txtvDisfrazarseTotal:TextView
    private lateinit var txtvDisfrazarseMod:TextView
    private lateinit var txtvDisfrazarsePuntos:TextView

    private lateinit var etxtDisfrazarseMisc: EditText
    private lateinit var etxtDisfrazarsePenalizador: EditText

    // Engañar CHA
    private lateinit var txtvEngannarTotal:TextView
    private lateinit var txtvEngannarMod:TextView
    private lateinit var txtvEngannarPuntos:TextView

    private lateinit var etxtEngannarMisc: EditText
    private lateinit var etxtEngannarPenalizador: EditText

    // Equilibrio DEX
    private lateinit var txtvEquilibrioTotal:TextView
    private lateinit var txtvEquilibrioMod:TextView
    private lateinit var txtvEquilibrioPuntos:TextView

    private lateinit var etxtEquilibrioMisc: EditText
    private lateinit var etxtEquilibrioPenalizador: EditText

    // Escalar STR/DEX
    private lateinit var txtvEscalarTotal:TextView
    private lateinit var txtvEscalarMod:TextView
    private lateinit var txtvEscalarPuntos:TextView

    private lateinit var etxtEscalarMisc: EditText
    private lateinit var etxtEscalarPenalizador: EditText

    // Escuchar WIS
    private lateinit var txtvEscucharTotal:TextView
    private lateinit var txtvEscucharMod:TextView
    private lateinit var txtvEscucharPuntos:TextView

    private lateinit var etxtEscucharMisc: EditText
    private lateinit var etxtEscucharPenalizador: EditText

    // Falsificacion INT
    private lateinit var txtvFalsificacionTotal:TextView
    private lateinit var txtvFalsificacionMod:TextView
    private lateinit var txtvFalsificacionPuntos:TextView

    private lateinit var etxtFalsificacionMisc: EditText
    private lateinit var etxtFalsificacionPenalizador: EditText

    // Hechiceria INT
    private lateinit var txtvHechiceriaTotal:TextView
    private lateinit var txtvHechiceriaMod:TextView
    private lateinit var txtvHechiceriaPuntos:TextView

    private lateinit var etxtHechiceriaMisc: EditText
    private lateinit var etxtHechiceriaPenalizador: EditText

    // Intimidar CHA
    private lateinit var txtvIntimidarTotal:TextView
    private lateinit var txtvIntimidarMod:TextView
    private lateinit var txtvIntimidarPuntos:TextView

    private lateinit var etxtIntimidarMisc: EditText
    private lateinit var etxtIntimidarPenalizador: EditText

    // Juego de manos DEX
    private lateinit var txtvJDMTotal:TextView
    private lateinit var txtvJDMMod:TextView
    private lateinit var txtvJDMPuntos:TextView

    private lateinit var etxtJDMMisc: EditText
    private lateinit var etxtJDMPenalizador: EditText

    // Manejar animales CHA
    private lateinit var txtvMATotal:TextView
    private lateinit var txtvMAMod:TextView
    private lateinit var txtvMAPuntos:TextView

    private lateinit var etxtMAMisc: EditText
    private lateinit var etxtMAPenalizador: EditText

    // Montar DEX
    private lateinit var txtvMontarTotal:TextView
    private lateinit var txtvMontarMod:TextView
    private lateinit var txtvMontarPuntos:TextView

    private lateinit var etxtMontarMisc: EditText
    private lateinit var etxtMontarPenalizador: EditText

    // Muévete en silencio DEX
    private lateinit var txtvMESTotal:TextView
    private lateinit var txtvMESMod:TextView
    private lateinit var txtvMESPuntos:TextView

    private lateinit var etxtMESMisc: EditText
    private lateinit var etxtMESPenalizador: EditText

    // Nadar STR
    private lateinit var txtvNadarTotal:TextView
    private lateinit var txtvNadarMod:TextView
    private lateinit var txtvNadarPuntos:TextView

    private lateinit var etxtNadarMisc: EditText
    private lateinit var etxtNadarPenalizador: EditText

    // Ocultar DEX
    private lateinit var txtvOcultarTotal:TextView
    private lateinit var txtvOcultarMod:TextView
    private lateinit var txtvOcultarPuntos:TextView

    private lateinit var etxtOcultarMisc: EditText
    private lateinit var etxtOcultarPenalizador: EditText

    // Profesion WIS
    private lateinit var txtvProfesionTotal:TextView
    private lateinit var txtvProfesionMod:TextView
    private lateinit var txtvProfesionPuntos:TextView

    private lateinit var etxtProfesionMisc: EditText
    private lateinit var etxtProfesionPenalizador: EditText

    // Reunir información CHA
    private lateinit var txtvRITotal:TextView
    private lateinit var txtvRIMod:TextView
    private lateinit var txtvRIPuntos:TextView

    private lateinit var etxtRIMisc: EditText
    private lateinit var etxtRIPenalizador: EditText

    // Saber Arcano INT
    private lateinit var txtvSATotal:TextView
    private lateinit var txtvSAMod:TextView
    private lateinit var txtvSAPuntos:TextView

    private lateinit var etxtSAMisc: EditText
    private lateinit var etxtSAPenalizador: EditText

    // Saber de Historia INT
    private lateinit var txtvSHTotal:TextView
    private lateinit var txtvSHMod:TextView
    private lateinit var txtvSHPuntos:TextView

    private lateinit var etxtSHMisc: EditText
    private lateinit var etxtSHPenalizador: EditText

    // Saber de Mazmorra INT
    private lateinit var txtvSMTotal:TextView
    private lateinit var txtvSMMod:TextView
    private lateinit var txtvSMPuntos:TextView

    private lateinit var etxtSMMisc: EditText
    private lateinit var etxtSMPenalizador: EditText

    // Saber Geografía INT
    private lateinit var txtvSGTotal:TextView
    private lateinit var txtvSGMod:TextView
    private lateinit var txtvSGPuntos:TextView

    private lateinit var etxtSGMisc: EditText
    private lateinit var etxtSGPenalizador: EditText

    // Saber Ingeniero INT
    private lateinit var txtvSITotal:TextView
    private lateinit var txtvSIMod:TextView
    private lateinit var txtvSIPuntos:TextView

    private lateinit var etxtSIMisc: EditText
    private lateinit var etxtSIPenalizador: EditText

    // Saber Local INT
    private lateinit var txtvSLTotal:TextView
    private lateinit var txtvSLMod:TextView
    private lateinit var txtvSLPuntos:TextView

    private lateinit var etxtSLMisc: EditText
    private lateinit var etxtSLPenalizador: EditText

    // Saber Los Planos INT
    private lateinit var txtvSLPTotal:TextView
    private lateinit var txtvSLPMod:TextView
    private lateinit var txtvSLPPuntos:TextView

    private lateinit var etxtSLPMisc: EditText
    private lateinit var etxtSLPPenalizador: EditText

    // Saber Naturaleza INT
    private lateinit var txtvSNaTotal:TextView
    private lateinit var txtvSNaMod:TextView
    private lateinit var txtvSNaPuntos:TextView

    private lateinit var etxtSNaMisc: EditText
    private lateinit var etxtSNaPenalizador: EditText

    // Saber Nobleza INT
    private lateinit var txtvSNoTotal:TextView
    private lateinit var txtvSNoMod:TextView
    private lateinit var txtvSNoPuntos:TextView

    private lateinit var etxtSNoMisc: EditText
    private lateinit var etxtSNoPenalizador: EditText

    // Saber Religión INT
    private lateinit var txtvSRTotal:TextView
    private lateinit var txtvSRMod:TextView
    private lateinit var txtvSRPuntos:TextView

    private lateinit var etxtSRMisc: EditText
    private lateinit var etxtSRPenalizador: EditText

    // Saltar DEX/STR
    private lateinit var txtvSaltarTotal:TextView
    private lateinit var txtvSaltarMod:TextView
    private lateinit var txtvSaltarPuntos:TextView

    private lateinit var etxtSaltarMisc: EditText
    private lateinit var etxtSaltarPenalizador: EditText

    // Supervivencia WIS
    private lateinit var txtvSupervivenciaTotal:TextView
    private lateinit var txtvSupervivenciaMod:TextView
    private lateinit var txtvSupervivenciaPuntos:TextView

    private lateinit var etxtSupervivenciaMisc: EditText
    private lateinit var etxtSupervivenciaPenalizador: EditText

    // Tasar INT
    private lateinit var txtvTasarTotal:TextView
    private lateinit var txtvTasarMod:TextView
    private lateinit var txtvTasarPuntos:TextView

    private lateinit var etxtTasarMisc: EditText
    private lateinit var etxtTasarPenalizador: EditText

    // Usar la cuerda DEX
    private lateinit var txtvUCTotal:TextView
    private lateinit var txtvUCMod:TextView
    private lateinit var txtvUCPuntos:TextView

    private lateinit var etxtUCMisc: EditText
    private lateinit var etxtUCPenalizador: EditText

    // Usar objeto mágico CHA
    private lateinit var txtvUOMTotal:TextView
    private lateinit var txtvUOMMod:TextView
    private lateinit var txtvUOMPuntos:TextView

    private lateinit var etxtUOMMisc: EditText
    private lateinit var etxtUOMPenalizador: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_personaje)

        inicializarVariables()


    }

    private fun rellenarTablas() {

        // Llamar a BD
        leerDatos()

        // Hacer operaciones
        tablaDePuntosDeHabilidad()
        tablaDeSalvaciones()
//        tablaDeHabilidades()


    }

    private fun leerDatos() {
        Reutilizables.db.collection("personajes").document(nombre).get().addOnSuccessListener {
            etxtNombrePj.setText(it.get("nombre_pj") as String)
            etxtRazaPj.setText(it.get("raza_pj") as String)

        }
    }

    private fun tablaDePuntosDeHabilidad() {

        txtvSTRTotal.setText(
            hacerTotalHabilidades(
                controlDeVaciosYParseadorInt(txtvSTRBase.getText().toString()),
                controlDeVaciosYParseadorInt(etxtSTRMisc.getText().toString()),
                controlDeVaciosYParseadorInt(etxtSTRTemp.getText().toString())
            ).toString()
        )
        txtvSTRMod.setText(((controlDeVaciosYParseadorInt(txtvSTRTotal.getText().toString())-10)/2).toString())

        txtvDEXTotal.setText(
            hacerTotalHabilidades(
                controlDeVaciosYParseadorInt(txtvDEXBase.getText().toString()),
                controlDeVaciosYParseadorInt(etxtDEXMisc.getText().toString()),
                controlDeVaciosYParseadorInt(etxtDEXTemp.getText().toString())
            ).toString()
        )
        txtvDEXMod.setText(((controlDeVaciosYParseadorInt(txtvDEXTotal.getText().toString())-10)/2).toString())

        txtvCONTotal.setText(
            hacerTotalHabilidades(
                controlDeVaciosYParseadorInt(txtvCONBase.getText().toString()),
                controlDeVaciosYParseadorInt(etxtCONMisc.getText().toString()),
                controlDeVaciosYParseadorInt(etxtCONTemp.getText().toString())
            ).toString()
        )
        txtvCONMod.setText(((controlDeVaciosYParseadorInt(txtvCONTotal.getText().toString())-10)/2).toString())

        txtvINTTotal.setText(
            hacerTotalHabilidades(
                controlDeVaciosYParseadorInt(txtvINTBase.getText().toString()),
                controlDeVaciosYParseadorInt(etxtINTMisc.getText().toString()),
                controlDeVaciosYParseadorInt(etxtINTTemp.getText().toString())
            ).toString()
        )
        txtvINTMod.setText(((controlDeVaciosYParseadorInt(txtvINTTotal.getText().toString())-10)/2).toString())

        txtvWISTotal.setText(
            hacerTotalHabilidades(
                controlDeVaciosYParseadorInt(txtvWISBase.getText().toString()),
                controlDeVaciosYParseadorInt(etxtWISMisc.getText().toString()),
                controlDeVaciosYParseadorInt(etxtWISTemp.getText().toString())
            ).toString()
        )
        txtvWISMod.setText(((controlDeVaciosYParseadorInt(txtvWISTotal.getText().toString())-10)/2).toString())

        txtvCHATotal.setText(
            hacerTotalHabilidades(
                controlDeVaciosYParseadorInt(txtvCHABase.getText().toString()),
                controlDeVaciosYParseadorInt(etxtCHAMisc.getText().toString()),
                controlDeVaciosYParseadorInt(etxtCHATemp.getText().toString())
            ).toString()
        )
        txtvCHAMod.setText(((controlDeVaciosYParseadorInt(txtvCHATotal.getText().toString())-10)/2).toString())
    }

    private fun tablaDeSalvaciones() {

        txtvFortitudeMod.setText(txtvCONMod.getText().toString())
        txtvFortitudeTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(txtvFortitudeBase.getText().toString()),
                controlDeVaciosYParseadorInt(txtvFortitudeMod.getText().toString()),
                controlDeVaciosYParseadorInt(etxtFortitudeMisc.getText().toString()),
                controlDeVaciosYParseadorInt(etxtFortitudeTemp.getText().toString())
            ).toString()
        )


        txtvREFMod.setText(txtvDEXMod.getText().toString())
        txtvREFTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(txtvREFBase.getText().toString()),
                controlDeVaciosYParseadorInt(txtvREFMod.getText().toString()),
                controlDeVaciosYParseadorInt(etxtREFMisc.getText().toString()),
                controlDeVaciosYParseadorInt(etxtREFTemp.getText().toString())
            ).toString()
        )


        txtvWillMod.setText(txtvDEXMod.getText().toString())
        txtvWillTotal.setText(
            hacerTotal(
                controlDeVaciosYParseadorInt(txtvWillBase.getText().toString()),
                controlDeVaciosYParseadorInt(txtvWillMod.getText().toString()),
                controlDeVaciosYParseadorInt(etxtWillMisc.getText().toString()),
                controlDeVaciosYParseadorInt(etxtWillTemp.getText().toString())
            ).toString()
        )
    }

//    private fun tablaDeHabilidades() {
//        // 44
//
//        txtvAcrobaciasMod.setText(txtvDEXMod.getText().toString())
//        txtvAcrobaciasTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtvAcrobaciasPuntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtvAcrobaciasMod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxtAcrobaciasMisc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxtAcrobaciasPenalizador.getText().toString())
//            ).toString()
//        )
//
//        txtvActuarMod.setText(txtvCHAMod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtvActuarPuntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtvActuarMod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxtActuarMisc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxtActuarPenalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//        txtv_Mod.setText(txtv_Mod.getText().toString())
//        txtvActuarTotal.setText(
//            hacerTotal(
//                controlDeVaciosYParseadorInt(txtv_Puntos.getText().toString()),
//                controlDeVaciosYParseadorInt(txtv_Mod.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Misc.getText().toString()),
//                controlDeVaciosYParseadorInt(etxt_Penalizador.getText().toString())
//            ).toString()
//        )
//
//
//    }

    private fun controlDeVaciosYParseadorInt(cadena: String): Int {
        var num :Int = 0
        try {
            num = Integer.parseInt(cadena)
        } catch (e:Exception) {
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

    private fun inicializarVariables() {

        // Aquí se inicializan todas las variables

        etxtNombrePj = findViewById(R.id.etxtNombrePj)
        txtvRazaPj = findViewById(R.id.txtvRazaPj)
        txtvClasePj = findViewById(R.id.txtvClasePj)

        // PUNTOS DE HABILIDAD

        txtvSTRTotal = findViewById(R.id.txtvSTRTotal)
        txtvSTRMod = findViewById(R.id.txtvSTRMod)
        txtvSTRBase = findViewById(R.id.txtvSTRBase)
        etxtSTRMisc = findViewById(R.id.etxtSTRMisc)
        etxtSTRTemp = findViewById(R.id.etxtSTRTemp)

        txtvDEXTotal = findViewById(R.id.txtvDEXTotal)
        txtvDEXMod = findViewById(R.id.txtvDEXMod)
        txtvDEXBase = findViewById(R.id.txtvDEXBase)
        etxtDEXMisc = findViewById(R.id.etxtDEXMisc)
        etxtDEXTemp = findViewById(R.id.etxtDEXTemp)

        txtvCONTotal = findViewById(R.id.txtvCONTotal)
        txtvCONMod = findViewById(R.id.txtvCONMod)
        txtvCONBase = findViewById(R.id.txtvCONBase)
        etxtCONMisc = findViewById(R.id.etxtCONMisc)
        etxtCONTemp = findViewById(R.id.etxtCONTemp)

        txtvINTTotal = findViewById(R.id.txtvINTTotal)
        txtvINTMod = findViewById(R.id.txtvINTMod)
        txtvINTBase = findViewById(R.id.txtvINTBase)
        etxtINTMisc = findViewById(R.id.etxtINTMisc)
        etxtINTTemp = findViewById(R.id.etxtINTTemp)

        txtvWISTotal = findViewById(R.id.txtvWISTotal)
        txtvWISMod = findViewById(R.id.txtvWISMod)
        txtvWISBase = findViewById(R.id.txtvWISBase)
        etxtWISMisc = findViewById(R.id.etxtWISMisc)
        etxtWISTemp = findViewById(R.id.etxtWISTemp)

        txtvCHATotal = findViewById(R.id.txtvCHATotal)
        txtvCHAMod = findViewById(R.id.txtvCHAMod)
        txtvCHABase = findViewById(R.id.txtvCHABase)
        etxtCHAMisc = findViewById(R.id.etxtCHAMisc)
        etxtCHATemp = findViewById(R.id.etxtCHATemp)

        // SALVACIONES

        txtvFortitudeTotal = findViewById(R.id.txtvFortitudeTotal)
        txtvFortitudeMod = findViewById(R.id.txtvFortitudeMod)
        txtvFortitudeBase = findViewById(R.id.txtvFortitudeBase)
        etxtFortitudeMisc = findViewById(R.id.etxtFortitudeMisc)
        etxtFortitudeTemp = findViewById(R.id.etxtFortitudeTemp)

        txtvREFTotal = findViewById(R.id.txtvReflexTotal)
        txtvREFMod = findViewById(R.id.txtvReflexMod)
        txtvREFBase = findViewById(R.id.txtvReflexBase)
        etxtREFMisc = findViewById(R.id.etxtReflexMisc)
        etxtREFTemp = findViewById(R.id.etxtReflexTemp)

        txtvWillTotal = findViewById(R.id.txtvWillTotal)
        txtvWillMod = findViewById(R.id.txtvWillMod)
        txtvWillBase = findViewById(R.id.txtvWillBase)
        etxtWillMisc = findViewById(R.id.etxtWillMisc)
        etxtWillTemp = findViewById(R.id.etxtWillTemp)

        // HABILIDADES

        txtvAcrobaciasTotal = findViewById(R.id.txtvAcrobaciasTotal)
        txtvAcrobaciasMod = findViewById(R.id.txtvAcrobaciasMod)
        txtvAcrobaciasPuntos = findViewById(R.id.txtvAcrobaciasPuntos)
        etxtAcrobaciasMisc = findViewById(R.id.etxtAcrobaciasMisc)
        etxtAcrobaciasPenalizador = findViewById(R.id.etxtAcrobaciasPenalizador)

        txtvActuarTotal = findViewById(R.id.txtvActuarTotal)
        txtvActuarMod = findViewById(R.id.txtvActuarMod)
        txtvActuarPuntos = findViewById(R.id.txtvActuarPuntos)
        etxtActuarMisc = findViewById(R.id.etxtActuarMisc)
        etxtActuarPenalizador = findViewById(R.id.etxtActuarPenalizador)

        txtvArtesaniaTotal = findViewById(R.id.txtvArtesaniaTotal)
        txtvArtesaniaMod = findViewById(R.id.txtvArtesaniaMod)
        txtvArtesaniaPuntos = findViewById(R.id.txtvArtesaniaPuntos)
        etxtArtesaniaMisc = findViewById(R.id.etxtArtesaniaMisc)
        etxtArtesaniaPenalizador = findViewById(R.id.etxtArtesaniaPenalizador)

        txtvADLFTotal = findViewById(R.id.txtvADLFTotal)
        txtvADLFMod = findViewById(R.id.txtvADLFMod)
        txtvADLFPuntos = findViewById(R.id.txtvADLFPuntos)
        etxtADLFMisc = findViewById(R.id.etxtADLFMisc)
        etxtADLFPenalizador = findViewById(R.id.etxtADLFPenalizador)

        txtvAITotal = findViewById(R.id.txtvAITotal)
        txtvAIMod = findViewById(R.id.txtvAIMod)
        txtvAIPuntos = findViewById(R.id.txtvAIPuntos)
        etxtAIMisc = findViewById(R.id.etxtAIMisc)
        etxtAIPenalizador = findViewById(R.id.etxtAIPenalizador)

        txtvAvistarTotal= findViewById(R.id.txtvAvistarTotal)
        txtvAvistarMod = findViewById(R.id.txtvAvistarMod)
        txtvAvistarPuntos = findViewById(R.id.txtvAvistarPuntos)
        etxtAvistarMisc = findViewById(R.id.etxtAvistarMisc)
        etxtAvistarPenalizador = findViewById(R.id.etxtAvistarPenalizador)

        txtvBuscarTotal=findViewById(R.id.txtvBuscarTotal)
        txtvBuscarMod = findViewById(R.id.txtvBuscarMod)
        txtvBuscarPuntos = findViewById(R.id.txtvBuscarPuntos)
        etxtBuscarMisc = findViewById(R.id.etxtBuscarMisc)
        etxtBuscarPenalizador = findViewById(R.id.etxtBuscarPenalizador)

        txtvConcentracionTotal = findViewById(R.id.txtvConcentracionTotal)
        txtvConcentracionMod = findViewById(R.id.txtvConcentracionMod)
        txtvConcentracionPuntos = findViewById(R.id.txtvConcentracionPuntos)
        etxtConcentracionMisc = findViewById(R.id.etxtConcentracionMisc)
        etxtConcentracionPenalizador = findViewById(R.id.etxtConcentracionPenalizador)

        txtvCurarTotal = findViewById(R.id.txtvCurarTotal)
        txtvCurarMod = findViewById(R.id.txtvCurarMod)
        txtvCurarPuntos = findViewById(R.id.txtvCurarPuntos)
        etxtCurarMisc = findViewById(R.id.etxtCurarMisc)
        etxtCurarPenalizador = findViewById(R.id.etxtCurarPenalizador)

        txtvDDTotal = findViewById(R.id.txtvDDTotal)
        txtvDDMod = findViewById(R.id.txtvDDMod)
        txtvDDPuntos = findViewById(R.id.txtvDDPuntos)
        etxtDDMisc = findViewById(R.id.etxtDDMisc)
        etxtDDPenalizador = findViewById(R.id.etxtDDPenalizador)

        txtvDETotal = findViewById(R.id.txtvDETotal)
        txtvDEMod = findViewById(R.id.txtvDEMod)
        txtvDEPuntos = findViewById(R.id.txtvDEPuntos)
        etxtDEMisc = findViewById(R.id.etxtDEMisc)
        etxtDEPenalizador = findViewById(R.id.etxtDEPenalizador)

        txtvDiplomaciaTotal = findViewById(R.id.txtvDiplomaciaTotal)
        txtvDiplomaciaMod = findViewById(R.id.txtvDiplomaciaMod)
        txtvDiplomaciaPuntos = findViewById(R.id.txtvDiplomaciaPuntos)
        etxtDiplomaciaMisc = findViewById(R.id.etxtDiplomaciaMisc)
        etxtDiplomaciaPenalizador = findViewById(R.id.etxtDiplomaciaPenalizador)

        txtvDisfrazarseTotal = findViewById(R.id.txtvDisfrazarseTotal)
        txtvDisfrazarseMod = findViewById(R.id.txtvDisfrazarseMod)
        txtvDisfrazarsePuntos = findViewById(R.id.txtvDisfrazarsePuntos)
        etxtDisfrazarseMisc = findViewById(R.id.etxtDisfrazarseMisc)
        etxtDisfrazarsePenalizador = findViewById(R.id.etxtDisfrazarsePenalizador)

        txtvEngannarTotal = findViewById(R.id.txtvEngannarTotal)
        txtvEngannarMod = findViewById(R.id.txtvEngannarMod)
        txtvEngannarPuntos = findViewById(R.id.txtvEngannarPuntos)
        etxtEngannarMisc = findViewById(R.id.etxtEngannarMisc)
        etxtEngannarPenalizador = findViewById(R.id.etxtEngannarPenalizador)

        txtvEquilibrioTotal = findViewById(R.id.txtvEquilibrioTotal)
        txtvEquilibrioMod = findViewById(R.id.txtvEquilibrioMod)
        txtvEquilibrioPuntos = findViewById(R.id.txtvEquilibrioPuntos)
        etxtEquilibrioMisc = findViewById(R.id.etxtEquilibrioMisc)
        etxtEquilibrioPenalizador = findViewById(R.id.etxtEquilibrioPenalizador)

        txtvEscalarTotal = findViewById(R.id.txtvEscalarTotal)
        txtvEscalarMod = findViewById(R.id.txtvEscalarMod)
        txtvEscalarPuntos = findViewById(R.id.txtvEscalarPuntos)
        etxtEscalarMisc = findViewById(R.id.etxtEscalarMisc)
        etxtEscalarPenalizador = findViewById(R.id.etxtEscalarPenalizador)

        txtvEscucharTotal = findViewById(R.id.txtvEscucharTotal)
        txtvEscucharMod = findViewById(R.id.txtvEscucharMod)
        txtvEscucharPuntos = findViewById(R.id.txtvEscucharPuntos)
        etxtEscucharMisc = findViewById(R.id.etxtEscucharMisc)
        etxtEscucharPenalizador = findViewById(R.id.etxtEscucharPenalizador)

        txtvFalsificacionTotal = findViewById(R.id.txtvFalsificacionTotal)
        txtvFalsificacionMod = findViewById(R.id.txtvFalsificacionMod)
        txtvFalsificacionPuntos = findViewById(R.id.txtvFalsificacionPuntos)
        etxtFalsificacionMisc = findViewById(R.id.etxtFalsificacionMisc)
        etxtFalsificacionPenalizador = findViewById(R.id.etxtFalsificacionPenalizador)

        txtvHechiceriaTotal = findViewById(R.id.txtvHechiceriaTotal)
        txtvHechiceriaMod = findViewById(R.id.txtvHechiceriaMod)
        txtvHechiceriaPuntos = findViewById(R.id.txtvHechiceriaPuntos)
        etxtHechiceriaMisc = findViewById(R.id.etxtHechiceriaMisc)
        etxtHechiceriaPenalizador = findViewById(R.id.etxtHechiceriaPenalizador)

        txtvIntimidarTotal = findViewById(R.id.txtvIntimidarTotal)
        txtvIntimidarMod = findViewById(R.id.txtvIntimidarMod)
        txtvIntimidarPuntos = findViewById(R.id.txtvIntimidarPuntos)
        etxtIntimidarMisc = findViewById(R.id.etxtIntimidarMisc)
        etxtIntimidarPenalizador = findViewById(R.id.etxtIntimidarPenalizador)

        txtvJDMTotal = findViewById(R.id.txtvJDMTotal)
        txtvJDMMod = findViewById(R.id.txtvJDMMod)
        txtvJDMPuntos = findViewById(R.id.txtvJDMPuntos)
        etxtJDMMisc = findViewById(R.id.etxtJDMMisc)
        etxtJDMPenalizador = findViewById(R.id.etxtJDMPenalizador)

        txtvMATotal = findViewById(R.id.txtvMATotal)
        txtvMAMod = findViewById(R.id.txtvMAMod)
        txtvMAPuntos = findViewById(R.id.txtvMAPuntos)
        etxtMAMisc = findViewById(R.id.etxtMAMisc)
        etxtMAPenalizador = findViewById(R.id.etxtMAPenalizador)

        txtvMontarTotal = findViewById(R.id.txtvMontarTotal)
        txtvMontarMod = findViewById(R.id.txtvMontarMod)
        txtvMontarPuntos = findViewById(R.id.txtvMontarPuntos)
        etxtMontarMisc = findViewById(R.id.etxtMontarMisc)
        etxtMontarPenalizador = findViewById(R.id.etxtMontarPenalizador)

        txtvMESTotal = findViewById(R.id.txtvMESTotal)
        txtvMESMod = findViewById(R.id.txtvMESMod)
        txtvMESPuntos = findViewById(R.id.txtvMESPuntos)
        etxtMESMisc = findViewById(R.id.etxtMESMisc)
        etxtMESPenalizador = findViewById(R.id.etxtMESPenalizador)

        txtvNadarTotal = findViewById(R.id.txtvNadarTotal)
        txtvNadarMod = findViewById(R.id.txtvNadarMod)
        txtvNadarPuntos = findViewById(R.id.txtvNadarPuntos)
        etxtNadarMisc = findViewById(R.id.etxtNadarMisc)
        etxtNadarPenalizador = findViewById(R.id.etxtNadarPenalizador)

        txtvOcultarTotal = findViewById(R.id.txtvOcultarTotal)
        txtvOcultarMod = findViewById(R.id.txtvOcultarMod)
        txtvOcultarPuntos = findViewById(R.id.txtvOcultarPuntos)
        etxtOcultarMisc = findViewById(R.id.etxtOcultarMisc)
        etxtOcultarPenalizador = findViewById(R.id.etxtOcultarPenalizador)

        txtvProfesionTotal = findViewById(R.id.txtvProfesionTotal)
        txtvProfesionMod = findViewById(R.id.txtvProfesionMod)
        txtvProfesionPuntos = findViewById(R.id.txtvProfesionPuntos)
        etxtProfesionMisc = findViewById(R.id.etxtProfesionMisc)
        etxtProfesionPenalizador = findViewById(R.id.etxtProfesionPenalizador)

        txtvRITotal = findViewById(R.id.txtvRITotal)
        txtvRIMod = findViewById(R.id.txtvRIMod)
        txtvRIPuntos = findViewById(R.id.txtvRIPuntos)
        etxtRIMisc = findViewById(R.id.etxtRIMisc)
        etxtRIPenalizador = findViewById(R.id.etxtRIPenalizador)

        txtvSATotal = findViewById(R.id.txtvSATotal)
        txtvSAMod = findViewById(R.id.txtvSAMod)
        txtvSAPuntos = findViewById(R.id.txtvSAPuntos)
        etxtSAMisc = findViewById(R.id.etxtSAMisc)
        etxtSAPenalizador = findViewById(R.id.etxtSAPenalizador)

        txtvSHTotal = findViewById(R.id.txtvSHTotal)
        txtvSHMod = findViewById(R.id.txtvSHMod)
        txtvSHPuntos = findViewById(R.id.txtvSHPuntos)
        etxtSHMisc = findViewById(R.id.etxtSHMisc)
        etxtSHPenalizador = findViewById(R.id.etxtSHPenalizador)

        txtvSMTotal = findViewById(R.id.txtvSMTotal)
        txtvSMMod = findViewById(R.id.txtvSMMod)
        txtvSMPuntos = findViewById(R.id.txtvSMPuntos)
        etxtSMMisc = findViewById(R.id.etxtSMMisc)
        etxtSMPenalizador = findViewById(R.id.etxtSMPenalizador)

        txtvSGTotal = findViewById(R.id.txtvSGTotal)
        txtvSGMod = findViewById(R.id.txtvSGMod)
        txtvSGPuntos = findViewById(R.id.txtvSGPuntos)
        etxtSGMisc = findViewById(R.id.etxtSGMisc)
        etxtSGPenalizador = findViewById(R.id.etxtSGPenalizador)

        txtvSITotal = findViewById(R.id.txtvSITotal)
        txtvSIMod = findViewById(R.id.txtvSIMod)
        txtvSIPuntos = findViewById(R.id.txtvSIPuntos)
        etxtSIMisc = findViewById(R.id.etxtSIMisc)
        etxtSIPenalizador = findViewById(R.id.etxtSIPenalizador)

        txtvSLTotal = findViewById(R.id.txtvSLTotal)
        txtvSLMod = findViewById(R.id.txtvSLMod)
        txtvSLPuntos = findViewById(R.id.txtvSLPuntos)
        etxtSLMisc = findViewById(R.id.etxtSLMisc)
        etxtSLPenalizador = findViewById(R.id.etxtSLPenalizador)

        txtvSLPTotal = findViewById(R.id.txtvSLPTotal)
        txtvSLPMod = findViewById(R.id.txtvSLPMod)
        txtvSLPPuntos = findViewById(R.id.txtvSLPPuntos)
        etxtSLPMisc = findViewById(R.id.etxtSLPMisc)
        etxtSLPPenalizador = findViewById(R.id.etxtSLPPenalizador)

        txtvSNaTotal = findViewById(R.id.txtvSNaTotal)
        txtvSNaMod = findViewById(R.id.txtvSNaMod)
        txtvSNaPuntos = findViewById(R.id.txtvSNaPuntos)
        etxtSNaMisc = findViewById(R.id.etxtSNaMisc)
        etxtSNaPenalizador = findViewById(R.id.etxtSNaPenalizador)

        txtvSNoTotal = findViewById(R.id.txtvSNoTotal)
        txtvSNoMod = findViewById(R.id.txtvSNoMod)
        txtvSNoPuntos = findViewById(R.id.txtvSNoPuntos)
        etxtSNoMisc = findViewById(R.id.etxtSNoMisc)
        etxtSNoPenalizador = findViewById(R.id.etxtSNoPenalizador)

        txtvSRTotal = findViewById(R.id.txtvSRTotal)
        txtvSRMod = findViewById(R.id.txtvSRMod)
        txtvSRPuntos = findViewById(R.id.txtvSRPuntos)
        etxtSRMisc = findViewById(R.id.etxtSRMisc)
        etxtSRPenalizador = findViewById(R.id.etxtSRPenalizador)

        txtvSaltarTotal = findViewById(R.id.txtvSaltarTotal)
        txtvSaltarMod = findViewById(R.id.txtvSaltarMod)
        txtvSaltarPuntos = findViewById(R.id.txtvSaltarPuntos)
        etxtSaltarMisc = findViewById(R.id.etxtSaltarMisc)
        etxtSaltarPenalizador = findViewById(R.id.etxtSaltarPenalizador)

        txtvSupervivenciaTotal = findViewById(R.id.txtvSupervivenciaTotal)
        txtvSupervivenciaMod = findViewById(R.id.txtvSupervivenciaMod)
        txtvSupervivenciaPuntos = findViewById(R.id.txtvSupervivenciaPuntos)
        etxtSupervivenciaMisc = findViewById(R.id.etxtSupervivenciaMisc)
        etxtSupervivenciaPenalizador = findViewById(R.id.etxtSupervivenciaPenalizador)

        txtvTasarTotal = findViewById(R.id.txtvTasarTotal)
        txtvTasarMod = findViewById(R.id.txtvTasarMod)
        txtvTasarPuntos = findViewById(R.id.txtvTasarPuntos)
        etxtTasarMisc = findViewById(R.id.etxtTasarMisc)
        etxtTasarPenalizador = findViewById(R.id.etxtTasarPenalizador)

        txtvUCTotal = findViewById(R.id.txtvUCTotal)
        txtvUCMod = findViewById(R.id.txtvUCMod)
        txtvUCPuntos = findViewById(R.id.txtvUCPuntos)
        etxtUCMisc = findViewById(R.id.etxtUCMisc)
        etxtUCPenalizador = findViewById(R.id.etxtUCPenalizador)

        txtvUOMTotal = findViewById(R.id.txtvUOMTotal)
        txtvUOMMod = findViewById(R.id.txtvUOMMod)
        txtvUOMPuntos = findViewById(R.id.txtvUOMPuntos)
        etxtUOMMisc = findViewById(R.id.etxtUOMMisc)
        etxtUOMPenalizador = findViewById(R.id.etxtUOMPenalizador)


        /*
        *  Declarar los listener
        */



    }

    


}