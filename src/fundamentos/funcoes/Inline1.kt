package fundamentos.funcoes

inline fun transacao(funcao: () -> Unit){
    println("Abrindo Transacao")
    try {
        funcao()
    }finally {
        println("Encerrando Transacao")
    }
}

fun main(args: Array<String>) {
    transacao {
        println("Executando SQL 1")
        println("Executando SQL 2")
        println("Executando SQL 3")
    }
}