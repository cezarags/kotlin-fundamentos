package lambdas


fun main(args: Array<String>) {
    val alunos = arrayListOf("Pedro","Thiago","João","Mario")

    alunos.map { it.toUpperCase() }.apply {print(this)}
}