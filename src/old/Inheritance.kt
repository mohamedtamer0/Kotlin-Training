package old

open class Inheritance : Shape {
    constructor() {

    }

    override fun printShape() {
        println("old.Inheritance")
    }

    fun Add1() {

    }
    fun Add2() {

    }

}


fun main(args: Array<String>) {
    var inher = Circle()
    inher.Add1()
}