package app

fun main() {

    val multablelist = mutableListOf("Rem","Ichika","Nino","Miku")

    val multablereversed = multablelist.reversed()
    val multableasreversed = multablelist.asReversed()

    multablelist.add("Azuka") // Hanya Berlaku di multableasreversed tidak di multable reversed :)

    println(multablereversed)
    println(multableasreversed)





}