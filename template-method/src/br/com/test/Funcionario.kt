package br.com.test

abstract  class  Funcionario {

    internal fun callMethod() {
        contrataFuncionario()
        println(calculaSalarioFuncionario())
    }

    abstract fun contrataFuncionario()

    abstract fun calculaSalarioFuncionario() : Double

}