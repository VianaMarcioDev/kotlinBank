package br.com.marcioviana.kotlinBank.teste

fun testaCondicoes(saldo: Double) {
    //Utilizando if
    if (saldo > 0.0) {
        println("br.com.marcioviana.kotlinBank.modelo.Conta é positiva")
    } else if (saldo == 0.0) {
        println("br.com.marcioviana.kotlinBank.modelo.Conta é neutra")
    } else {
        println("br.com.marcioviana.kotlinBank.modelo.Conta é negativa")
    }

//Utilizando when
    when {
        saldo > 0.0 -> println("br.com.marcioviana.kotlinBank.modelo.Conta é positiva")
        saldo == 0.0 -> println("br.com.marcioviana.kotlinBank.modelo.Conta é neutra")
        else -> println("br.com.marcioviana.kotlinBank.modelo.Conta é negativa")
    }
}