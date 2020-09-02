package app

fun main() {

    val number = (1..100).toList()

    val max = number.reduce { first, second ->
        if (first < second ) second
        else first
    }

    val min = number.fold(0) { first, second ->
        first + second
    }


    println(max)
    println(min)

}