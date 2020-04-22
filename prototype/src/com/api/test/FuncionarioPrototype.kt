package com.api.test

abstract class FuncionarioPrototype {

    var salario : Double? = null

    abstract fun showInfo() : String
    abstract fun clone() : FuncionarioPrototype



}