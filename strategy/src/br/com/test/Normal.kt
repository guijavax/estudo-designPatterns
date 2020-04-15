package br.com.test

class Normal : Frete {
    override fun calculaPreco(distancia: Int) = distancia * 1.25 + 10
}