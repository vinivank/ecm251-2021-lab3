class Pessoa(val nome:String, val idade: Int){
    fun exibirDados(){
        println("Meus dados: ${this.nome} - ${this.idade}")
    }
}

fun main(){
    val p1 = Pessoa("Murilo", 32)
    val p2 = Pessoa("Goku", 54)
    p1.exibirDados()
    p2.exibirDados()
}
