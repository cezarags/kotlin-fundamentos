package fundamentos

fun main(args: Array<String>) {

    //EM kotlin não existe tipos primitivos e sim tipos Basicos

    //Tipos Numéricos Inteiros
    val num1: Byte = 127   // valor Maximo que o tipo suporta
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_775_807 //Long.MAX_VALUE
    println(Long.MAX_VALUE)
    //Tipos Numéricos Reais
    val num5: Float = 3.14F
    val num6: Double = 3.14
    val num7: Char = '?'
    val num8: Boolean = true  // ou false

    println(listOf(num1,num2,num3,num4,num5,num6,num7, num8))

    println(2 is Int)
    println(10.dec())  //Dec decrementa


    //É possivel chamar funçoes a partir do literal, pois tudo em kotlin é um objeto




}


