package br.com.marcioviana.kotlinBank.teste

fun testaLacos() {
    //i in 1..5 = range
    //i in 5..1 = downTo
    //step = de quantos em quantos faz a interação
    //break = sai do laço quando encontrar aquela condição
    //continue = pula quando encontrar aquela condição mas continua laço
    for (i in 5 downTo 1 step 2) {

        if (i == 4) {
            break
        }
        val titular: String = "Márcio $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0


        println("Titular $titular")
        println("Número da br.com.marcioviana.kotlinBank.modelo.Conta $numeroConta")
        println("Saldo da conta $saldo")
        println()

// Chamar função que está fora do método main
//  br.com.marcioviana.kotlinBank.teste.testaCondicoes(saldo)


        println(i)
    }

    //utilizando while para fazer iterações
    var i = 1
    while (i <= 5) {
        val titular: String = "Márcio $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0



        println("Titular $titular")
        println("Número da br.com.marcioviana.kotlinBank.modelo.Conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
        i++
    }
}