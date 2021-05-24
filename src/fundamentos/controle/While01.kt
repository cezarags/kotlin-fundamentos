package fundamentos.controle

fun main(args: Array<String>) {
    //Caso a condição tenha um numero determinado utilizar for senão while

   // val nota: Int = 10
   // while ( nota > 0) {
       // println("Hello, World!")

  //  }
        var opcao: Int = 0

        while (opcao != -1) {
            val line = readLine() ?: "0"
            opcao = line.toIntOrNull() ?: 0

            println("Você escolher a opção  $opcao")

        }
        println("Até a proxima")

    }


