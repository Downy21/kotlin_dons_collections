package app

fun main() {

    val list: List<String> = listOf("Nino","Ichika","MIKU","Mikasa")
    val (listnotmatch , listismatch ) =  list.partition { value -> value.length > 5  }

    println(listismatch)
    println(listnotmatch)
    println(list)





}