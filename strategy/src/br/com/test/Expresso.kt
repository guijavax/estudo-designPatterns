package br.com.test

class Expresso : Frete {
    override fun calculaPreco(distancia: Int) = distancia * 1.45 + 12
}