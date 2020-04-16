package br.com.test

class AvesQueVoam(nome : String) : Aves(){

    init {
        this.nome = nome
        println("O tipo é: $nome e ela voa")
    }
}