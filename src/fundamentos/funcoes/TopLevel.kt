package fundamentos.funcoes

fun min(a: Int, b : Int): Int{
    return if (a < b) a else b
}


fun main(args: Array<String>) {

   println("${ min(3,4)}")
}