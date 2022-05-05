package com.tfg.lr.roleroll

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
        var tempSTR = 0

        var baseDEX = 10
        var miscDEX = 0
        var tempDEX = 0

        var baseCON = 10
        var miscCON = 0
        var tempCON = 0

        var baseINT = 10
        var miscINT = 0
        var tempINT = 0

        var baseWIS = 10
        var miscWIS = 0
        var tempWIS = 0

        var baseCHA = 10
        var miscCHA = 0
        var tempCHA = 0


    }

}