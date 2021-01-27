class Inner {

    var name : String? = null

    inner class BMW{

        fun printBMW() {
            name = "BMW"
            println("Car Name : $name")
        }
    }

}


fun main(args: Array<String>) {
    var inner = Inner().BMW()
    inner.printBMW()
}