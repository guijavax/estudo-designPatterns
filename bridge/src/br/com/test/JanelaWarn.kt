package br.com.test

class JanelaWarn(janela : Janela) : JanelaAbstrata(janela) {

    override fun desenhar() {
        desenharJanela("Janela de aviso")
        desenhaBotao("OK")
    }
}