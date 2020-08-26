package app


// Di Dalam Collection kita bisa melakukan Kinversi dari satu collections ke Collection lain dengan cara Menggunakan Keywoards .to
// Contoh nya seperti di bawah ini
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val range = 1..100
    val tolist = range.toList()
    val toSet = range.toSet()
    val toMutableList = array.toMutableList()
    val toMutableSet = array.toMutableSet()


}