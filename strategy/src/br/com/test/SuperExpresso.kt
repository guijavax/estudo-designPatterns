package br.com.test

class SuperExpresso : Frete {
    override fun calculaPreco(distancia: Int) = distancia * 2.12 + 14
}