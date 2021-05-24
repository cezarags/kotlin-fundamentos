package fundamentos

fun main(args: Array<String>) {

    val valor: Any = 123    //usando um tipo generico ANY

    if (valor is String){
        println(valor)
    }else if(valor !is String) {
        println("Não é uma String")

    }
}