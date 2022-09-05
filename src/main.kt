fun main(args: Array<String>) {
    println("Bem-vindo ao KotlinBank")
    println()

    val contaMarcio = Conta()
    contaMarcio.titular = "Márcio"
    contaMarcio.numero = 1000
    contaMarcio.deposita(500.0)
    println("O titular da conta é ${contaMarcio.titular}")
    println("O número da conta é ${contaMarcio.numero}")
    println("O saldo da conta é ${contaMarcio.saldo}")

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
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

    if (contaFran.transfere(70.0, contaMarcio)){
        println("Tranferência bem-sucedida")
    }else{
        println("Falha na transferência")
    }
}


class Conta {
    var titular: String = ""
    var numero = 0
    var saldo = 0.0
        private set



    fun deposita(valor: Double) {
        if (valor > 0){
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }

    }

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

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Número X é $numeroX")
    println("Número Y é $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    val contaMaria = contaJoao
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular da conta joão: ${contaJoao.titular}")
    println("titular da conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

}

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