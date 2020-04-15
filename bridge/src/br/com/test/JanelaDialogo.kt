package br.com.test

class JanelaDialogo(janela : Janela) : JanelaAbstrata(janela) {

    override fun desenhar() {
        desenharJanela("Janela de Dialogo")
        desenhaBotao("Botão Sim")
        desenhaBotao("Botão Não")
        desenhaBotao("Botão Cancelar")
    }
}