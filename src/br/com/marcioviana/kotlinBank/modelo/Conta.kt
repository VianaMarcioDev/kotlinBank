package br.com.marcioviana.kotlinBank.modelo



abstract class Conta(
        var titular: Cliente,
        val numero: Int
) {
    var saldo = 0.0
        protected set

    var total : Int = 0
//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

//object declarations
//Companion object apenas membros da mesma classe conseguem acessar
     companion object Contador{
        var total = 0
        private set

    }


    fun deposita(valor: Double) {
        if (valor > 0){
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double{
//        return saldo
//    }
//
//    fun setSaldo(valor : Double){
//        if (valor > 0){
//            saldo = valor
//        }
//
//    }
}