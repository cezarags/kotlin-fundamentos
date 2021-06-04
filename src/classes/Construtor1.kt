package classes

class Filme{
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento:Int, genero:String){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }

}

fun main(args: Array<String>) {
    val filme = Filme("O poderoso chefão", 1992, "Drama")
    println(" O nome do filme é : ${filme.nome}, foi lançado${filme.anoLancamento}, e o genero é: ${filme.genero}")
}