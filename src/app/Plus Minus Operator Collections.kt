package app

/*  ● Di kotlin, ada operator extension function plus dan minus untuk collection
● Parameter pertama adalah collection, dan parameter selanjutnya bisa collection atau element, dan
akan menghasilkan collection baru
 */

// Contoh dari penggunaaan operator nya seperti di bawah ini

fun main() {

    val list1: List<String> = listOf("Ichika", " Azuka" , "MIKASA", "NINO" , "MIKU")
    val list2 = list1 + "REM"
    println(list2)
    val list3 = list1 + listOf("Azuka" , "NANA")
    println(list3)
    val list4 = list1 - "Ichika"
    println(list4)
    val list5 = list1 - listOf("MIKASA", "NINO" , "MIKU")
    println(list5)


    val map1: Map<String,String> = mapOf(
            "a" to "Sakura",
            "b" to  "NINA",
            "c" to "EMILIA"
    )


    val map2 = map1 + Pair("d" to "REM", "e" to "Nico Robin" )
    println(map2)
    val map3 = map1 - "a"
    println(map3)

}