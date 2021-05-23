package fundamentos

fun main() {
    val a: Int = 33.dec()
    println(a)

    val b: String = a.toString()

    println(b)
    println(b is String)
    println("Primeiro char da string b é  ${b.first()}")




}