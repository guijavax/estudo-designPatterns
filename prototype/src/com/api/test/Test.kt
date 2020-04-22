package com.api.test

fun main(args : Array<String>) {
    val gerente : FuncionarioPrototype = GerentePrototype().clone()
    gerente.salario = 120000.0

    val gerenteJunior : FuncionarioPrototype = GerentePrototype().clone()
    gerenteJunior.salario = 10000.0


    println(gerente.showInfo())
    println(gerenteJunior.showInfo())
}