package lambdas

fun main(args: Array<String>) {

    // apenas it fica ordenado alfabeticamente, it.reversed fica ao contrario invertendo o nome

    val nomes = arrayListOf("Renata", "Bernado", "Willian", "Andreia","Caio")

    val ordenados = nomes.sortedBy { it.reversed() }



    println(ordenados)

}


