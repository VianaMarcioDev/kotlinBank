package br.com.marcioviana.kotlinBank.teste

import br.com.marcioviana.kotlinBank.modelo.Cliente
import br.com.marcioviana.kotlinBank.modelo.ContaCorrente
import br.com.marcioviana.kotlinBank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    println()

    val marcio = Cliente(nome = "Márcio", cpf = "111.111.111-11", senha = 1234)

    val contaMarcio = ContaCorrente(marcio, 1000)
    contaMarcio.deposita(500.0)
    println("O titular da conta é ${contaMarcio.titular}")
    println("O número da conta é ${contaMarcio.numero}")
    println("O saldo da conta é ${contaMarcio.saldo}")

    val fran = Cliente(nome = "Fran", cpf = "222.222.222-22", senha = 4321)

    val contaFran = ContaPoupanca(fran, 1001)
    contaFran.deposita(450.0)
    println("O titular da conta é ${contaFran.titular}")
    println("O número da conta é ${contaFran.numero}")
    println("O saldo da conta é ${contaFran.saldo}")

    println("Depositando na conta do Márcio")
    contaMarcio.deposita(50.0)
    println(contaMarcio.saldo)
    println()
    println("Depositando na conta da Fran")
    contaFran.deposita(100.0)
    println(contaFran.saldo)

    println("Sacando da conta do Márcio")
    contaMarcio.saca(100.0)
    println(contaMarcio.saldo)

    println()
    println(contaFran.saldo)
    println("Sacando da conta da Fran")
    contaFran.saca(120.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Márcio")


    //labels
    if (contaFran.transfere(valor = 70.0, destino = contaMarcio)) {
        println("Tranferência bem-sucedida")
    } else {
        println("Falha na transferência")
    }
}