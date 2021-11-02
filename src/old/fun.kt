package old

fun sayHello(greeting:String, vararg itemsToGreet: String) {
    itemsToGreet.forEach {
        itemsToGreet ->
        println("$greeting $itemsToGreet")
    }
}

fun greetperson(greeting: String = "Hello", name:String = "Kotlin") = println("$greeting $name")


fun main(args: Array<String>) {
    val arr = arrayOf("Kotlin", "Java")
    sayHello("Hi", *arr )
    greetperson(name = "Tamer")
}