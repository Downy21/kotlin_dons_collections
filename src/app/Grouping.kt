package app
/*
Grouping adalah operasi untuk meng-grup kan element-element yang ada di collection.
Contoh nya bisa kita lihat di bawah ini :)
 */
fun main() {

    val list: List<String> = listOf("N","N","I","I","M", "M","O","NN", "II","MM","ABCM")
    val map: Map<String,List<String>> = list.groupBy { it }
    val map2: Map<Int,List<String>> = list.groupBy { it.length }


    val grouping: Grouping<String,String> = list.groupingBy { it }

    println(map)
    println(map2)
    println(grouping)


}