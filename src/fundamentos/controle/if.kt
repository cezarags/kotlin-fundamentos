package fundamentos.controle

fun main(args: Array<String>) {
    val nota: Double = 6.3

    if (nota >= 7.0) println ("Aprovado") else println ("Reprovado")

    if (nota >= 7.0) {
        println("Aprovado")
    }else println ("Reprovado")

    when {
        nota >= 7.0 -> println ("Aprovado")
        else -> println ("Reprovado")
    }

    when {
        nota > 8.0 -> println("Nota é maior")
                else -> println("Nota é menor")
    }
}
