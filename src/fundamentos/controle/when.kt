package fundamentos.controle

fun main(args: Array<String>) {
    val nota = 0

    when(nota) {
        10, 9 -> println("Maximo")
        7,8 -> println("Parabens")
        5,6 -> println("Tem como recuperar")
        in 1..4 -> println("Te vejo no proximo semestre")
        else -> println("Nota invalida")
    }
}