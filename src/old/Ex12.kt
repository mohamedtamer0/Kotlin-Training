package old

open class Animal {
    open fun play() {
        println("DEF")
    }

    open fun sleep() {
        println("DEF")
    }

}


class Cat : Animal {
    var name : String? = null
    constructor() {

    }

    constructor(p_name :String) {
        this.name = p_name
        println("Nmae Is : ${this.name}")
    }

    constructor(s: String, s1: String)

    override fun play() {
        println("old.Cat Play ${this.name}")
    }

}


fun main(args: Array<String>) {
    var ov = Cat("Fluffy")
    ov.play()
    ov.sleep()
}