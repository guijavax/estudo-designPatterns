package br.com.test

class Gerente : Funcionario() {
    override fun contrataFuncionario() {
        println("Gerente contratado")
    }

    override fun calculaSalarioFuncionario() = 12000 * 0.51

}