package old

class Inner {

    var name : String? = null

    inner class BMW{

        fun printBMW() {
            name = "old.BMW"
            println("old.Car Name : $name")
        }
    }

}


fun main(args: Array<String>) {
    var inner = Inner().BMW()
    inner.printBMW()
}