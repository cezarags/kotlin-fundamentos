package classes

class Cliente2{
    constructor(nome: String){
        this.nome = nome
    }
    var nome: String
        get() = "Meu nome é ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anonimo"

            //takeIf aceita expressoes e retorna um boolean caso tenha valor e caso não tem retorna nulo, porem retornamos o anonimo no lugar

        }
}

fun main(args: Array<String>) {
    val cliente2 = Cliente2("")
    println(cliente2.nome)                   // nesse caso chama o get implicitamente

    val cliente = Cliente2("Manoel")
    println(cliente.nome)                   // nesse caso chama o set
}