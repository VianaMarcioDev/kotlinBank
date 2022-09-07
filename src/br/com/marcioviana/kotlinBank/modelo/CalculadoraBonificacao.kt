package br.com.marcioviana.kotlinBank.modelo

class CalculadoraBonificacao {

    var total : Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }

//    fun registra(gerente: br.com.marcioviana.kotlinBank.modelo.Gerente){
//        this.total += gerente.bonificacao
//    }
//
//    fun registra(diretor: br.com.marcioviana.kotlinBank.modelo.Diretor){
//        this.total += diretor.bonificacao
//    }



}