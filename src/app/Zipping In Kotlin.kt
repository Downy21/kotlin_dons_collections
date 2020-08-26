package app


// Ziping adalah transformasi yang digunakan untuk menggabungkan dua buah collection.

fun main() {
    val list: List<String> = listOf("DONI Dan ", "Doni Dan " , "Doni Dan" )
    val list1: List<String> = listOf("Istri Pertama Itsuki ", "Istri Kedua Ichika ", "Istri Ke Tiga Azuka")


    val list3: List<Pair<String,String>> = list.zip(list1)
    val list4:List<String> = list.zip(list1) {item1, item2  ->
        item1 + item2

    }

    println(list3)
    println(list4)

    // Unzip adalah Mengubah collection Pair<T1, T2> menjadi
    //dua collection, collection T1 dan collection
    //T2

    val list5: List<Pair<String,String>> = listOf(
            "Itsuki" to "Doni",
            "Ichika" to  "Doni",
            "Azuka" to "Doni"
    )

    val pair: Pair<List<String>,List<String>> = list5.unzip()

    println(pair)



}







