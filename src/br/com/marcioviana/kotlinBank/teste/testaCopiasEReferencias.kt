package br.com.marcioviana.kotlinBank.teste

import br.com.marcioviana.kotlinBank.modelo.ContaCorrente
import br.com.marcioviana.kotlinBank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Número X é $numeroX")
    println("Número Y é $numeroY")

    val contaJoao = ContaPoupanca("João", 1002)
    val contaMaria = ContaCorrente("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular da conta joão: ${contaJoao.titular}")
    println("titular da conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

}