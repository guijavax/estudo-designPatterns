package br.com.test

fun main(args : Array<String>) {
    val janela : JanelaAbstrata = JanelaDialogo(JanelaLinux())
    janela.desenhar()

    val janela2 : JanelaAbstrata = JanelaWarn(JanelaLinux())
    janela2.desenhar()

    val janela3 : JanelaAbstrata = JanelaDialogo(JanelaWindows())
    janela3.desenhar()

    val janela4 : JanelaAbstrata = JanelaWarn(JanelaWindows())
    janela4.desenhar()

}