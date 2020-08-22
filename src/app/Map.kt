package app

fun main() {

    val map: Map<String,String> = mapOf(
            "a" to "Rem" ,
            "b" to  "Itsuki" ,
            "c" to  "Nakano Ichika",
            "d" to "Takagi_Chan"
    )




    println(map.entries)
    map.values
    map.keys

    for ((key , value ) in map)  {  // melakukan desctructuring di key and valuenya
        println("$key To $value")
    }
}