package fundamentos.controle

fun main(args: Array<String>) {

    val valorNota: Int = 2

    if(valorNota in 9..10){
        println("Que Maximo")
    }else if (valorNota in 7..8){
        println("Parabens")
    }else if (valorNota in 5..6){
        println("Tem como recuperar")
    }else if (valorNota in 3..4){
        println("Te vejo no peoximo Semestre")
    }else{
        println("Nota invalida")
    }




}