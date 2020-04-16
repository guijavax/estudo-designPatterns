package br.com.test

class Factory {

    fun getTipoAve(nome : String, tipo : Char) {
        var aves : Aves? = null
        when(tipo) {
            'V' ->  aves = AvesQueVoam(nome)
            'N' -> aves = AvesQueNaoVoam(nome)
        }
    }
}