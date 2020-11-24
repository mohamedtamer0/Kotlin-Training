fun main(args: Array<String>) {

    val name = "Tamer"
    val lastName = true
    println("Is "+ name + lastName)


//////////////////////////////////////////////

    val A = 3
    val b = 5
    println(A + b)


    val doubleNum = 123.45
    val floatNum = 123.45f

    val longNum = 12344556788L

    val aDouble  = A.toString()
    ///////////////////////////////

    ///Strings



    val str = "Hello world"
    println(str)
    val multistr = """Ajhgasfhgasd
        |gfsdgfjsdfjkaghdfjkgasdfgsef
        |askdfgbjsdfgj
    """.trimMargin()

    println(multistr)

    for (char in str) {
        println(char)
    }

    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()
    println(uppercase)
    println(lower)

    val  num  = 5
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(0, 3)
    println(subsequence)

    val luke = "Hello Luke"
    val lightSaberColor = "Green"
    val vehicle = "landspeeder"

    println("$luke has $lightSaberColor and $vehicle ${luke.length}")

    ///////////////////////////////////////////////////////////

    //Numbers

    val x = 12
    val y = 25

    println(y + x)
    println(y - x)
    println(y * x)
    println(y / x)
    println(y % x)







}


/////////////////////////////////////
//// Classes


