package teste

fun testaCondicoes(saldo: Double) {
    //Utilizando if
    if (saldo > 0.0) {
        println("modelo.Conta é positiva")
    } else if (saldo == 0.0) {
        println("modelo.Conta é neutra")
    } else {
        println("modelo.Conta é negativa")
    }

//Utilizando when
    when {
        saldo > 0.0 -> println("modelo.Conta é positiva")
        saldo == 0.0 -> println("modelo.Conta é neutra")
        else -> println("modelo.Conta é negativa")
    }
}