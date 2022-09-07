class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int){
        if (admin.autentica(senha)){
            println("Bem vindo ao KotlinBank")
        }else{
            println("Auenticação falhou")
        }
    }


}