package lambdas

class Produto(val nome: String, val preco:Double)


val materialEscolar = listOf(
        Produto("Fichario", 21.90),
        Produto("Caderno", 10.90),
        Produto("Lapis",1.99)
)

fun main(args: Array<String>){
    val totalizar = { total: Double, atual:Double -> total + atual}
    val precoTotal = materialEscolar.map {it.preco}.reduce(totalizar)

    println("O preço médio é R ${precoTotal / materialEscolar.size}")

}