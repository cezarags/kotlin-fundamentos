package fundamentos

fun main (args: Array<String>){

    val bomHumor = false
        // Nesse caso como está em uma unica linha, não preciso de chaves
    if(bomHumor == true) println("Hoje estou de bom humor") else println("Hoje não estou de bom humor")

    when (bomHumor) {
        true -> println("Hoje estou de bom humor")
        else -> println("Hoje não estou de bom humor")
    }
}