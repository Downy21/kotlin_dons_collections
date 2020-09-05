package app

fun main() {
    val multablemap: MutableMap<String,String> = mutableMapOf()

    multablemap.put("a","Ichika")
    multablemap["b"] = "itsuki"
    multablemap.put("c","Azuka")
    multablemap["d"] = "Mikasa"


    println(multablemap["a"])
    println(multablemap.get("b"))
    println(multablemap.getOrDefault("e","Ini Tidak Ada Ya Key e Nya"))

    multablemap.remove("d")

    for ((key,value) in multablemap ) {
        println("$key To $value")
    }









}