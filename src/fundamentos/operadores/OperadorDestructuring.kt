package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)
// tira os elementos da estrutura de objetos: ex: marca e modelo
fun main(args: Array<String>) {
    val(marca, modelo) = Carro ("Ford", "Fusion")
    println("$marca $modelo")


    val(marido, mulher) = listOf("Joao", "Maria")
    println("$marido $mulher")

    val (_, _, terceiroLugar) = listOf("KIMI", "HAMILTON", "ALONSO")
    println("Pegando a partir do terceiro elemento de uma lista $terceiroLugar")
}