fun main(args: Array<String>) {
    println("Bem-vindo ao KotlinBank")
    val titular : String = "Márcio"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0
    saldo = 100 + 2.0
    saldo += 200

    println("Titular $titular")
    println("Número da Conta $numeroConta")
    println("Saldo da conta $saldo")

//Utilizando if
    if (saldo > 0.0){
        println("Conta é positiva")
    }else if (saldo == 0.0){
        println("Conta é neutra")
    }else{
        println("Conta é negativa")
    }

//Utilizando when
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }

}