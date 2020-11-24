fun main(args: Array<String>) {
    fun string() {
        println("Hello World Fun!")
    }

    string()

    fun makeAnEntrance(line: String) {
        println(line)
    }


    makeAnEntrance("Hello There")

    fun calc(rebels:Int, ewoks: Int):Int {
        val goodGuys = rebels + ewoks
        return goodGuys
    }

    val rebels = calc(56, 6)
    println(rebels)


    fun vaderIsFeeling(mood: String = "Angry") {
        println(mood)
    }

    vaderIsFeeling()
    vaderIsFeeling("MEH")


}