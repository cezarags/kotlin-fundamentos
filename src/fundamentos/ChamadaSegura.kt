package fundamentos

fun main(args: Array<String>) {

    println(10.dec())

    var a: Int? = null  // Operador Chamada Segura (Safe Call Operator)
    println(a?.dec())

    val opcional : String? = null
    val obrigatorio : String =  opcional ?: "Valor Default" // Operador Elvins ?: "Setá o valor Padrão"
    println(obrigatorio)



}