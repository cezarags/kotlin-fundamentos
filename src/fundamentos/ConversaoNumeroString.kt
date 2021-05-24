package fundamentos

fun main(args: Array<String>) {

    val a = 1
    //Numero para String, somando com inteiro irá concactenar
    println(a.toString() + 1)

    //String para Double
    println("1.9".toDouble() + 3)

    //Tentando converter para Int, como não será possivel retorna nulo
    println("Teste".toIntOrNull())

    //Passando um valor padrão com o Elvis Operator
    println("Teste".toIntOrNull() ?: 1)

    // Convertendo para int
    println("1".toInt() + 3)
}