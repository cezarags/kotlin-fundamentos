package fundamentos

fun imprimirSomaComRetorno(a: Int, b:Int = 1): Int{    // posso deixar um argumento setado = 1

    return  a + b



}
fun main(args: Array<String>) {
    println(imprimirSomaComRetorno(2,3))
    println(imprimirSomaComRetorno(2))
    }