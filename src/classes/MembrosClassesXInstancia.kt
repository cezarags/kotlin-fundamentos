package classes
var desconto :Double = 0.0
class  IntemDePedido(val nome: String, var preco: Double){
    companion object{
        fun create(nome: String, preco: Double) = IntemDePedido(nome, preco)

    }
    fun precoComDesconto(): Double{
        return preco - preco * desconto
    }
}

fun main(args: Array<String>) {
    val intem = IntemDePedido.create("Tv 50 Polegadas", 2989.30)
    val intem2 = IntemDePedido("Computador Gamer", 200.0)
    desconto = 0.10

    println(intem.precoComDesconto())
    println(intem2.precoComDesconto())

}