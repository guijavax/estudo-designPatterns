package br.com.test

import java.util.*

fun main(args : Array<String>) {

    val scanner = Scanner(System.`in`)

    println("Informe a distancia")
    val distancia = scanner.nextInt()

    println("Qual o tipo de frete (1) Normal, (2) Expresso, (3) SuperExpresso: ")
   val tipoFrete = TipoFrete.values()[scanner.nextInt() - 1]

    val frete : Frete = tipoFrete.obterFrete()

    val preco = frete.calculaPreco(distancia)
    println("O valor do frete é R$ $preco")

}