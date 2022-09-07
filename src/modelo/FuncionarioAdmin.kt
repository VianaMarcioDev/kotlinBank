package modelo

import modelo.Funcionario

abstract class FuncionarioAdmin(
        nome : String,
        cpf : String,
        salario : Double,
        protected val senha: Int

) : Funcionario(nome = nome, cpf = cpf, salario = salario){

    fun autentica(senha:Int): Boolean{
        if (this.senha == senha){
            return true
        }
        return false
    }
}