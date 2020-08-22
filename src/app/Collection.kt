package app


    fun <T> displaycollections(collection: Collection<T>) {
        for (item in collection ) {
            println(item)
        }
    }


fun main() {

    displaycollections(setOf("Miku Nakano","Itsuki Chan "))
    displaycollections(listOf("Nakano Nino ","Nakano Ichika"))
    displaycollections(mapOf("a" to "MIKASA").values)
//    displaycollections(mapOf("b"to "NINA"))  Ini Error karena mapof( bukan turunan dari collections




}