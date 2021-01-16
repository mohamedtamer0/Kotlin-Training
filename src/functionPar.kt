fun main(args: Array<String>) {
    var res = Par()

    var result : Int
    result = res.printSum(3, 3)

    println(result)
}



class Par {
    fun printSum (a: Int, b : Int): Int {
        var c : Int

        c = a + b
        return c
    }
}