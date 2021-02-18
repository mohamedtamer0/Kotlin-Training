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


    println("/////////////////////////////////////////////////////////")



    var myRange = 1..50

    for (c in myRange) {
        print(c)
        print(",")
    }

    println()
    println("////////////////////////////////////")

    for (v in 20 downTo 1) {
        print(v)
        print(",")
    }


    println()
    println("////////////////////////////////////")

    for (d in 40 downTo 1 step 3 ) {
        print(d)
        print(",")
    }
    println()
    println("////////////////////////////////////")

    val myCities = listOf("cairo", "giza", "Mansoura")

    for (city in myCities) {
        print(city)
        print(",")
    }










}



























