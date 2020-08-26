package app

fun main() {
    val list1: List<String> = listOf("Ichika","Nino","Azuka","Miku")
    val list2 = list1.filter { it.length > 4  }
    println(list2)

    val list3 = list1.filterIndexed {index, value  -> index % 2 == 0  }
    println(list3)


    val list4: List<Any?> = listOf(null,"Doni","Ichika","Nino",1,2,3,null)
    val list5 = list4.filterIsInstance<String>()
    println(list5)
    val list6 = list4.filterIsInstance<Int>()
    println(list6)
    val list7 = list4.filterNotNull()
    println(list7)






}