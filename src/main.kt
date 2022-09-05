fun main(args: Array<String>) {
    println("Bem-vindo ao KotlinBank")
    println()

    val contaMarcio = Conta()
    contaMarcio.titular = "Márcio"
    contaMarcio.numero = 1000
    contaMarcio.saldo = 200.0
    println("O titular da conta é ${contaMarcio.titular}")
    println("O número da conta é ${contaMarcio.numero}")
    println("O saldo da conta é ${contaMarcio.saldo}")

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 100.0
    println("O titular da conta é ${contaFran.titular}")
    println("O número da conta é ${contaFran.numero}")
    println("O saldo da conta é ${contaFran.saldo}")
}

class Conta {
    var titular : String = ""
    var numero = 0
    var saldo = 0.0
}

fun testaLacos(){
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
        println("Número da Conta $numeroConta")
        println("Saldo da conta $saldo")
        println()

// Chamar função que está fora do método main
//  testaCondicoes(saldo)


        println(i)
    }

    //utilizando while para fazer iterações
    var i = 1
    while (i <= 5) {
        val titular: String = "Márcio $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0



        println("Titular $titular")
        println("Número da Conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
        i++
    }
}

fun testaCondicoes(saldo: Double) {
    //Utilizando if
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

//Utilizando when
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}