package br.com.marcioviana.kotlinBank.modelo

class Cliente(
        var nome: String,
        val cpf: String,
        var endereço : Endereco = Endereco(),
        private val senha: Int
): Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha){
            return true
        }else println("Autenticação falhou")
            return false
    }

}