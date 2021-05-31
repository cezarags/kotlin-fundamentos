package classes

class Pessoa1(var nome: String){

}

class Pessoa2(val nome: String){

}

class Pessoa3(nomeInicial: String){  // como não está definido como var ou val, só utilizamos no tempo de instancia, ou com init
    val nome: String = nomeInicial

}

fun main(){
    var p1 = Pessoa1("Fábio Júnior")
    println("${p1.nome}")

    val p2 = Pessoa2("João Jose")
   println(p2.nome)

    val p3 = Pessoa3("Home")
    println(p3.nome)
    //p3.nome="teste" Só é possivel utilizar o nomeInicial na inicialização
}