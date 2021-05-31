package fundamentos.funcoes

fun filtrar(lista: List<String>, filtro: (String) -> Boolean): List<String>{
    val listaFiltrada = ArrayList<String>()
    for (e in lista){
        if(filtro(e)){
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean{
    return nome.length == 3
}

fun main(){
    val nomes = listOf("ANA", "JOAO", "PEDRO", "REBECA")
    println(filtrar(nomes,::comTresLetras))
}