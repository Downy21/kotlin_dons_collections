package app

fun main() {
    val list = listOf("Ramdoni", "Sie", "Ganteng", "Kalem")
    println(list.get(2))
    println(list.getOrNull(10))
    println(list.getOrElse(10,{it -> "Opps Ini data anda Kelebihan :)"}) )
    println(list.subList(0,2))

    val sortedlist = list.sorted()
    println(sortedlist.binarySearch("Ramdoni"))


    println("INI PEMISAH ANTARA KITA ======== ")


    val number = listOf(1,1,2,2,3,3,4,4,5,5)
    println(number.indexOf(2))
    println(number.lastIndexOf(2))
    println(number.indexOfFirst { it > 3})
    println(number.indexOfLast { it > 3})


}