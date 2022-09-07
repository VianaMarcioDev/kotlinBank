package br.com.marcioviana.kotlinBank.teste

import br.com.marcioviana.kotlinBank.modelo.Cliente
import br.com.marcioviana.kotlinBank.modelo.ContaCorrente
import br.com.marcioviana.kotlinBank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Número X é $numeroX")
    println("Número Y é $numeroY")

    val joao = Cliente(nome = "João", cpf = "333.333.333-33", senha = 9876)
    val maria = Cliente(nome = "Maria", cpf = "444.444.444-44", senha = 6789)

    val contaJoao = ContaPoupanca(joao, 1002)
    val contaMaria = ContaCorrente(maria, 1003)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular da conta joão: ${contaJoao.titular}")
    println("titular da conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

}