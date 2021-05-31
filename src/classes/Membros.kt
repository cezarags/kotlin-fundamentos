package classes

class Data (var dia: Int, var mes: Int, var ano: Int){
    fun formatar(): String{
        return "$dia/$mes/$ano"
    }
}

fun main(args: Array<String>) {
    var nascimento:Data = Data(ano = 2003, dia = 11, mes = 10, )

    println("${nascimento.dia}/${nascimento.ano}/${nascimento.mes}")
        with(nascimento){ println("${dia}/${ano}/${mes}")}

    println(nascimento.formatar())
}