package fundamentos.funcoes

fun imprimirMaior(a: Int, b: Int){
    println(Math.max(a, b))
}

fun imprimirMaior2(a: Int, b: Int): Unit{
    println(Math.max(a, b))
}

fun imprimirMaior3(a: Int, b: Int): Unit{
    println(Math.max(a, b))
    return
}

fun imprimirMaior4(a: Int, b: Int): Unit{
    println(Math.max(a, b))
    return Unit
}

fun imprimirMaior5(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}



fun main (args: Array<String>){
    println(imprimirMaior2(5,10))
    println(imprimirMaior3(5,10))
    println(imprimirMaior4(5,10))
    println(imprimirMaior5(5,10))

}