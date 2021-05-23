package fundamentos

fun main(args : Array<String>) {

    // var a     <<<<< Nesse caso é obrigario inicializar ou tipar, como no exemplo abaixa
    var a: Int
    var b =2

    a = 10
    println(a + b)


    var c = 1    //1.0
    var d = 2

   // c = 2.3   Nesse caso seria informado um erro, estamos esperando um Int e recebendo double
                //Não podemos misturar tipos

    println(c + d)

}