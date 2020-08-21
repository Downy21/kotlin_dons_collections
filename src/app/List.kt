package app

fun main() {

    val list : List<String> = listOf("Doni","Dian","Sastrowidoyo") // Ini Merupakan Cara Deklarasi List Collections



    // Sedang Di Bawah Ini merupakan Cara kita memanggil List dan berbagai macam Fitur yang tersedia di List Collections
    println(list[0])
    println(list[1])
    println(list[2])
    println(list.contains("Eko"))
    println(list.containsAll(listOf("Doni","Dian","Sastrowidoyo")))
    println(list.indexOf("Dian"))
    println(list.size)
    println(list.isNotEmpty())
    println(list.isEmpty())
}