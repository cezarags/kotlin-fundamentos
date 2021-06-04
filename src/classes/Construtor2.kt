package classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)


fun main(args: Array<String>) {

    val filme = Filme2("O poderoso chefão", 1992, "Drama")
    println(" O nome do filme é : ${filme.nome}, foi lançado${filme.anoLancamento}, e o genero é: ${filme.genero}")
}