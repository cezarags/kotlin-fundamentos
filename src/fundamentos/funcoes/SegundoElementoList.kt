package fundamentos.funcoes

fun main(args: Array<String>){
    val list = listOf("JOÃO", "MARIA", "PEDRO")
    println(list.secondOrNull())


}

fun<E> List<E>.secondOrNull(): E? = if(this.size >=2) this[1] else null


