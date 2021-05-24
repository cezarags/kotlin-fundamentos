package fundamentos

fun main(args: Array<String>) {

    souEsperto(10)
    souEsperto("Hello, World!")
    souEsperto2(1)
    souEsperto2("Aprendendo funadamentos em kotlin")
    souEsperto2(true)


}

fun souEsperto(x : Any) {
    if (x is String) {
        println(x.uppercase())
    } else if (x is Int) {
        println(x.plus(3))   //soma ao valor da varivel
    }
}
fun souEsperto2(x : Any) {
    when (x) {
        is String -> println(x.uppercase())
        is Int -> println(x.plus(3))
        else -> println("Valor inválido")
    }
}




