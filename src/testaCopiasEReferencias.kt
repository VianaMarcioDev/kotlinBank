fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Número X é $numeroX")
    println("Número Y é $numeroY")

    val contaJoao = Conta("João", 1002)
    val contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular da conta joão: ${contaJoao.titular}")
    println("titular da conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

}