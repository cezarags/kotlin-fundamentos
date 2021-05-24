package fundamentos.operadores

fun main(args: Array<String>) {
    var num1 : Int =  1
    var num2 : Int = 2

    num1++
    println(num1)
    --num2
    println(num2)

    //Incremento e decremento, operador pre-fixado e pos-fixado

    println(++num1 == num2--)  // nesse caso a comparação inicia comparando somente o pre-fixado ++num1
    println(num1 == num2)

}
