package fundamentos.operadores

import java.util.*

fun main(args: Array<String>) {

    var num1: String = "teste"
    var num2: String = num1
    var num3: Int = 1
    var num4 : Int = 1

    println("Banana" === "Banana")
    println(num1 === num2)
    println(num3 === num4)
    println (num1 !== num2)


    val d1 = Date(0)
    val d2 = Date(0)

    println(d1 === d2)

    //Quando usamos == iguais comparamos a string, quando utilizado === comparamos a referencia na memoria

    // Igualdade referencial
    println("Resultado com '===' ${d1 === d2}")
    // Igualdade estrutural
    println("Resultado com '==' ${d1 == d2}")
}