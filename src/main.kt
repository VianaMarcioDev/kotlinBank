import br.com.marcioviana.kotlinBank.modelo.Cliente
import br.com.marcioviana.kotlinBank.modelo.ContaCorrente
import br.com.marcioviana.kotlinBank.modelo.ContaPoupanca
import br.com.marcioviana.kotlinBank.teste.testaAutenticacao
import br.com.marcioviana.kotlinBank.teste.testaContasDiferentes


var totalContas : Int = 0
    private set

fun main(args: Array<String>) {


//object expression - objeto único anônimo
    val lene = object {
        val nome: String = "Lene"
        val cpf: String = "123.456.789-99"
        val senha: Int = 1234

        fun autentica(senha : Int) = this.senha == senha

    }

// object declaration



    println("Bem-vindo ao KotlinBank")
    println()

    val marcio = Cliente(
            nome = "Márcio",
            cpf = "123.345.678-99",
            senha = 1234
            )

    val contaCorrente = ContaCorrente(titular = marcio, numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = marcio, numero = 1001)




    testaContasDiferentes()

    println(totalContas)

}











