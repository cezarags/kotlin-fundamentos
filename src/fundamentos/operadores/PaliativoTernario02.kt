package fundamentos.operadores

// Não existe operador ternario em kotlin, podemos usar o if

fun obterResultado (nota2: Double): String = if (nota2 >= 7.0) "Passou" else "Reprovou"


fun main(args: Array<String>) {
    obterResultado(3.0)
}