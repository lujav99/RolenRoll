package com.tfg.lr.roleroll

import android.widget.EditText
import android.widget.TextView

enum class Razas {
    Elfo,
    Enano,
    Gnomo,
    Humano,
    Mediano,
    Semielfo,
    Semiorco
}

enum class Clase {
    Bárbaro,
    Bardo,
    Clerigo,
    Druida,
    Explorador,
    Guerrero,
    Hechicero,
    Mago,
    Monje,
    Paladín,
    Pícaro
}

class Personaje {

    companion object {

        lateinit var nombre: String
        lateinit var raza: Razas
        lateinit var clase: Clase
        var ps: Int = 0

        var baseSTR = 10
        var miscSTR = 0

        var baseDEX = 10
        var miscDEX = 0

        var baseCON = 10
        var miscCON = 0

        var baseINT = 10
        var miscINT = 0

        var baseWIS = 10
        var miscWIS = 0

        var baseCHA = 10
        var miscCHA = 0

        var baseFortitude = 0
        var miscFortitude = 0

        var baseReflex = 0
        var miscReflex = 0

        var baseWill = 0
        var miscWill = 0

        var puntosBaseAcrobacias = 0
        var miscAcrobacias = 0
        var penalizadorAcrobacias = 0

        var puntosBaseActuar = 0
        var miscActuar = 0
        var penalizadorActuar = 0

        var puntosBaseArtesania = 0
        var miscArtesania = 0
        var penalizadorArtesania = 0

        var puntosBaseADLF = 0
        var miscADLF = 0
        var penalizadorADLF = 0

        var puntosBaseAI = 0
        var miscAI = 0
        var penalizadorAI = 0

        var puntosBaseAvistar = 0
        var miscAvistar = 0
        var penalizadorAvistar = 0

        var puntosBaseBuscar = 0
        var miscBuscar = 0
        var penalizadorBuscar = 0

        var puntosBaseConcentracion = 0
        var miscConcentracion = 0
        var penalizadorConcentracion = 0

        var puntosBaseCurar = 0
        var miscCurar = 0
        var penalizadorCurar = 0

        var puntosBaseDD = 0
        var miscDD = 0
        var penalizadortDD= 0

        var puntosBaseDE = 0
        var miscDE = 0
        var penalizadorDE = 0

        var puntosBaseDiplomacia = 0
        var miscDiplomacia = 0
        var penalizadorDiplomacia = 0

        var puntosBaseDisfrazarse = 0
        var miscDisfrazarse = 0
        var penalizadorDisfrazarse = 0

        var puntosBaseEngannar = 0
        var miscEngannar = 0
        var penalizadorEngannar = 0

        var puntosBaseEquilibrio = 0
        var miscEquilibrio = 0
        var penalizadorEquilibrio = 0

        var puntosBaseEscalar = 0
        var miscEscalar = 0
        var penalizadorEscalar = 0

        var puntosBaseEscuchar = 0
        var miscEscuchar = 0
        var penalizadorEscuchar = 0

        var puntosBaseFalsificacion = 0
        var miscFalsificacion = 0
        var penalizadorFalsificacion = 0

        var puntosBaseHechiceria = 0
        var miscHechiceria = 0
        var penalizadortHechiceria = 0

        var puntosBAseIntimidar = 0
        var miscIntimidar = 0
        var penalizadorIntimidar = 0

        var puntosJDM = 0
        var miscJDM = 0
        var penalizadorJDM = 0

        var puntosBaseMA = 0
        var miscMA = 0
        var penalizadorMA = 0

        var puntosBaseMontar = 0
        var miscMontar = 0
        var penalizadorMontar = 0

        var puntosBaseMES = 0
        var miscMES = 0
        var penalizadorMES = 0

        var puntosBaseNadar = 0
        var miscNadar = 0
        var penalizadorNadar = 0

        var puntosBaseOcultar = 0
        var miscOcultar = 0
        var penalizadorOcultar = 0

        var puntosBaseProfesion = 0
        var miscProfesion = 0
        var penalizadorProfesion = 0

        var puntosBaseRI = 0
        var miscRI = 0
        var penalizadorRI = 0

        var puntosBaseSA = 0
        var miscSA = 0
        var penalizadorSA = 0

        var puntosBaseSH = 0
        var miscSHMisc = 0
        var penalizadorSH = 0

        var puntosBaseSM = 0
        var miscSM = 0
        var penalizadorSM = 0

        var puntosBaseSG = 0
        var miscSG = 0
        var penalizadorSG = 0

        var puntosBaseSI = 0
        var miscSI = 0
        var penalizadorSI = 0

        var puntosBaseSL = 0
        var miscSL = 0
        var penalizadorSL = 0

        var puntosBaseSLP = 0
        var miscSLP = 0
        var penalizadorSLP = 0

        var puntosBaseSNa = 0
        var miscSNa = 0
        var penalizadorSNa = 0

        var puntosBaseSNo = 0
        var miscSNo = 0
        var penalizadorSNo = 0

        var puntosBaseSR = 0
        var miscSR = 0
        var penalizadorSR = 0

        var puntosBaseSaltar = 0
        var miscSaltar = 0
        var penalizadorSaltar = 0

        var puntosBaseSupervivencia = 0
        var miscSupervivencia = 0
        var penalizadorSupervivencia = 0

        var puntosBaseTasar = 0
        var miscTasar = 0
        var penalizadorTasar = 0

        var puntosBaseUC = 0
        var miscUC = 0
        var penalizadorUC = 0

        var puntosBaseUOM = 0
        var miscUOM = 0
        var penalizadorUOM = 0


        fun leerEnBD() {

        }

        fun eliminarEnBD() {

        }

        fun inicializarRazaYClase() {
            // inicializar Raza
            when(raza) {

            }

            // inicializar Clase
            when(clase) {

            }
        }

    }

}