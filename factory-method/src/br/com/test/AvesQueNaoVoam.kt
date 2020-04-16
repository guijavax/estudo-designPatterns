package br.com.test

class AvesQueNaoVoam(nome : String) : Aves() {
    init {
        this.nome = nome
        println("O tipo é: $nome e ela não voa")
    }
}