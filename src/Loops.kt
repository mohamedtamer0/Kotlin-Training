fun main(args: Array<String>) {
    val lists = arrayListOf("tamer","mohamed","ahmed")
    val mmaps = hashMapOf("solo" to "Falcon", "Luke" to "Landspeeder")


    for (list in lists) {
        println("Name : $list")
    }
    for ((key, value) in mmaps) {
        println("$key gets around in thier $value")
    }


    var f = 10

    while (f > 0) {
        println(f)
        f--
    }

}