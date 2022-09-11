package br.com.marcioviana.kotlinBank.teste

import br.com.marcioviana.kotlinBank.modelo.Endereco

    fun testaAny() {
        val endereço = Endereco(
                logradouro = "Rua Vergueiro",
                complemento = "Alura",
                cep = "11111-111"
        )

        val enderecoNovo = Endereco(
                logradouro = "Rua Vergueiro",
                complemento = "Alura",
                cep = "11111-111"
        )

        println(endereço.equals(enderecoNovo))

        println(endereço.hashCode())
        println(enderecoNovo.hashCode())

        println(endereço)
        println(enderecoNovo)

        println(
                "${endereço.javaClass}@${
                Integer.toHexString(endereço.hashCode())}"
        )
    }

    fun imprime(valor: Any): Any {
        println(valor)
        return valor
    }
