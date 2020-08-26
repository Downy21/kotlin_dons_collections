package app

fun main() {
    val list: List<String> = listOf("IChika","Miku","Mikasa","Itsuki","NAKANO")

    println(list.any { it.length > 5  } )
    println(list.none { it.length > 5  } )
    println(list.all { it.length > 1  } )
    println(list.any())
    println(list.none())





}