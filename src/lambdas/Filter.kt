package lambdas

data class Aluno (val nome: String, val nota: Double)

fun main(args: Array<String>) {

    val alunos = arrayListOf(
            Aluno("Amanda", 5.4),Aluno("Pedro", 7.4), Aluno("Mario", 8.5),Aluno("Leandro",9.7)

    )

    val aprovados = alunos.filter { it.nota >= 5.0 }.sortedBy { it.nome}

    println(aprovados)

}