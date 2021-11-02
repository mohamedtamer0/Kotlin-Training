package old

fun main(args: Array<String>) {


    for (x :Int in 1..20) {
        println(x)
    }

    println("=============")

    for (y :Int in 20 downTo 1) {
        println(y)
    }

    println("======================")

    for (i :Int in 1..5) {
        for(j: Int in 1..15) {
            print("*")
        }
        println("")
    }


}