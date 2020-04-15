package br.com.test

abstract class JanelaAbstrata(jane: Janela) {

    private val janela : Janela = jane

    fun desenharJanela(titulo : String) {
        janela.desenharJanela(titulo)
    }

    fun desenhaBotao(titulo: String) {
        janela.desenharBotao(titulo)
    }

    abstract fun desenhar()
}