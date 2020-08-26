package app

// ForEach adalah salah satu Operations Extension Functions di Collections yang berguna untuk melakukan iterasi data ke dala suatu collections



fun main() {
    setOf("Itsuki","Ichika","Nino ").forEach {
        println(it)

    }

    mutableListOf("Azuka","Itsuki","Rem").forEachIndexed { index, value ->
        println("$index = $value")
    }



}