package app

fun main() {

    val mutableList: MutableList<String> = mutableListOf() // Ini Adalah Proses Deklarasi Mutable List

    // Dan Ini Adalah Proses Memasukan Data di Dalam Variable mutablelist
    mutableList.add("Doni")
    mutableList.add("Bambang")
    mutableList.add("Ryans")
    mutableList.remove("Bambang")
    mutableList.set(1, "Ryans")


    // Disini Kita Melakukan Pemanggilan dengan perintah For
    for (value in mutableList) {
        println(value)
    }

    println(mutableList.isEmpty())
    println(mutableList.isNotEmpty())


}