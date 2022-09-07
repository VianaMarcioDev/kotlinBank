package br.com.marcioviana.kotlinBank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}