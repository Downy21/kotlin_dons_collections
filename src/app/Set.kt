package app

import data.Person

fun main() {

    val set: Set<Person> = setOf(
            Person("Itsuki"), Person("Azuka"), Person("Rem"),
            Person("Emilia"), Person("Mikasa"), Person("Rem"),
            Person("Itsuki")
    )

    println(set.size)
    println(set.contains(Person("Emilia")))
    println(set.containsAll(listOf(
            Person("Mikasa"),
            Person("Emilia"))))


    for (person in set) {
        println(person)
    }




}