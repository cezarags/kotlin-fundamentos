package classes

class  Filme3(nome: String, anoLancamento: Int, genero: String){

    val nome: String
    val anoLancamento:Int
    val genero : String

    init {    // inicializa os atributos
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme3("Se beber não case", 2009, "Comédia")
    println("${filme.nome}, ${filme.anoLancamento}, ${filme.genero}")
}