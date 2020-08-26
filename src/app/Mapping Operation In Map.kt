package app





fun main() {

    val map1: Map<Int,String> = mapOf(
            1 to "Azuka Chan",
            2 to "Nakano Chan",
            3 to "Nakano Itsuki"
    )

    val map2: Map<Int,String> = map1.mapKeys { it.key * 5 }
    println(map2)
    val map3: Map<Int,String> = map1.mapValues { it.value.toLowerCase() }
    println(map3)


}