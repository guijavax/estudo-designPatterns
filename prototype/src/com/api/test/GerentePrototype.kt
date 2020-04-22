package com.api.test

class GerentePrototype : FuncionarioPrototype() {


    override fun showInfo() = "O funcionário é: Gerente, com salário de: $salario"

    override fun clone() : FuncionarioPrototype = GerentePrototype()

}