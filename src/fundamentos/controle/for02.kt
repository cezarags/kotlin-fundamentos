package fundamentos.controle

fun main(args: Array<String>) {
    val alunos = arrayListOf("Cezar", "Carla","Marcos")

    for ((indice, aluno) in alunos.withIndex()){

        println("$indice - $aluno \n")
    }
}