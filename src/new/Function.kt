package new

fun main() {
    purpleCow()
    purpleCow()

    sayHi()


//////////Single Line Expressions
    val age = 25
    fun singleLine() = if (age < 21) println("Less than 21") else println("Eligible")
    singleLine()


    //Named Parameters
    doWork(age = 25, name = "Mohamed Tamer")
}

fun purpleCow() {
    println("Hello Purple Cow")
    println("Hello Blue Cow")
}


////Functions inside of Functions
fun sayHi() {
    println("HIIIII!")

    fun sayBye() {
        println("BYEEEEEEEEE!")

        fun mow() {
            println("Moo!")
            println("Moo Moo Buckaroo!")
        }

        mow()
    }
    sayBye()
}



////Function Arguments
fun doWork(age: Int, name: String) {
    println("$name, you are $age")
}
















