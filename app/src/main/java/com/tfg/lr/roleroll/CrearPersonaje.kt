package com.tfg.lr.roleroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class CrearPersonaje : AppCompatActivity() {

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
    private lateinit var txtvAvistarPenalizador:TextView

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
    private lateinit var txtvSIrMod:TextView
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
        setContentView(R.layout.activity_crear_personaje)

        inicializarVariables()


    }

    private fun inicializarVariables() {
        TODO("Iniciar todas las variables y asignar el onClickListener")
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







    }















}