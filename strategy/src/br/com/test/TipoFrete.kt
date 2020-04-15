package br.com.test

enum class TipoFrete  {

    NORMAL {
        override fun obterFrete() : Frete {
            return Normal()
        }
    },
    EXPRESSO {
        override fun obterFrete() : Frete {
            return Expresso()
        }
    },
    SUPEREXPRESSO {
        override fun obterFrete() : Frete {
            return SuperExpresso()
        }
    };

    abstract fun obterFrete() : Frete
}
