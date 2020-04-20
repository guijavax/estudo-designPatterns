package br.com.teste

fun main(args : Array<String>) {

    val dao1 = Dao.getInstancia()
    dao1?.print("HASHCODE1: ${dao1.hashCode()}")

    val dao2 = Dao.getInstancia()
    dao2?.print("HASHCODE2: ${dao2.hashCode()}")

    val cla = Class.forName("br.com.teste.Dao")
    val const = cla.getDeclaredConstructor()
    const.isAccessible = true
    val dao3 = const.newInstance() as Dao
    dao3?.print("HASHCODE3: ${dao3.hashCode()}")
}