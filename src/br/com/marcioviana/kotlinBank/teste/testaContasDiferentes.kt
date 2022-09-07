package br.com.marcioviana.kotlinBank.teste

import br.com.marcioviana.kotlinBank.modelo.Cliente
import br.com.marcioviana.kotlinBank.modelo.ContaCorrente
import br.com.marcioviana.kotlinBank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
            titular = Cliente(nome = "Márcio", cpf = "111.111.111-11", senha = 1234),
            numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
            titular = Cliente(nome = "Aldilene", cpf = "222.222.222-22", senha = 4321),
            numero = 1001
    )

    contaCorrente.deposita(1000.0)
    println("Saldo conta corrente ${contaCorrente.saldo}")
    contaPoupanca.deposita(1000.0)
    println("Saldo conta Poupança ${contaPoupanca.saldo}")
    contaCorrente.saca(100.0)
    println("Saldo conta corrente ${contaCorrente.saldo}")
    contaPoupanca.saca(100.0)
    println("Saldo conta Poupança ${contaPoupanca.saldo}")
    contaCorrente.transfere(150.0, contaPoupanca)
    println("Saldo conta corrente ${contaCorrente.saldo}")
    println("Saldo conta Poupança ${contaPoupanca.saldo}")
    contaPoupanca.transfere(250.0, contaCorrente)
    println("Saldo conta corrente ${contaCorrente.saldo}")
    println("Saldo conta Poupança ${contaPoupanca.saldo}")
}