package br.com.test

class Faxineiro : Funcionario() {
    override fun contrataFuncionario() {
        println("Faxineiro contratado")
    }

    override fun calculaSalarioFuncionario() = 2000 * 0.64

}