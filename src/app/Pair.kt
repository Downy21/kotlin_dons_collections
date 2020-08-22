package app

fun main() {
    // Ini adalah cara Pendeklarasian dan pemanggilan cara Pertama
    val pair1: Pair<String, String> = Pair("Nakano", "Itsuki")
    println(pair1.first)
    println(pair1.second)

    // Dan Ini adalah Cara Pendeklarasian dan pemanggian cara kedua menggunakan Infix Fun
    val pair2: Pair<String, String> = "Nakano" to "Ichika"
    println(pair2.first)
    println(pair2.second)




}