package fundamentos.controle

fun main(args: Array<String>) {
    var opcao: Int = 0

    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        print("Voce Escolher a opção $opcao")
    } while (opcao != -1)

    println("Até a proxima")


}