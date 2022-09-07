fun main(args: Array<String>) {

    println("Bem-vindo ao KotlinBank")
    println()

    val contaCorrente = ContaCorrente(titular = "Márcio", numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = "Aldilene", numero = 1001)

    contaCorrente.deposita(1000.0)
    println("Saldo conta corrente ${contaCorrente.saldo}")
    contaPoupanca.deposita(1000.0)
    println("Saldo conta Poupança ${contaPoupanca.saldo}")
    contaCorrente.saca(100.0)
    println("Saldo conta corrente ${contaCorrente.saldo}")
    contaPoupanca.saca(100.0)
    println("Saldo conta Poupança ${contaPoupanca.saldo}")
    contaCorrente.transfere(150.0, contaPoupanca)
    println("Saldo conta corrente ${contaCorrente.saldo}")
    println("Saldo conta Poupança ${contaPoupanca.saldo}")
    contaPoupanca.transfere(250.0, contaCorrente)
    println("Saldo conta corrente ${contaCorrente.saldo}")
    println("Saldo conta Poupança ${contaPoupanca.saldo}")


}







