fun main(args: Array<String>) {

    println("Bem-vindo ao KotlinBank")
    println()

    val marcio = Funcionario(
            nome = "Márcio",
            cpf = "111.111.111-11",
            salario = 3600.0
    )

    println("nome ${marcio.nome}")
    println("cpf ${marcio.cpf}")
    println("salario ${marcio.salario}")
    println("bonificação ${marcio.bonificacao}")

    val aldilene = Gerente(
            nome = "Aldilene",
            cpf = "222.222.222-22",
            salario = 5000.0,
            senha = 1234
    )

    println()
    println("nome ${aldilene.nome}")
    println("cpf ${aldilene.cpf}")
    println("salario ${aldilene.salario}")
    println("bonificação ${aldilene.bonificacao}")

    if (aldilene.autentica(1234)){
        println("Autenticou com sucesso")
    }else{
        println("Erro na autenticação")
    }

    val rui = Diretor(
            nome = "Rui",
            cpf = "333.333.333-33",
            salario = 10000.0,
            senha = 4321,
            plr = 5000.0
    )

    println()
    println("nome ${rui.nome}")
    println("cpf ${rui.cpf}")
    println("salario ${rui.salario}")
    println("bonificação ${rui.bonificacao}")
    println("PLR ${rui.plr}")

    if (rui.autentica(4321)){
        println("Autenticou com sucesso")
    }else{
        println("Erro na autenticação")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(marcio)
    calculadora.registra(aldilene)
    calculadora.registra(rui)

    println()
    println("Total de bonificações: ${calculadora.total}")

}





