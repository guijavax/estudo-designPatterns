package br.com.teste

class Dao {
    private constructor() {}

    fun print(any: Any) {
        println(any)
    }

    companion object {

        private var instancia : Dao? = null

        fun getInstancia() : Dao? {
            if(instancia == null) {
                instancia = Dao()
            }
            return instancia
        }

    }
}