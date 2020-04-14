package br.com.test

fun main (args : Array<String>) {
    val faxineiro : Funcionario = Faxineiro()
    faxineiro.callMethod()

    val gerente : Funcionario = Gerente()
    gerente.callMethod()

}