package classes

class Cliente (){

    var nome: String =""
}

fun main() {
    val cliente = Cliente()
    cliente.nome="Cezar Augusto"
    println("O nome do cliente é ${cliente.nome}")
}