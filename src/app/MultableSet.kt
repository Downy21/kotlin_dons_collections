package app

import data.Person

fun main() {

    val multableSet: MutableSet<Person> = mutableSetOf()
    multableSet.add(Person("RidoRoma"))
    multableSet.add(Person("Albert"))
    multableSet.add(Person("Raysid"))
    multableSet.add(Person("Jojo"))


    for (person in multableSet) {
        println(person)
    }


}