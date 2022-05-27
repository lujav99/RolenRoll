package com.tfg.lr.roleroll.alfombra

var listaPjs = mutableListOf<Personaje>()

class Personaje(
    val id: Int? = listaPjs.size
) {


    var nivel: Int = 0
    var email: String? = null
    var nombre: String? = null
    var raza: String? = null
    var clase: String? = null
    var tamanno: String? = null
    var ps: Int = 0
    var ac: Int = 0
    var ab: Int = 0
    var habilidadesRaza: String? = null
    var habilidadesClase: String? = null
    var dotes: String? = null
    var inventario: String? = null
    var lenguajes: String? = null
    var otros: String? = null

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
    var penalizadorDD = 0

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
    var penalizadorHechiceria = 0

    var puntosBaseIntimidar = 0
    var miscIntimidar = 0
    var penalizadorIntimidar = 0

    var puntosBaseJDM = 0
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

        Reutilizables.db.collection("personajes").document(email.toString()).get().toString()

        println()
    }

    fun eliminarEnBD() {

    }

    fun guardarEnBD() {
        Reutilizables.db.collection("personajes").document(email.toString()).set(
            hashMapOf(
                "nivel" to nivel,
                "nombre" to nombre,
                "raza" to raza,
                "clase" to clase,
                "tamanno" to tamanno,
                "ps" to ps,
                "ac" to ac,
                "ab" to ab,
                "habilidadesRaza" to habilidadesRaza,
                "habilidadesClase" to habilidadesClase,
                "dotes" to dotes,
                "inventario" to inventario,
                "lenguajes" to lenguajes,
                "otros" to otros,
                "baseSTR" to baseSTR,
                "miscSTR" to miscSTR,
                "baseDEX" to baseDEX,
                "miscDEX" to miscDEX,
                "baseCON" to baseCON,
                "miscCON" to miscCON,
                "baseINT" to baseINT,
                "miscINT" to miscINT,
                "baseWIS" to baseWIS,
                "miscWIS" to miscWIS,
                "baseCHA" to baseCHA,
                "miscCHA" to miscCHA,
                "baseFortitude" to baseFortitude,
                "miscFortitude" to miscFortitude,
                "baseReflex" to baseReflex,
                "miscReflex" to miscReflex,
                "baseWill" to baseWill,
                "miscWill" to miscWill,
                "puntosBaseAcrobacias" to puntosBaseAcrobacias,
                "miscAcrobacias" to miscAcrobacias,
                "penalizadorAcrobacias" to penalizadorAcrobacias,
                "puntosBaseActuar" to puntosBaseActuar,
                "miscActuar" to miscActuar,
                "penalizadorActuar" to penalizadorActuar,
                "puntosBaseArtesania" to puntosBaseArtesania,
                "miscArtesania" to miscArtesania,
                "penalizadorArtesania" to penalizadorArtesania,
                "puntosBaseADLF" to puntosBaseADLF,
                "miscADLF" to miscADLF,
                "penalizadorADLF" to penalizadorADLF,
                "puntosBaseAI" to puntosBaseAI,
                "miscAI" to miscAI,
                "penalizadorAI" to penalizadorAI,
                "puntosBaseAvistar" to puntosBaseAvistar,
                "miscAvistar" to miscAvistar,
                "penalizadorAvistar" to penalizadorAvistar,
                "puntosBaseBuscar" to puntosBaseBuscar,
                "miscBuscar" to miscBuscar,
                "penalizadorBuscar" to penalizadorBuscar,
                "puntosBaseConcentracion" to puntosBaseConcentracion,
                "miscConcentracion" to miscConcentracion,
                "penalizadorConcentracion" to penalizadorConcentracion,
                "puntosBaseCurar" to puntosBaseCurar,
                "miscCurar" to miscCurar,
                "penalizadorCurar" to penalizadorCurar,
                "puntosBaseDD" to puntosBaseDD,
                "miscDD" to miscDD,
                "penalizadorDD" to penalizadorDD,
                "puntosBaseDE" to puntosBaseDE,
                "miscDE" to miscDE,
                "penalizadorDE" to penalizadorDE,
                "puntosBaseDiplomacia" to puntosBaseDiplomacia,
                "miscDiplomacia" to miscDiplomacia,
                "penalizadorDiplomacia" to penalizadorDiplomacia,
                "puntosBaseDisfrazarse" to puntosBaseDisfrazarse,
                "miscDisfrazarse" to miscDisfrazarse,
                "penalizadorDisfrazarse" to penalizadorDisfrazarse,
                "puntosBaseEngannar" to puntosBaseEngannar,
                "miscEngannar" to miscEngannar,
                "penalizadorEngannar" to penalizadorEngannar,
                "puntosBaseEquilibrio" to puntosBaseEquilibrio,
                "miscEquilibrio" to miscEquilibrio,
                "penalizadorEquilibrio" to penalizadorEquilibrio,
                "puntosBaseEscalar" to puntosBaseEscalar,
                "miscEscalar" to miscEscalar,
                "penalizadorEscalar" to penalizadorEscalar,
                "puntosBaseEscuchar" to puntosBaseEscuchar,
                "miscEscuchar" to miscEscuchar,
                "penalizadorEscuchar" to penalizadorEscuchar,
                "puntosBaseFalsificacion" to puntosBaseFalsificacion,
                "miscFalsificacion" to miscFalsificacion,
                "penalizadorFalsificacion" to penalizadorFalsificacion,
                "puntosBaseHechiceria" to puntosBaseHechiceria,
                "miscHechiceria" to miscHechiceria,
                "penalizadorHechiceria" to penalizadorHechiceria,
                "puntosBaseIntimidar" to puntosBaseIntimidar,
                "miscIntimidar" to miscIntimidar,
                "penalizadorIntimidar" to penalizadorIntimidar,
                "puntosBaseJDM" to puntosBaseJDM,
                "miscJDM" to miscJDM,
                "penalizadorJDM" to penalizadorJDM,
                "puntosBaseMA" to puntosBaseMA,
                "miscMA" to miscMA,
                "penalizadorMA" to penalizadorMA,
                "puntosBaseMontar" to puntosBaseMontar,
                "miscMontar" to miscMontar,
                "penalizadorMontar" to penalizadorMontar,
                "puntosBaseMES" to puntosBaseMES,
                "miscMES" to miscMES,
                "penalizadorMES" to penalizadorMES,
                "puntosBaseNadar" to puntosBaseNadar,
                "miscNadar" to miscNadar,
                "penalizadorNadar" to penalizadorNadar,
                "puntosBaseOcultar" to puntosBaseOcultar,
                "miscOcultar" to miscOcultar,
                "penalizadorOcultar" to penalizadorOcultar,
                "puntosBaseProfesion" to puntosBaseProfesion,
                "miscProfesion" to miscProfesion,
                "penalizadorProfesion" to penalizadorProfesion,
                "puntosBaseRI" to puntosBaseRI,
                "miscRI" to miscRI,
                "penalizadorRI" to penalizadorRI,
                "puntosBaseSA" to puntosBaseSA,
                "miscSA" to miscSA,
                "penalizadorSA" to penalizadorSA,
                "puntosBaseSH" to puntosBaseSH,
                "miscSHMisc" to miscSHMisc,
                "penalizadorSH" to penalizadorSH,
                "puntosBaseSM" to puntosBaseSM,
                "miscSM" to miscSM,
                "penalizadorSM" to penalizadorSM,
                "puntosBaseSG" to puntosBaseSG,
                "miscSG" to miscSG,
                "penalizadorSG" to penalizadorSG,
                "puntosBaseSI" to puntosBaseSI,
                "miscSI" to miscSI,
                "penalizadorSI" to penalizadorSI,
                "puntosBaseSL" to puntosBaseSL,
                "miscSL" to miscSL,
                "penalizadorSL" to penalizadorSL,
                "puntosBaseSLP" to puntosBaseSLP,
                "miscSLP" to miscSLP,
                "penalizadorSLP" to penalizadorSLP,
                "puntosBaseSNa" to puntosBaseSNa,
                "miscSNa" to miscSNa,
                "penalizadorSNa" to penalizadorSNa,
                "puntosBaseSNo" to puntosBaseSNo,
                "miscSNo" to miscSNo,
                "penalizadorSNo" to penalizadorSNo,
                "puntosBaseSR" to puntosBaseSR,
                "miscSR" to miscSR,
                "penalizadorSR" to penalizadorSR,
                "puntosBaseSaltar" to puntosBaseSaltar,
                "miscSaltar" to miscSaltar,
                "penalizadorSaltar" to penalizadorSaltar,
                "puntosBaseSupervivencia" to puntosBaseSupervivencia,
                "miscSupervivencia" to miscSupervivencia,
                "penalizadorSupervivencia" to penalizadorSupervivencia,
                "puntosBaseTasar" to puntosBaseTasar,
                "miscTasar" to miscTasar,
                "penalizadorTasar" to penalizadorTasar,
                "puntosBaseUC" to puntosBaseUC,
                "miscUC" to miscUC,
                "penalizadorUC" to penalizadorUC,
                "puntosBaseUOM" to puntosBaseUOM,
                "miscUOM" to miscUOM,
                "penalizadorUOM" to penalizadorUOM

            )
        )
    }


}