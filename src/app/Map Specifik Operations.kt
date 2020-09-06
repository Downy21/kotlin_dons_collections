package app

fun main() {

    val map = mapOf("a" to "Itsuki", "b" to "Ichika", "c" to "NINO", "d" to "Emilia")


    // Contohnya seeperti di bawah ini ya gaesss
    println(map.get("a"))
    println(map.get("tidak ada nihh gaess"))
    println(map.getOrDefault("e","Uppps ini Tidak ada nihhh"))
    println(map.getOrElse("g",{"Upps ini tidak boleh"}))
    println(map.getValue("a"))
    println(map.filter { (key,value) -> value.length > 5 } ) // ini menyeleksi value yang dimana panjang karakter nya lebih dari 5 huruf
    println(map.filterKeys { it != "b" })
    println(map.filterValues { it.length > 5  })





}