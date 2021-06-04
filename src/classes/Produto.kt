package classes

class Produto (var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean){
    val inativo: Boolean get () =!ativo
    val precoComDesconto: Double get() = preco * (1 - desconto)
}

fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 5000.00, 0.20, true)
    println(p1.precoComDesconto)

    println("_____________________________________")

    val p2 = Produto("Iphone", 4000.00, 0.10, false)
    println("${p2.nome}, ${p2.preco}, , ${p2.precoComDesconto}")

    println("_____________________________________")

    if (p2.inativo){
        p2.desconto= 0.0
        println("Depois de inativo o desconto: R$ ${p2.precoComDesconto}")
    }
}
