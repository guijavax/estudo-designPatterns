package br.com.test

class JanelaWindows : Janela {
    override fun desenharJanela(titulo: String) {
        println("$titulo - Janela Windows")
    }

    override fun desenharBotao(titulo: String) {
        println("$titulo - Botão Windows")
    }
}