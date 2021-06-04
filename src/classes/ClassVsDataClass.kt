package classes

class Geladeira(val marca: String, val listros: Int)

data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>){
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira(marca = "Brastemp", 320)

    println(g1 == g2) // aqui tem o equas, mas não está implementado, entao compara a referecia de memoria

    val t1 =  Televisao("Samsung", 50)
    val t2 = Televisao("Samsung", 50)
    //No caso do data class ele já implementa o .equals
    //== compara a String  === compara a referência
    println(t1 == t2)


    println(t1.toString())
    println(t1.copy())
    println(t1.copy(polegadas = 42))  //cria uma copia e altera o valor

    //Destructuring em data class
    val (marca, pol) = t1
    println("$marca $pol")




}