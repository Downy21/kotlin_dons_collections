package app

fun <T> displaymutablecollection(collection: MutableCollection<T>) {
    for (item in collection ) println(item)
}


fun main() {
    displaymutablecollection(mutableSetOf("Itsku","NINO","ICHIKA"))
    displaymutablecollection(mutableListOf("MIKASA","TAKAGI","REM"))
    displaymutablecollection(mutableMapOf("a" to  "EMILIA").entries)
    displaymutablecollection(mutableMapOf("b" to "Ichika").entries)
    


}
