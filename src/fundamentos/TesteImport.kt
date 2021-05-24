package fundamentos


import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda
import fundamentos.pacoteB.soma
import fundamentos.pacoteB.subtracao

/* Lista de pacotes importados por padrão:
kotlin.*
kotlin.annotation.*
kotlin.collections.*
kotlin.comparisons.* (desde 1.1)
kotlin.io.*

kotlin.ranges.*
kotlin.sequences.*
kotlin.text.*
Quando executado na JVM são adicionados também:
java.lang.*
kotlin.jvm.*

 */

fun main(args: Array<String>) {

    kotlin.io.println("Hello, World")

    val coisa = Coisa("Bola")

    println(FaceMoeda.COROA)
    println("Soma ${soma(2,3)}  Subtração ${subtracao(4,2)}")



}