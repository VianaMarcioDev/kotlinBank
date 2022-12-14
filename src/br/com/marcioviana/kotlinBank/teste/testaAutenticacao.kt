package br.com.marcioviana.kotlinBank.teste

import br.com.marcioviana.kotlinBank.modelo.Cliente
import br.com.marcioviana.kotlinBank.modelo.Diretor
import br.com.marcioviana.kotlinBank.modelo.Gerente
import br.com.marcioviana.kotlinBank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
            nome = "Aldilene",
            cpf = "555.555.555-55",
            salario = 5000.0,
            senha = 1234
    )

    val diretor = Diretor(
            nome = "Rui",
            cpf = "666.666.666-66",
            salario = 10000.0,
            senha = 4321,
            plr = 5000.0
    )

    val cliente = Cliente(
            nome = "Daniele",
            cpf = "777.777.777-77",
            senha = 6789
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 4321)
    sistema.entra(cliente, 6789)
}