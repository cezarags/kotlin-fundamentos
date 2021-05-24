package fundamentos.funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String{
    return "$funcionario é subordinado(a) à $chefe."
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("João", "Maria"))  // ide fez a nomeação
    println(relacaoDeTrabalho(chefe="João", funcionario = "Maria"))  // nomeação adicionada manualemente
}